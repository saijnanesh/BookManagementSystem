package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/UpdateAnOrder.feature" , glue = {"StepDefinition"})
public class BookManagementTestRunner {
	

}
