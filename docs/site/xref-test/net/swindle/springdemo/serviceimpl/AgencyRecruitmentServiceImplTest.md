[View
Javadoc](../../../../../testapidocs/net/swindle/springdemo/serviceimpl/AgencyRecruitmentServiceImplTest.md)

    1   package net.swindle.springdemo.serviceimpl;
    2   
    3   import static org.hamcrest.CoreMatchers.containsString;
    4   import static org.junit.Assert.assertNotNull;
    5   import static org.junit.Assert.assertThat;
    6   
    7   import org.junit.Before;
    8   import org.junit.Test;
    9   import org.junit.runner.RunWith;
    10  import org.springframework.beans.factory.annotation.Autowired;
    11  import org.springframework.context.ApplicationContext;
    12  import org.springframework.test.context.ContextConfiguration;
    13  import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
    14  
    15  @RunWith(SpringJUnit4ClassRunner.class)
    16  @ContextConfiguration("file:src/main/resources/beans-cp.xml")
    17  // @ContextConfiguration("file:src/test/resources/test-beans-cp.xml")
    18  public class AgencyRecruitmentServiceImplTest {
    19  
    20    @Autowired private AgencyRecruitmentServiceImpl agency;
    21  
    22    @Autowired private ApplicationContext ctx;
    23  
    24    @Before
    25    public void beforeEach() {
    26      agency = (AgencyRecruitmentServiceImpl) ctx.getBean("agency");
    27    }
    28  
    29    @Test
    30    public void testAgencyRecruitmentServiceImpl() {
    31      agency = (AgencyRecruitmentServiceImpl) ctx.getBean("agency");
    32      assertNotNull(agency);
    33    }
    34  
    35    @Test
    36    public void testRecruitEmployees() {
    37      String companyName = "Verizon";
    38      String departmentName = "HR";
    39      String statement = agency.recruitEmployees(companyName, departmentName, 1);
    40      assertThat(statement, containsString(companyName));
    41      assertThat(statement, containsString(departmentName));
    42    }
    43  }

-----

Copyright © 2017 [gregswindle](https://github.com/gregswindle). All
rights reserved.
