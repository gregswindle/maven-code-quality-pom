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

// TODO: Auto-generated Javadoc
/** The Class AgencyRecruitmentServiceImplTest. */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/beans-cp.xml")
// @ContextConfiguration("file:src/test/resources/test-beans-cp.xml")
public class AgencyRecruitmentServiceImplTest {

  @Autowired private AgencyRecruitmentServiceImpl agency;

  @Autowired private ApplicationContext ctx;

  /** Before each. */
  @Before
  public void beforeEach() {
    agency = (AgencyRecruitmentServiceImpl) ctx.getBean("agency");
  }

  /** Test agency recruitment service impl. */
  @Test
  public void testAgencyRecruitmentServiceImpl() {
    agency = (AgencyRecruitmentServiceImpl) ctx.getBean("agency");
    assertNotNull(agency);
  }

  /** Test recruit employees. */
  @Test
  public void testRecruitEmployees() {
    final String companyName = "Verizon";
    final String departmentName = "HR";
    final String statement = agency.recruitEmployees(companyName, departmentName, 1);
    assertThat(statement, containsString(companyName));
    assertThat(statement, containsString(departmentName));
  }
}
