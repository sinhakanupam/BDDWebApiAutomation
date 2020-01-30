package UiPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static UiPageObject.XpathRepo.*;

public class DietHomePage {

    WebDriver driver;

    public DietHomePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@placeholder='Search foods...']")
    WebElement SearchBox;

    public void enterText(String data){
        SearchBox.sendKeys(data);
    }

    @FindBy(xpath = "//table[@class='ui selectable structured large table']//tbody//tr//td")
    WebElement tableData;

    public int countRows(){
        List<WebElement> trRows= driver.findElements(By.xpath("//table[@class='ui selectable structured large table']//tbody//tr"));
        return trRows.size();
    }
}
