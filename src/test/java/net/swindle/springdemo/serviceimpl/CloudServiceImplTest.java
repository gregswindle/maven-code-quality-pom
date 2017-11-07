package net.swindle.springdemo.serviceimpl;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/beans-cp.xml")
// @ContextConfiguration("file:src/test/resources/test-beans-cp.xml")
public class CloudServiceImplTest {

  @Autowired private ApplicationContext ctx;

  @Autowired private CloudServiceImpl cloudService;

  @Test
  public void testOfferService() {
    cloudService = (CloudServiceImpl) ctx.getBean("cloudService");
    String statement = cloudService.offerService("CapitalOne");
    assertThat(statement, containsString("CapitalOne"));
  }
}
