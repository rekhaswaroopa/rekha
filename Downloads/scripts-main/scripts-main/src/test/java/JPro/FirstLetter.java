package JPro;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.*;


import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.io.File;



public class FirstLetter {

    public static void main(String[] args) {

        String str = "My name is varun";
        char[] ch=str.toCharArray();
//        StringBuilder sb=new StringBuilder();

        for (int i=0; i<ch.length; i++)
        {
            if (i==0)
            {
                System.out.print(ch[i]);
            }
            else if (ch[i]==' ')
            {
                System.out.print(ch[i+1]);
            }
        }
    }


    @Test
    public void test()
    {
            given()
                .contentType(ContentType.JSON)
                .body("")

                .when()
                .post(" ")

                .then()
                    .assertThat()
                .statusCode(201)
                .statusLine("created")
                .time(lessThan(2000L))
                .header("server", equalTo("ty"))
                .body("page",equalTo(2));
    }

    long petId;

    @Test
    public void createPet()
    {
        System.out.println("---createPet----");
        File jsonFile=new File(" ");
        Response createPetResponse= given()
                .contentType(ContentType.JSON)
                .body(jsonFile)

                .when()
                .post(" ");

        createPetResponse.then().log().all();

        petId= createPetResponse.jsonPath().getLong("id");

    }

    @Test(dependsOnMethods = "createPet")
    public  void updatePet()
    {

        given()
                .pathParam("petId", petId)
                .formParam("name", "john")
                .formParam("status", "available")

                .when()
                .put("https://mvnrepository.com/artifact/io.rest-assured/rest-assured/{petId}")

                .then()
                .log().all();
    }


    @Test(dependsOnMethods = "updatePet")
    public void getPet()
    {

        given()
                .pathParam("petId", petId)

                .when()
                .get("https://mvnrepository.com/artifact/io.rest-assured/rest-assured/{petId}")

                .then().log().all();
    }

    @Test(dependsOnMethods = "getPet")
    public void deletePet()
    {

        given().
                pathParam("petId", petId)

                .when().delete("https://mvnrepository.com/artifact/io.rest-assured/rest-assured/{petId}")

                .then().log().all();
    }
}