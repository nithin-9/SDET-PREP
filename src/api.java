//import io.restassured.RestAssured;
//import io.restassured.http.ContentType;
//import io.restassured.response.Response;
//
//import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;
//
//public class api {
//
//    public static void main(String[] args) {
//        // Set base URI
//        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
//
//        // Create a JSON request body
//        String requestBody = "{\n" +
//                "  \"title\": \"foo\",\n" +
//                "  \"body\": \"bar\",\n" +
//                "  \"userId\": \"1\"\n" +
//                "}";
//
//        // Send POST request with headers and request body
//        Response response = given()
//                .header("Authorization", "Bearer your_token_here")  // Add an Authorization header
//                .header("Custom-Header", "CustomValue")             // Add a custom header
//                .contentType(ContentType.JSON)                      // Set content type to JSON
//                .body(requestBody)                                  // Attach request body
//                .when()
//                .post("/posts")                                     // Send POST request
//                .then()
//                .statusCode(201)                                    // Validate status code
//                .body("title", equalTo("foo"))                      // Validate response body
//                .extract().response();
//
//        // Print the response
//        System.out.println("Response Body: " + response.asString());
//    }
//}
