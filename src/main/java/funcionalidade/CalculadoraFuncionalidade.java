package funcionalidade;

import core.Driver;
import page.CalculadoraPage;

public class CalculadoraFuncionalidade extends Driver {
	
	private CalculadoraPage calculadora = new CalculadoraPage(driver);
	
	public void clicarElementos() {
		
		calculadora.getNumeroDois().click();
		calculadora.getNumeroDois().click();
	}
	
	public void clicarSoma() {
		calculadora.getSoma().click();
	}
	
	public void resultador() {
		calculadora.getResultado().click();
	}
	
}
