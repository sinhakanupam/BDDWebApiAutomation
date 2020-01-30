package StepDefinations;

import UiPageObject.DietHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FoodUiTest extends UiBaseTest {


    @Given("^User navigate to DietPlan website$")
    public void user_navigate_to_DietPlan_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

       // driver.findElement()

        driver.navigate().to("http://twggnhiringworkshop.herokuapp.com/");

    }

    @Then("^Diet Plan page should load sucessfully\\.$")
    public void diet_Plan_page_should_load_sucessfully() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String titel=driver.getTitle();
        Assert.assertEquals(titel,"Food Lookup Demo");
    }

    @Given("^User enters food item in search box$")
    public void user_enters_food_item_in_search_box() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("^User enters \"([^\"]*)\"$")
    public void user_enters(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        dietHomePage.enterText(arg1);
    }

    @Then("^DataTable should populate$")
    public void datatable_should_populate() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       int numberOfRows= dietHomePage.countRows();
       Assert.assertTrue(numberOfRows>0);

    }



}
