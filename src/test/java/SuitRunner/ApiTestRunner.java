package SuitRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "src/test/Features",glue = "StepDefinations")
public class ApiTestRunner extends AbstractTestNGCucumberTests {
}

