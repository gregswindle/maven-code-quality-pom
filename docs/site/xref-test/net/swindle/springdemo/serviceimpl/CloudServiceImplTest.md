[View
Javadoc](../../../../../testapidocs/net/swindle/springdemo/serviceimpl/CloudServiceImplTest.md)

    1   package net.swindle.springdemo.serviceimpl;
    2   
    3   import static org.hamcrest.CoreMatchers.containsString;
    4   import static org.junit.Assert.assertThat;
    5   
    6   import org.junit.Test;
    7   import org.junit.runner.RunWith;
    8   import org.springframework.beans.factory.annotation.Autowired;
    9   import org.springframework.context.ApplicationContext;
    10  import org.springframework.test.context.ContextConfiguration;
    11  import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
    12  
    13  @RunWith(SpringJUnit4ClassRunner.class)
    14  @ContextConfiguration("file:src/main/resources/beans-cp.xml")
    15  // @ContextConfiguration("file:src/test/resources/test-beans-cp.xml")
    16  public class CloudServiceImplTest {
    17  
    18    @Autowired private CloudServiceImpl cloudService;
    19  
    20    @Autowired private ApplicationContext ctx;
    21  
    22    @Test
    23    public void testOfferService() {
    24      cloudService = (CloudServiceImpl) ctx.getBean("cloudService");
    25      String statement = cloudService.offerService("CapitalOne");
    26      assertThat(statement, containsString("CapitalOne"));
    27    }
    28  }

-----

Copyright © 2017 [gregswindle](https://github.com/gregswindle). All
rights reserved.
