[View
Javadoc](../../../../apidocs/net/swindle/springdemo/DiConstructorApp.md)

    1   package net.swindle.springdemo;
    2   
    3   import net.swindle.springdemo.domain.HumanResourceDept;
    4   import net.swindle.springdemo.domain.Organization;
    5   
    6   import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
    7   import org.springframework.context.ApplicationContext;
    8   import org.springframework.context.annotation.ComponentScan;
    9   import org.springframework.context.annotation.Configuration;
    10  import org.springframework.context.support.ClassPathXmlApplicationContext;
    11  
    12  /**
    13   * Main application.
    14   *
    15   * @author swindle
    16   */
    17  @Configuration
    18  @EnableAutoConfiguration
    19  @ComponentScan
    20  public class DiConstructorApp {
    21  
    22    /**
    23     * Runs the application.
    24     *
    25     * @param args Array of Strings
    26     */
    27    public static void main(String[] args) {
    28      // Create the application context (container)
    29      final ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");
    30  
    31      // Create the bean
    32      final Organization org = (Organization) ctx.getBean("myorg");
    33  
    34      // Invoke the company slogan via the bean
    35      System.out.println(org.corporateSlogan());
    36  
    37      final HumanResourceDept hr = (HumanResourceDept) ctx.getBean("myhrdept");
    38      System.out.println(hr.hiringStatus(5500));
    39  
    40      // Close the application context (container)
    41      ((ClassPathXmlApplicationContext) ctx).close();
    42    }
    43  }

-----

Copyright © 2017 [gregswindle](https://github.com/gregswindle). All
rights reserved.
