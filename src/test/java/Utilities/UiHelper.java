package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiHelper {

    public WebDriver loadWebDriver(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
        return(new ChromeDriver());
    }
}
