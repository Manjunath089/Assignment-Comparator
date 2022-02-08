package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import stepDefinition.Steps;
import utils.Log;

public class CityPage {
	
	@FindBy(how = How.XPATH, using = "(//div[@class='temp'])[1]")
	private WebElement getWeatherDetails;
	
	WebDriver driver;
	public static String getWeatherDetialFromUI;
	
	public CityPage() {
		PageFactory.initElements(new AjaxElementLocatorFactory(Steps.driver, 20), this);
	}
	
	public CityPage getWeatherDetails() {
		try {
		getWeatherDetialFromUI = getWeatherDetails.getText().substring(0, 2);
		Log.info("Retrieved the temperature of the city");
		}catch(Exception e) {
			Log.warn("Unable to retrieve city name");
			Steps.driver.quit();
		}
		return new CityPage();
	}

}
