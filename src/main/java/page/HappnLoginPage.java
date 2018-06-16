package page;

import core.Driver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

	


public class HappnLoginPage extends Driver {
	
	@AndroidFindBy (xpath = "//android.widget.Button[contains(@text,'Connect with Facebook')]")
	private MobileElement logarFacebook;
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'ALLOW')]")
	private MobileElement allowButton;
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'LATER')]")
	private MobileElement laterAds;
	
	@AndroidFindBy (xpath = "")
	private MobileElement disableCrush;
	
	@AndroidFindBy(xpath = "")
	private MobileElement enableCrush;
	
	
}
