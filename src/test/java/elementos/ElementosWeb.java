package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	// Para fazer o login

	private By usuarioLogin = By.name("username");
	private By senhaLogin = By.name("password");
	private By entrar = By.id("sign_in_btnundefined");
	private By usuarioLogado = By.cssSelector("<#menuUserLink > span");

	public By getUsuarioLogin() {
		return usuarioLogin;
	}

	public By getSenhaLogin() {
		return senhaLogin;
	}

	public By getEntrar() {
		return entrar;
	}

	public By getUsuarioLogado() {
		return usuarioLogado;
	}

	// Metodos para Clicar em Elementos Web

	private By cadastro = By.id("menuUserLink");
	private By criarConta = By.xpath("/html/body/login-modal/div/div/div[3]/a[2]");
	private By concordar = By.name("i_agree");
	private By pais = By.name("countryListboxRegisterPage");
	private By brazil = By.cssSelector(
			"#formCover > div:nth-child(3) > div:nth-child(2) > sec-view:nth-child(1) > div > select > option:nth-child(30)");

	public By getPais() {
		return pais;
	}

	public By getBrazil() {
		return brazil;
	}

	public By getCadastro() {
		return cadastro;
	}

	public By getCriarConta() {
		return criarConta;
	}

	public By getConcordar() {
		return concordar;
	}
	
	
	//

	private By registrar = By.id("register_btnundefined");

	public By getRegistrar() {
		return registrar;
	}

	private By usuario = By.name("usernameRegisterPage");

	public By getUsuario() {
		return usuario;
	}

	private By email = By.name("emailRegisterPage");

	public By getEmail() {
		return email;
	}

	private By senha = By.name("passwordRegisterPage");

	public By getSenha() {
		return senha;
	}

	private By confirmarSenha = By.name("confirm_passwordRegisterPage");

	public By getConfirmarSenha() {
		return confirmarSenha;
	}

	private By numero = By.name("phone_numberRegisterPage");

	public By getNumero() {
		return numero;
	}

	private By nome = By.name("first_nameRegisterPage");

	public By getNome() {
		return nome;
	}

	private By sobrenome = By.name("last_nameRegisterPage");

	public By getSobrenome() {
		return sobrenome;
	}

	private By cidade = By.name("cityRegisterPage");

	public By getCidade() {
		return cidade;
	}

	private By endereco = By.name("addressRegisterPage");

	public By getEndereco() {
		return endereco;
	}

	private By estado = By.name("state_/_province_/_regionRegisterPage");

	public By getEstado() {
		return estado;
	}

	private By codigoPostal = By.name("postal_codeRegisterPage");

	public By getCodigoPostal() {
		return codigoPostal;
	}

}
