package ruan.nunes;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class MyLivenessCheckTest {
    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/q/health/live")
          .then()
             .statusCode(200)
             .body(is("alive"));
    }

}