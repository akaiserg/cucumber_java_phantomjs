package steps;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features/Form.feature",
		format  = {"pretty", "html:build/cucumber-html-report","json:cucumber.json"},
		tags = {}
		)
public class RunCucumberTest{
	
}