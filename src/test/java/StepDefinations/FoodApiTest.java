package StepDefinations;

import ApiDataObject.FoodDetailsDataObject;
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;

import javax.sql.rowset.Predicate;
import java.util.List;

public class FoodApiTest extends ApiBaseTest {



    @Given("^Get request is created$")
    public void get_request_is_created() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //apiHelper.sendApiRequest()


    }

    @When("^Form parameter with value is \"([^\"]*)\" and request is sent$")
    public void form_parameter_with_value_is_and_request_is_sent(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String valueEncodedUrl;
        valueEncodedUrl=baseUrl+"food?q="+arg1;
        Response response=apiHelper.sendApiRequest("GET",valueEncodedUrl,null);
        Gson gson= new Gson();
        List<LinkedTreeMap> responseData = gson.fromJson(response.print(),List.class);
        responseData.forEach(item->{
                Assert.assertTrue(item.get("description").toString().contains(arg1));
        });
    }

    @Then("^Validate response contains record with description having substring as data\\.$")
    public void validate_response_contains_record_with_description_having_substring_as_data() throws Throwable {
        // Write code here that turns the phrase above into concrete actions



    }
}
