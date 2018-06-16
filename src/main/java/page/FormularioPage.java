package page;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FormularioPage {
	
	public FormularioPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	@AndroidFindBy (xpath = "//android.widget.TextView[contains(@text'Formulário')]" )
	private MobileElement acessarFormulario;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"nome\"]" )
	private MobileElement inserirNome;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc='save']/android.widget.TextView" )
	private MobileElement salvarDados;

	public MobileElement getAcessarFormulario() {
		return acessarFormulario;
	}

	public MobileElement getInserirNome() {
		return inserirNome;
	}

	public MobileElement getSalvarDados() {
		return salvarDados;
	}

	public MobileElement getValidarNome() {
		return validarNome;
	}

	@AndroidFindBy (xpath = "//android.widget.TextView[starts-with(@text,'Nome')]")
	private MobileElement validarNome;
	
}
