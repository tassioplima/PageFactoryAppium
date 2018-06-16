package page;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CalculadoraPage {
	
	public CalculadoraPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@AndroidFindBy (xpath = "//android.widget.Button[contains(@text,'1')]")
	private MobileElement numeroUm;
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text,2')]")
	private MobileElement numeroDois;
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@text,'+')]")
	private MobileElement soma;
	
	@AndroidFindBy (xpath = "//android.widget.Button[contains(@text,'=')]")
	private MobileElement resultado;

	public MobileElement getNumeroUm() {
		return numeroUm;
	}

	public MobileElement getNumeroDois() {
		return numeroDois;
	}

	public MobileElement getSoma() {
		return soma;
	}

	public MobileElement getResultado() {
		return resultado;
	}
	

}
