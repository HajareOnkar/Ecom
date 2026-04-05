package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/resources/FeatureFile",
		glue="Stepdefs",
		plugin={"pretty",
			    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			    "rerun:target/failedTC.txt"
			},
		tags="@smoke"
		)
public class Runnerclass extends AbstractTestNGCucumberTests {

}
