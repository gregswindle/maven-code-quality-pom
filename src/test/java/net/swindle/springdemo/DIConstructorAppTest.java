package net.swindle.springdemo;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/resources/beans-cp.xml")
// @ContextConfiguration("file:src/test/resources/test-beans-cp.xml")
public class DIConstructorAppTest {

	@Rule
	public OutputCapture capture = new OutputCapture();

	// @Test
	// public void testExistenceOfApp() {
	// assertNotNull(DIConstructorApp.class);
	// }

	@Test
	public void testMain() {
		String[] args = { null };
		DIConstructorApp.main(args);
		String output = capture.toString();
		assertThat(output, containsString("To organize the worlds information"));
		assertThat(output, containsString("Human Resource Department"));
	}

}
