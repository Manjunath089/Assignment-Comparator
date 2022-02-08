package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import stepDefinition.Steps;
import utils.Log;

public class LandingPage {

	@FindBy(how = How.XPATH, using = "//*[@id='privacy-policy-banner']/div/div")
	private WebElement acceptCookies;

	@FindBy(how = How.XPATH, using = "//form[@class='search-form']/input")
	private WebElement searchElement;

	public LandingPage() {
		PageFactory.initElements(new AjaxElementLocatorFactory(Steps.driver, 20), this);
	}

	public LandingPage acceptCookies() {
		try {
			acceptCookies.click();
			Log.info("Accepted Cookies");
		} catch (Exception e) {
			Log.warn("Unable to accept cookies");
			Steps.driver.quit();
		}
		return new LandingPage();
	}

	public LandingPage enterAndClick(String cityname) {
		try {
		new Actions(Steps.driver).sendKeys(searchElement, cityname).sendKeys(Keys.ENTER).build().perform();
		Log.info("City Name Entered :" + cityname);
		}catch(Exception e) {
			Log.warn("Unable to enter city name");
			Steps.driver.quit();
		}
		return new LandingPage();
	}

}
