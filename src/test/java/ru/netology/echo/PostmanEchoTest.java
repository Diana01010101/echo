package ru.netology.echo;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class PostmanEchoTest {

    @Test
    void shouldReturnSendData() {
        var text = "Hi";
        given()
                .baseUri("https://postman-echo.com")
                .body("Hi")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Hi"));
    }


}
