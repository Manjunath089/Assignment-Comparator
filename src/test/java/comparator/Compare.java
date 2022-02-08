package comparator;

import org.apache.commons.lang3.Range;

import pages.CityPage;
import resource.HttpMethods;
import utils.Log;

public class Compare {

	public Compare() {
		Log.info("Weather details retrieved from UI :" + CityPage.getWeatherDetialFromUI);
		Log.info("Weather details retrieved from API :" + HttpMethods.getWeatherDetialFromAPI);
		
		Range<Double> range = Range.between(Double.parseDouble(CityPage.getWeatherDetialFromUI) - 2,
				Double.parseDouble(CityPage.getWeatherDetialFromUI) + 2);
		if (range.contains((double) (HttpMethods.getWeatherDetialFromAPI)) == true) {
			Log.info("Both the values are in the acceptable range");
		} else {
			Log.warn("Both the values are NOT in the acceptable range");
		}
	}
}
