[View
Javadoc](../../../../../testapidocs/net/swindle/springdemo/domain/OrganizationTest.md)

    1   package net.swindle.springdemo.domain;
    2   
    3   import static org.junit.Assert.assertNotNull;
    4   
    5   import org.junit.Test;
    6   import org.junit.runner.RunWith;
    7   import org.springframework.beans.factory.annotation.Autowired;
    8   import org.springframework.context.ApplicationContext;
    9   import org.springframework.test.context.ContextConfiguration;
    10  import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
    11  
    12  import net.swindle.springdemo.serviceimpl.CloudServiceImpl;
    13  
    14  @RunWith(SpringJUnit4ClassRunner.class)
    15  @ContextConfiguration("file:src/main/resources/beans-cp.xml")
    16  // @ContextConfiguration("file:src/test/resources/test-beans-cp.xml")
    17  public class OrganizationTest {
    18  
    19    @Autowired private ApplicationContext ctx;
    20  
    21    @Autowired private Organization myorg;
    22  
    23    @SuppressWarnings("unused")
    24    @Autowired
    25    private CloudServiceImpl cloudService;
    26  
    27    @Test
    28    public void testContext() {
    29      assertNotNull(ctx.getBean("myorg"));
    30    }
    31  
    32    @Test
    33    public void testCorporateService() {
    34      assertNotNull(myorg.toString());
    35      assertNotNull(myorg.corporateService());
    36    }
    37  }

-----

Copyright © 2017 [gregswindle](https://github.com/gregswindle). All
rights reserved.
