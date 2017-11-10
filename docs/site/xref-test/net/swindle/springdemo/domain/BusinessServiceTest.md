[View
Javadoc](../../../../../testapidocs/net/swindle/springdemo/domain/BusinessServiceTest.md)

    1   package net.swindle.springdemo.domain;
    2   
    3   import static org.junit.Assert.*;
    4   
    5   import org.junit.Test;
    6   import org.junit.runner.RunWith;
    7   import org.springframework.test.context.ContextConfiguration;
    8   import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
    9   
    10  import net.swindle.springdemo.service.BusinessService;
    11  
    12  @RunWith(SpringJUnit4ClassRunner.class)
    13  @ContextConfiguration("file:src/main/resources/beans-cp.xml")
    14  public class BusinessServiceTest {
    15  
    16    @Test
    17    public void testRevenue() {
    18      final int actual = 1000000;
    19      assertEquals(BusinessService.revenue, actual);
    20      assertEquals(BusinessService.revenue, actual);
    21    }
    22  }

-----

Copyright © 2017 [gregswindle](https://github.com/gregswindle). All
rights reserved.
