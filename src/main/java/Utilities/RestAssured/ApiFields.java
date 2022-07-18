package Utilities.RestAssured;

import io.restassured.response.Response;
import java.util.HashMap;
import java.util.Map;

public class ApiFields {

    public static Response responseObject;
    public static int expectedResponseCode;
    public static Map<String, Object> headerMap = new HashMap<>();
    public static String endPoint;
}
