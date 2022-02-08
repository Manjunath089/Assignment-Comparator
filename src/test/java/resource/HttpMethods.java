package resource;

import io.restassured.RestAssured;
import utils.FileReaderForUI;

public class HttpMethods {
	FileReaderForUI reader;
	public static float getWeatherDetialFromAPI;
	
	public void getMethod(String cityName) {	
		reader = new FileReaderForUI();
		getWeatherDetialFromAPI  = RestAssured.given()
				.queryParam(reader.getValues("cityname"), cityName)
				.queryParam(reader.getValues("key"), reader.getValues("keyvalue"))
				.queryParam(reader.getValues("unit"), reader.getValues("unitvalue"))
				.when().get(reader.getValues("apiurl"))
				.then().extract().path("main.temp");	
	}

}
