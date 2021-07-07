package testes;

import java.io.IOException;

import elementos.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class Steps {

	Metodos metodo = new Metodos();
	ElementosWeb el = new ElementosWeb();

	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String site) {
		metodo.abrirNavegador(site);
	}

	@When("realizar o cadastro")
	public void realizar_o_cadastro() throws InterruptedException {
		metodo.pausar(20000);
		metodo.clicar(el.getCadastro());
		metodo.pausar(5000);
		metodo.clicar(el.getCriarConta());

		// Preenchimento do cadastro

		metodo.pausar(5000);

		metodo.digitar("ETesteSilva", el.getUsuario());
		metodo.digitar("exemplo.teste.silva@teste.com", el.getEmail());
		metodo.digitar("Tteste456", el.getSenha());
		metodo.digitar("Tteste456", el.getConfirmarSenha());
		
		metodo.pausar(1000);
		
		metodo.digitar("Exemplo", el.getNome());
		metodo.digitar("Teste da Silva", el.getSobrenome());

		metodo.pausar(1000);
		metodo.screenshoot("cadastro_print1");

		metodo.digitar("+5511987263267", el.getNumero());
		
		metodo.pausar(1000);
		metodo.screenshoot("cadastro_print2");
		
		metodo.clicar(el.getPais());
		metodo.clicar(el.getBrazil());
		metodo.digitar("São Paulo", el.getCidade());
		metodo.digitar("Rua Cachoeira Morena", el.getEndereco());
		metodo.digitar("SP", el.getEstado());
		
		metodo.pausar(1000);
		
		metodo.digitar("08472610", el.getCodigoPostal());

		// confirmar com os termos e registrar

		metodo.clicar(el.getConcordar());

		metodo.pausar(1000);
		metodo.screenshoot("cadastro_print3");
		
		metodo.clicar(el.getRegistrar());
		
	}

	@Then("valido o cadastro")
	public void valido_o_cadastro() throws InterruptedException {

		metodo.pausar(5000);
		metodo.screenshoot("cadastro_print4");
		
		metodo.fechar();

	}

	@When("faco o login")
	public void faço_o_login() throws InterruptedException {
		metodo.pausar(15000);

		metodo.clicar(el.getCadastro());

		metodo.pausar(3000);

		metodo.digitar("ETesteSilva", el.getUsuarioLogin());
		metodo.digitar("Tteste456", el.getSenhaLogin());

		metodo.pausar(3000);
		metodo.screenshoot("login_print1");

	}

	@Then("valido o login")
	public void valido_o_login() throws InterruptedException {
		metodo.pausar(3000);
		metodo.clicar(el.getEntrar());

		metodo.pausar(3000);
		metodo.screenshoot("login_print2");

		metodo.fechar();
	}

}
