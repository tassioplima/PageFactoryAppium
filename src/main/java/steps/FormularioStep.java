package steps;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import funcionalidade.FormularioFuncionalidade;

public class FormularioStep {

	private FormularioFuncionalidade formulario = new FormularioFuncionalidade();


	@Dado("^que acessei o formulario$")
	public void queAcesseiOFormulario() {
		formulario.acessarFormulario();
	}

	@Quando("^inserir o \"([^\"]*)\" no formulario$")
	public void inserirONoFormulario(String nome)  {
		formulario.inserirNome(nome);
	}

	@Quando("^salvei os dados$")
	public void salveiOsDados()  {
		formulario.salvarDado();
	}

	@Entao("^será validado o nome \"([^\"]*)\" no formulario$")
	public void seraValidadoONomeNoFormulario(String nome) {

		String validarNome = formulario.validarNome();
		assertEquals(nome, validarNome);
		
	}


}
