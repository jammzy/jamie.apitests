package Apiv3tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class v3test {

    @org.testng.annotations.Test
    public void apiv3SmokeTest() {
        String url = "http://api.pubnative.net/api/v3/native";
        Map<String, String> paramsMap =new HashMap<>();
        paramsMap.put("token", "tokenvalue");
        paramsMap.put("token1", "tokenvalue");
        given().header("content-type","...")
                .param("app_token","value")
                .params(paramsMap)
                .auth().basic("", "")
                .when()
                .get(url);
        Assert.assertEquals();

    }


}
