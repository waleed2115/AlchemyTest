package ApiAutomation.steps;

import ApiAutomation.endPoints;
import Utilities.RestAssured.ApiFields;
import Utilities.RestAssured.RestAssuredConnection;
import Utilities.RestAssured.RestAssuredUtil;
import io.cucumber.java.en.Given;
import io.restassured.specification.RequestSpecification;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;
import testConfigurations.configurations;

public class users {

    RequestSpecification request = null;

    @Given("Customer list should contain the user {string} with zipcode {string}")
    public void verifyAccount(String userName, String zipCode) {
        new RestAssuredConnection(configurations.baseURL);

        ApiFields.headerMap.clear();
        ApiFields.expectedResponseCode = 200;
        ApiFields.endPoint = endPoints.GET_USERS;

        request = RestAssuredConnection.getRequest();
        ApiFields.responseObject = RestAssuredUtil.get_request(request, ApiFields.headerMap, ApiFields.endPoint);
        ApiFields.responseObject.then().log().all().statusCode(ApiFields.expectedResponseCode);

        String expectedZipCode = null;

        JSONArray objArray = new JSONArray(ApiFields.responseObject.body().asString());

        for (int i = 0; i < objArray.length(); i++) {
            JSONObject objJson = objArray.getJSONObject(i);
            if (objJson.get("name").equals(userName)) {
                objJson = objJson.getJSONObject("address");
                expectedZipCode = objJson.get("zipcode").toString();
            }
        }

        Assert.assertEquals(expectedZipCode, zipCode);
    }
}
