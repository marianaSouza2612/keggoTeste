#Author: gabriel.meira123@gmail.com

Feature: Cadastro do usuario
  Eu como usuario quero acessar o site para realizar um cadastro

Background: Acessar o site
Given que eu esteja no "http://advantageonlineshopping.com/#/"

  Scenario: Cadastro do cliente
    When realizar o cadastro 
    Then validamos o acesso a conta
    
    Scenario: Fazendo login
    When faco o login 
    Then validarei o login
    
  