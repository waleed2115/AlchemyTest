package Utilities.RestAssured;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;
import java.util.Map;

public class RestAssuredUtil {

    public static Response get_request(
        RequestSpecification request,
        Map<String, Object> api_headerMap,
        String api_path
    ) {
        request.headers(api_headerMap);
        return request.get(api_path);
    }
}
