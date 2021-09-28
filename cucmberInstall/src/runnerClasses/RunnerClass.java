package runnerClasses;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features= {"src/Features"},
		glue = {"stepDefinitions"},
		plugin= {"pretty","html:target/cucumber-reports"},
		tags = {"@regression, @smoke"}
		)

public class RunnerClass {

}