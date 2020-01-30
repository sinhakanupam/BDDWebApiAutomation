package Utilities;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class ApiHelper {

    public Response sendApiRequest(String method, String url, String payload){
        RequestSpecification spec= given();

        //can implement authentication and header configuration as per api requirement.
        if(payload!=null){
            spec=spec.body(payload);
        }
        Response response=spec.request(method,url).then().extract().response();
        return response;
    }

}
