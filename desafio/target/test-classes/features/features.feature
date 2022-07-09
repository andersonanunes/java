#author: andersonanunes@hotmail.com
#language: pt

@consultarCep
Funcionalidade: Consultar CEP via API

  @cenario1
  Cenario: Consulta CEP valido
    Dado que o usuario inseri um CEP valido
    Quando o servico e consultado
    Entao e retornado o CEP, logradouro, complemento, bairro, localidade, uf e ibge.

  @cenario2
  Cenario: Consulta CEP inexistente
    Dado que o usuario inseri um CEP que nao exista na base dos Correios
    Quando o servico e consultado
    Entao e retornada um atributo erro

  @cenario3
  Cenario: Consulta CEP com formato invalido
		Dado que o usuario inseri um CEP com formato invalido
		Quando o servico e consultado
		Entao e retornado uma mensagem de erro