package stepDefinition;


import comparator.Compare;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import pages.CityPage;
import pages.LandingPage;
import resource.HttpMethods;
import utils.FileReaderForUI;
import utils.GetBrowser;
import utils.Log;

import org.apache.commons.lang3.Range;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Steps {
	FileReaderForUI reader;

	@Given("initiate the browser")
	public void initiate_the_browser() {
		Log.info("-----------Browser Opened---------------");
		reader = new FileReaderForUI();
		 new GetBrowser(reader.getValues("browser"));
	}

	@Then("close the browser")
	public void close_the_browser() {
		Log.info("---------------Browser Closed--------------");
		GetBrowser.driver.quit();
	}

	@Given("navigate to website")
	public void navigate_to_website() {
		reader = new FileReaderForUI();
		GetBrowser.driver.get(reader.getValues("url"));
	}

	@Given("input the city {string} to check the weather")
	public void input_the_city_to_check_the_weather(String string) {
		new LandingPage().acceptCookies().enterAndClick(string);
	}

	@Then("fetch the weather details")
	public void fetch_the_weather_details() {
		new CityPage().getWeatherDetails();
	}

	@Given("Getting the weather details for the {string} city")
	public void getting_the_weather_details_for_the_city(String string) {
		new HttpMethods().getMethod(string);
		Log.info("CityName Entered from API :"+string);
	}
	
	@Then("compare values from API and UI")
	public void compare_values_from_API_and_UI() {
	new Compare();
	}
}
