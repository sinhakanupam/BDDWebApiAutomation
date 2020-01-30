package SuitRunner;

import StepDefinations.UiBaseTest;
import Utilities.UiHelper;
import com.sun.xml.fastinfoset.sax.Features;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import gherkin.formatter.model.Feature;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

@CucumberOptions(features="src/test/features",glue = "StepDefinations")
public class UiTestRunner extends AbstractTestNGCucumberTests {

    @BeforeSuite
    public void loadWebDriver(){
        UiBaseTest.setDriver(new UiHelper().loadWebDriver());
    }

    @AfterSuite
    public void killDriver(){
        UiBaseTest.killDriver();

    }

}
