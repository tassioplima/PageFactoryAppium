package core;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;

import core.enums.InitApps;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Basic {

	private static  AndroidDriver driver; 
	private  DesiredCapabilities capabilities = new DesiredCapabilities();

	public static AndroidDriver getDriver() {
		if (driver == null) {
			initDriver();
		}
		return driver;
	}
	
	@BeforeClass
	public void setup() {
		
		initDriver();
	}
	
	

	private static void initDriver() {
		
		Scanner scanner = null;
		try {
			scanner = new Scanner(Runtime.getRuntime().exec(new String[] { "cmd.exe","/c", "adb get-serialno"})
					.getInputStream());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		String deviceSerialNumber = (scanner != null && scanner.hasNext()) ? scanner.next() : "";
		scanner.close();

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceSerialNumber);
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability("noReset", true);
		//cap.setCapability(MobileCapabilityType.FULL_RESET, true);
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		cap.setCapability(MobileCapabilityType.APP, ".\\resources\\CTAppium.apk");
		//cap.setCapability("appPackage", InitApps.CALC_PACKAGE);
		//cap.setCapability("appActivity", InitApps.CALC_ACTIVITY);

		driver = new AndroidDriver(cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void killDriver() {

		if (driver != null) {
			driver.quit();
			driver = null;

		}
	}
	


}
