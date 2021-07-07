package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;

import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {

	WebDriver driver;

	public void abrirNavegador(String site) {

		try {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
		} catch (Exception e) {

			System.out.println(
					"----------------------------------------------------------------------------------------------");
			System.out.println(" ERRO AO TENTAR ABRIR O NAVEGADOR  " + e.getMessage() + " " + LocalDateTime.now());
			System.out.println(
					"----------------------------------------------------------------------------------------------");

		}
	}

	public void digitar(String texto, By elemento) {

		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {

			System.out.println(
					"----------------------------------------------------------------------------------------------");
			System.out.println(" ERRO AO TENTAR DIGITAR  " + e.getMessage() + " " + LocalDateTime.now());
			System.out.println(
					"----------------------------------------------------------------------------------------------");

		}
	}

	public void clicar(By elemento) {

		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {

			System.out.println(
					"----------------------------------------------------------------------------------------------");
			System.out.println(" ERRO AO TENTAR CLICAR  " + e.getMessage() + " " + LocalDateTime.now());
			System.out.println(
					"----------------------------------------------------------------------------------------------");

		}
	}

	public void submit(By elemento) {

		try {
			driver.findElement(elemento).submit();
		} catch (Exception e) {

			System.out.println(
					"----------------------------------------------------------------------------------------------");
			System.out.println(" ERRO AO TENTAR EXECUTAR SUBMIT  " + e.getMessage() + " " + LocalDateTime.now());
			System.out.println(
					"----------------------------------------------------------------------------------------------");

		}
	}

	public void fechar() {

		try {
			driver.quit();
		} catch (Exception e) {

			System.out.println(
					"----------------------------------------------------------------------------------------------");
			System.out.println(" ERRO AO TENTAR FECHAR  " + e.getMessage() + " " + LocalDateTime.now());
			System.out.println(
					"----------------------------------------------------------------------------------------------");

		}
	}

	public void pausar(int tempo) throws InterruptedException {

		try {
			Thread.sleep(tempo);
		} catch (Exception e) {

			System.out.println(
					"----------------------------------------------------------------------------------------------");
			System.out.println(" ERRO AO TENTAR PAUSAR " + e.getMessage() + " " + LocalDateTime.now());
			System.out.println(
					"----------------------------------------------------------------------------------------------");

		}
	}

	public void validar(String texto, By elemento) {

		try {
			assertEquals(texto, elemento);
		} catch (Exception e) {

			System.out.println(
					"----------------------------------------------------------------------------------------------");
			System.out.println(" ERRO AO TENTAR EXECUTAR A VALIDAÇÃO  " + e.getMessage() + " " + LocalDateTime.now());
			System.out.println(
					"----------------------------------------------------------------------------------------------");

		}
	}

	public void screenshoot(String nomeScr) {

		try {
			TakesScreenshot scrShot = ((TakesScreenshot) (driver));
			File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Evidencias/" + nomeScr + ".png");
			FileUtils.copyFile(srcFile, destFile);

		} catch (Exception e) {

			System.out.println(
					"----------------------------------------------------------------------------------------------");
			System.out.println(" ERRO AO TENTAR EXECUTAR SCREENSHOT  " + e.getMessage() + " " + LocalDateTime.now());
			System.out.println(
					"----------------------------------------------------------------------------------------------");

		}
	}

}
