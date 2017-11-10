package net.swindle.springdemo.serviceimpl;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/beans-cp.xml")
// @ContextConfiguration("file:src/test/resources/test-beans-cp.xml")
public class AgencyRecruitmentServiceImplTest {

  @Autowired private AgencyRecruitmentServiceImpl agency;

  @Autowired private ApplicationContext ctx;

  @Before
  public void beforeEach() {
    agency = (AgencyRecruitmentServiceImpl) ctx.getBean("agency");
  }

  @Test
  public void testAgencyRecruitmentServiceImpl() {
    agency = (AgencyRecruitmentServiceImpl) ctx.getBean("agency");
    assertNotNull(agency);
  }

  @Test
  public void testRecruitEmployees() {
    String companyName = "Verizon";
    String departmentName = "HR";
    String statement = agency.recruitEmployees(companyName, departmentName, 1);
    assertThat(statement, containsString(companyName));
    assertThat(statement, containsString(departmentName));
  }
}
