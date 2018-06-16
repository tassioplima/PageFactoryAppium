package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import funcionalidade.CalculadoraFuncionalidade;

public class CalculadoraStep {
	
	private CalculadoraFuncionalidade calculadora = new CalculadoraFuncionalidade();
	
	
	@Dado("^que acessei a calculadora$")
	public void que_acessei_a_calculadora() {
		
	}

	@Quando("^eu somar (\\d+) \\+ (\\d+)$")
	public void eu_somar(int arg1, int arg2){
		calculadora.clicarElementos();
	}
	
	@Quando("^selecione a soma$")
	public void selecione_a_soma() {
		calculadora.clicarSoma();
		
	}

	@Entao("^o resultado será  (\\d+)$")
	public void o_resultado_será(int arg1) {
		calculadora.resultador();
		
	}
	
	@Quando("^eu somar$")
	public void eu_somar() throws Throwable {
		calculadora.clicarElementos();
	}

	@Quando("^selecionar a soma$")
	public void selecionar_a_soma() throws Throwable {
		calculadora.clicarSoma();
	}

	@Entao("^o resultado será$")
	public void o_resultado_será() throws Throwable {
		calculadora.resultador();
	}


}
