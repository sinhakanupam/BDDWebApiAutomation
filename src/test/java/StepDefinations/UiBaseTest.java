package StepDefinations;

import UiPageObject.DietHomePage;
import Utilities.UiHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class UiBaseTest {

    public final UiHelper uiHelper= new UiHelper();
    public DietHomePage dietHomePage= new DietHomePage(driver);


    public static WebDriver driver;

    public static void setDriver(WebDriver driver) {
        UiBaseTest.driver = driver;
    }

    public static void killDriver(){
        UiBaseTest.driver.close();

    }

}
