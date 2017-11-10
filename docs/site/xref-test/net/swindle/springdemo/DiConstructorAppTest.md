[View
Javadoc](../../../../testapidocs/net/swindle/springdemo/DiConstructorAppTest.md)

    1   package net.swindle.springdemo;
    2   
    3   import static org.hamcrest.Matchers.containsString;
    4   import static org.junit.Assert.assertNotNull;
    5   import static org.junit.Assert.assertThat;
    6   
    7   import org.junit.Rule;
    8   import org.junit.Test;
    9   import org.junit.runner.RunWith;
    10  import org.springframework.boot.test.rule.OutputCapture;
    11  import org.springframework.test.context.ContextConfiguration;
    12  import org.springframework.test.context.junit4.SpringRunner;
    13  
    14  @RunWith(SpringRunner.class)
    15  @ContextConfiguration("file:src/main/resources/beans-cp.xml")
    16  // @ContextConfiguration("file:src/test/resources/test-beans-cp.xml")
    17  public class DiConstructorAppTest {
    18  
    19    @Rule public OutputCapture capture = new OutputCapture();
    20  
    21    @Test
    22    public void testExistenceOfApp() {
    23      assertNotNull(DiConstructorApp.class);
    24      DiConstructorApp app = new DiConstructorApp();
    25      assertNotNull(app);
    26    }
    27  
    28    @Test
    29    public void testMain() {
    30      String[] args = {null};
    31      DiConstructorApp.main(args);
    32      String output = capture.toString();
    33      assertThat(output, containsString("To organize the worlds information"));
    34      assertThat(output, containsString("Human Resource Department"));
    35    }
    36  }

-----

Copyright © 2017 [gregswindle](https://github.com/gregswindle). All
rights reserved.
