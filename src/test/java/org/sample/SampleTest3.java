package org.sample;

import org.testng.annotations.DataProvider;

public class SampleTest3 {

	@DataProvider(name = "testData")
	public static Object[][] getTestData() {

		return new Object[][] {

				{ "iphone Mobile phone" }, { "Samsung Mobile phone" }, { "Lenovo laptop" }, { "Mi mobile phone" },
				{ "headphone" }, { "Airpod" }

		};

	}

}
