[View
Javadoc](../../../../../testapidocs/net/swindle/springdemo/serviceimpl/EcommerceServiceImplTest.md)

    1   package net.swindle.springdemo.serviceimpl;
    2   
    3   import static org.hamcrest.CoreMatchers.containsString;
    4   import static org.junit.Assert.assertThat;
    5   
    6   import org.junit.Test;
    7   import org.junit.runner.RunWith;
    8   import org.springframework.beans.factory.annotation.Autowired;
    9   import org.springframework.test.context.ContextConfiguration;
    10  import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
    11  
    12  @RunWith(SpringJUnit4ClassRunner.class)
    13  @ContextConfiguration("file:src/main/resources/beans-cp.xml")
    14  public class EcommerceServiceImplTest {
    15  
    16    @Autowired private EcommerceServiceImpl ecommerceService;
    17  
    18    @Test
    19    public void testOfferService() {
    20      assertThat(
    21          ecommerceService.offerService("YoYoDyne"), containsString("As an Organization, YoYoDyne"));
    22    }
    23  }

-----

Copyright © 2017 [gregswindle](https://github.com/gregswindle). All
rights reserved.
