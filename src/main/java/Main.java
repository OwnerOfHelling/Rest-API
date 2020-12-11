import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class Main {

    public static void main(String[] args) {

        // Создание карточки CardForAPI

    Map<String, Object> params = new HashMap<>();
    params.put("key", "0b182f418e5ea1c662a538c98fdafcd3");
    params.put("token", "43569771ce9974af3836bf501b0df75fd70ba25dbdfdf655975d18128df11a30");
    params.put("name", "CardForAPI");
    params.put("idList", "5fd246687de92d3b7979eae9");
    String cardID = given().baseUri("https://api.trello.com").queryParams(params).contentType("application/json; charset=utf-8")
            .when().post("/1/cards")
            .then().statusCode(200).extract().path("id");
        System.out.println(cardID);

        // Создание карточки CardForDelete

        /*params.put("key", "0b182f418e5ea1c662a538c98fdafcd3");
        params.put("token", "43569771ce9974af3836bf501b0df75fd70ba25dbdfdf655975d18128df11a30");
        params.put("name", "CardForDelete");
        params.put("idList", "5fd246687de92d3b7979eae9");
        String cardID = given().baseUri("https://api.trello.com").queryParams(params).contentType("application/json; charset=utf-8")
                .when().post("/1/cards")
                .then().statusCode(200).extract().path("id");
        System.out.println(cardID);*/

        // Добавление текста в карточку CardForAPI

        /*params.put("id", "5fd32bb060773288c5a82610");
        params.put("key", "0b182f418e5ea1c662a538c98fdafcd3");
        params.put("token", "43569771ce9974af3836bf501b0df75fd70ba25dbdfdf655975d18128df11a30");
        params.put("desc", "Test for API");
            given().baseUri("https://api.trello.com").queryParams(params).contentType("application/json; charset=utf-8")
                .when().put("/1/cards/{id}", "5fd32bb060773288c5a82610")
                .then().statusCode(200);*/

        // Создание еще одного листа ApiList

        /*params.put("key", "0b182f418e5ea1c662a538c98fdafcd3");
        params.put("token", "43569771ce9974af3836bf501b0df75fd70ba25dbdfdf655975d18128df11a30");
        params.put("name", "ApiList");
        params.put("idBoard", "5fd236a0d7ce3878205becaf");
            given().baseUri("https://api.trello.com").queryParams(params).contentType("application/json; charset=utf-8")
                    .when().post("/1/lists")
                    .then().statusCode(200);*/

        // Перемещение карточки CardForAPI в лист ApiList

        /*params.put("id", "5fd32bb060773288c5a82610");
        params.put("key", "0b182f418e5ea1c662a538c98fdafcd3");
        params.put("token", "43569771ce9974af3836bf501b0df75fd70ba25dbdfdf655975d18128df11a30");
        params.put("idList", "5fd32d70d3da050cbe28f917");
            given().baseUri("https://api.trello.com").queryParams(params).contentType("application/json; charset=utf-8")
                .when().put("/1/cards/{id}", "5fd32bb060773288c5a82610")
                .then().statusCode(200);*/

        // Удаление карточки CardForDelete

        /*params.put("id", "5fd321c9f072b71c2c37c8a4");
        params.put("key", "0b182f418e5ea1c662a538c98fdafcd3");
        params.put("token", "43569771ce9974af3836bf501b0df75fd70ba25dbdfdf655975d18128df11a30");
        given().baseUri("https://api.trello.com").queryParams(params).contentType("application/json; charset=utf-8")
                .when().delete("/1/cards/{id}", "5fd321c9f072b71c2c37c8a4")
                .then().statusCode(200);*/

    }



}
