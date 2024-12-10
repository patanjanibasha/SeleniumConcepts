package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/featurefiles/adminlogin.feature", // Path to your feature file
    glue = "stepdefinitions", // The package where your step definition classes are located
    dryRun = false // Set to false to execute the actual tests
)
public class AdminTest 
{
	
}
