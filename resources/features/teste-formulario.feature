# language: pt

@Funcionalidade
Funcionalidade: Realizar ação no formulário

	@TESTELOGIN002
	Esquema do Cenario: Teste formulario
	Dado que acessei o formulario
	Quando inserir o <nome> no formulario
	E salvei os dados
	Entao será validado o nome <nomeValidacao> no formulario
	
	Exemplos:
	| nome 		| nomeValidacao |
	| "Tassio"| "Tassio"      |