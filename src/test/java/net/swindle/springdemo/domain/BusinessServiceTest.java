package net.swindle.springdemo.domain;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import net.swindle.springdemo.service.BusinessService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/resources/beans-cp.xml")
public class BusinessServiceTest {

  @Test
  public void testRevenue() {
    final int actual = 1000000;
    assertEquals(BusinessService.revenue, actual);
    assertEquals(BusinessService.revenue, actual);
  }
}
