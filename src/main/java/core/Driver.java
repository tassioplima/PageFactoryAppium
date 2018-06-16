package core;

import io.appium.java_client.android.AndroidDriver;

public class Driver extends Basic {

	protected AndroidDriver driver;

	public Driver() {
		super();
		this.driver = super.getDriver();

	}

}
