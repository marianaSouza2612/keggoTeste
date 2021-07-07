#Author: gabriel.meira123@gmail.com

Feature: Cadastro do usuario
  Eu como usuario quero acessar o site para realizar um cadastro

Background: Acessar o site
Given que eu esteja no "http://advantageonlineshopping.com/#/"

  Scenario: Cadastrar cliente
    When realizar o cadastro 
    Then valido o cadastro
    
    Scenario: Fazer login
    When faco o login 
    Then valido o login
    
  