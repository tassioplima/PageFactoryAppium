package funcionalidade;

import io.appium.java_client.android.AndroidDriver;
import page.FormularioPage;

public class FormularioFuncionalidade {

	
	private AndroidDriver  driver;
	private FormularioPage formulario = new FormularioPage(driver);
	
	public void acessarFormulario() {
		
		formulario.getAcessarFormulario().click();
		
	}
	
	public void inserirNome(String nome) {
		formulario.getInserirNome().sendKeys(nome);
	}
	
	public void salvarDado() {
		formulario.getSalvarDados().click();
		
	}
	
	public String validarNome() {
		
		return formulario.getValidarNome().getText();
		
	}

}
