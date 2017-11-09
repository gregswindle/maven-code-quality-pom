package net.swindle.springdemo.serviceimpl;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/beans-cp.xml")
public class EcommerceServiceImplTest {

  @Autowired private EcommerceServiceImpl ecommerceService;

  @Test
  public void testOfferService() {
    assertThat(
        ecommerceService.offerService("YoYoDyne"), containsString("As an Organization, YoYoDyne"));
  }
}
