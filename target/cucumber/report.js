$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("teste-formulario.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 4,
  "name": "Realizar ação no formulário",
  "description": "",
  "id": "realizar-ação-no-formulário",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 3,
      "name": "@Funcionalidade"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Teste formulario",
  "description": "",
  "id": "realizar-ação-no-formulário;teste-formulario",
  "type": "scenario_outline",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 6,
      "name": "@TESTELOGIN002"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "que acessei o formulario",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "inserir o \u003cnome\u003e no formulario",
  "keyword": "Quando "
});
formatter.step({
  "line": 10,
  "name": "salvei os dados",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "será validado o nome \u003cnomeValidacao\u003e no formulario",
  "keyword": "Entao "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "realizar-ação-no-formulário;teste-formulario;",
  "rows": [
    {
      "cells": [
        "nome",
        "nomeValidacao"
      ],
      "line": 14,
      "id": "realizar-ação-no-formulário;teste-formulario;;1"
    },
    {
      "cells": [
        "\"Tassio\"",
        "\"Tassio\""
      ],
      "line": 15,
      "id": "realizar-ação-no-formulário;teste-formulario;;2"
    }
  ],
  "keyword": "Exemplos"
});
formatter.scenario({
  "line": 15,
  "name": "Teste formulario",
  "description": "",
  "id": "realizar-ação-no-formulário;teste-formulario;;2",
  "type": "scenario",
  "keyword": "Esquema do Cenario",
  "tags": [
    {
      "line": 6,
      "name": "@TESTELOGIN002"
    },
    {
      "line": 3,
      "name": "@Funcionalidade"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "que acessei o formulario",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "inserir o \"Tassio\" no formulario",
  "matchedColumns": [
    0
  ],
  "keyword": "Quando "
});
formatter.step({
  "line": 10,
  "name": "salvei os dados",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "será validado o nome \"Tassio\" no formulario",
  "matchedColumns": [
    1
  ],
  "keyword": "Entao "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});