package common;

import java.util.HashMap;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestCalls {

	public static void postMethod(HashMap<String, String> dataMap) {

		RestAssured.baseURI = "http://localhost:3000/";
		RequestSpecification rs = RestAssured.given();

		JSONObject bodyObj = new JSONObject();
		bodyObj.put("firstName", dataMap.get("firstName"));
		bodyObj.put("lastName", dataMap.get("lastName"));
		bodyObj.put("subjectId", Integer.parseInt(dataMap.get("subjectId").split("\\.")[0]));

		rs.body(bodyObj.toString());
		rs.header("Content-Type", "application/json");

		Response resp = rs.post("/users");

		resp.prettyPrint();
		

	}

	public static void putMethod(String str) {



	}

	public static void getMethod(String str) {

		Response resp = RestAssured.get("https://reqres.in/api/users?page=" + str);
		resp.prettyPrint();

	}

}
