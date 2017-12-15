package net.swindle.springdemo.domain;

import static org.junit.Assert.assertNotNull;

import net.swindle.springdemo.serviceimpl.CloudServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/beans-cp.xml")
// @ContextConfiguration("file:src/test/resources/test-beans-cp.xml")
public class OrganizationTest {

  @Autowired private ApplicationContext ctx;

  @Autowired private Organization myorg;

  @SuppressWarnings("unused")
  @Autowired
  private CloudServiceImpl cloudService;

  @Test
  public void testContext() {
    assertNotNull(ctx.getBean("myorg"));
  }

  @Test
  public void testCorporateService() {
    assertNotNull(myorg.toString());
    assertNotNull(myorg.corporateService());
  }
}
