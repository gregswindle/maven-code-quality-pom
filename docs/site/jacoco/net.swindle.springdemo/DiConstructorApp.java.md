[Sessions](../jacoco-sessions.md)[maven-code-quality-pom](../index.md)
\> [net.swindle.springdemo](index.source.md) \> DiConstructorApp.java

# DiConstructorApp.java

``` source lang-java  
package net.swindle.springdemo;

import net.swindle.springdemo.domain.HumanResourceDept;
import net.swindle.springdemo.domain.Organization;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Main application.
 *
 * @author swindle
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class DiConstructorApp {

  /**
   * Runs the application.
   *
   * @param args Array of Strings
   */
  public static void main(String[] args) {
    // Create the application context (container)
    final ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");

    // Create the bean
    final Organization org = (Organization) ctx.getBean("myorg");

    // Invoke the company slogan via the bean
    System.out.println(org.corporateSlogan());

    final HumanResourceDept hr = (HumanResourceDept) ctx.getBean("myhrdept");
    System.out.println(hr.hiringStatus(5500));

    // Close the application context (container)
    ((ClassPathXmlApplicationContext) ctx).close();
  }
}
```

Created with [JaCoCo](http://www.jacoco.org/jacoco) 0.7.9.201702052155
