package activities;

import static io.restassured.RestAssured.given;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GitHubRestAssuredProject {
    // Declare request specification
    RequestSpecification requestSpec;
    String sshKey;
    int id;

    @BeforeClass
    public void setUp() {
        // Create request specification
        requestSpec =  new RequestSpecBuilder()
                // Set content type
                .setContentType(ContentType.JSON)
                // Set Token Authentication
                .addHeader("Authorization", "token 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")
                // Set base URL
                .setBaseUri("https://api.github.com")
                // Build request specification
                .build();
        
        sshKey = "ssh-rsa ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABgQC1jAdiE1frBMHJoSg61iBMHfPLivJd4LQubcWRkm04tt4foN3zmUuYPQ0Mzo/YdoryYKeRuQ2XwWdJJqFlOa8FeqEBGuA10r7GNVzBOyCrUDZuJeJFCJs5la8RmMnWAEYPBZ49dCmFVp09hV0eXjr0x9ka9F8kOKy9vK0VEjCW3326srtguMNci2GdP/ykaR0f3LC2ylZV/321S6gjOng/1T93dxL4h8w4m5axm/+lTjoWvlQnKOcHfqXMm+iaDd84EzFacgITge+nJY8eiaww9tWHaqaJM8K0nCfoj13yu67nZTUPWsucjN8AneiC3UPwmS7tOeiwBEsRajjfWmrJK+K474JWvN2cq+LP8oRqnm3F4TeRgC725cFzXkpjspyQ7q37doM1+dKsG62WygtraHUlvtj+2a6ITOp/7P2eFcXnDn/gHVk07efM/x6O0doPzxaqSwJ/uo/XJeQFn09Y9hbp2XHuJ9KHzE3a2UWfuC9UxO2278JFhL/YpXV9E1E=";
        
    }

    @Test(priority=1)
    public void addKeys() {
        String reqBody = "{\"title\": \"TestKey\":, \"key\" \""+ sshKey +"\"}";
        Response response = given().spec(requestSpec) // Use requestSpec
                .body(reqBody) // Send request body
                .when().post("/user/keys"); // Send POST request

        String resBody = response.getBody().asPrettyString(); // Send request body
        System.out.println(resBody);
        id = response.then().extract().path("id");

        // Assertions
        response.then().statusCode(201);
    }

    @Test(priority=2)
    public void getKeys() {
        Response response = given().spec(requestSpec) // Use requestSpec
                .when().get("/user/keys"); // Send GET request
        
        String resBody = response.getBody().asPrettyString();
        System.out.println(resBody);
        
        // Assertions
        response.then().statusCode(200);
    }
    
    @Test(priority=3)
    public void deleteKeys() {
        Response response = given().spec(requestSpec) // Use requestSpec
                .pathParam("keyId", id) // Add path parameter
                .when().delete("/user/keys/{keyId}"); // Send GET request
        
        String resBody = response.getBody().asPrettyString();
        System.out.println(resBody);

        // Assertions
        response.then().statusCode(204);
    }

}