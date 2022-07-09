package desafio1;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebTest {

	// variavel do webdriver
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		// define o driver utilizado
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_93\\chromedriver.exe");

		// instancia o objeto
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws Exception {
		// acessa a url
		driver.get("https://www.grocerycrud.com/v1.x/demo/bootstrap_theme");

		// simulando a interacao do usuario
		WebElement selectBox = driver.findElement(By.id("switch-version-select"));
		Actions build = new Actions(driver);
		build.moveToElement(selectBox).build().perform();
		Select select = new Select(selectBox);
		select.selectByVisibleText("Bootstrap V4 Theme");

		// clicando no botao add customer
		WebElement button = driver.findElement(By.partialLinkText("Add Customer"));
		button.click();

		// preenchendo o form
		WebElement textName = driver.findElement(By.id("field-customerName"));
		textName.click();
		textName.sendKeys("Teste Sicredi");

		WebElement textLastName = driver.findElement(By.id("field-contactLastName"));
		textLastName.click();
		textLastName.sendKeys("Teste");

		WebElement textContactFirstName = driver.findElement(By.id("field-contactFirstName"));
		textContactFirstName.click();
		textContactFirstName.sendKeys("Anderson Anselmi Nunes");

		WebElement textPhone = driver.findElement(By.id("field-phone"));
		textPhone.click();
		textPhone.sendKeys("51 9999-9999");

		WebElement textAddressLine1 = driver.findElement(By.id("field-addressLine1"));
		textAddressLine1.click();
		textAddressLine1.sendKeys("Av Assis Brasil, 3970");

		WebElement textAddressLine2 = driver.findElement(By.id("field-addressLine2"));
		textAddressLine2.click();
		textAddressLine2.sendKeys("Torre D");

		WebElement textCity = driver.findElement(By.id("field-city"));
		textCity.click();
		textCity.sendKeys("Porto Alegre");

		WebElement textState = driver.findElement(By.id("field-state"));
		textState.click();
		textState.sendKeys("RS");

		WebElement textPostalCode = driver.findElement(By.id("field-postalCode"));
		textPostalCode.click();
		textPostalCode.sendKeys("91000-000");

		WebElement textCountry = driver.findElement(By.id("field-country"));
		textCountry.click();
		textCountry.sendKeys("Brasil");

		WebElement selectEmployeer = driver.findElement(By.id("field_salesRepEmployeeNumber_chosen"));
		selectEmployeer.click();

		List<WebElement> list = driver.findElements(By.xpath("//div//ul[contains(@class,'chosen-results')]//li"));

		for (WebElement element : list) {

			if (element.getText().contains("Fixter")) {
				element.click();
				break;
			}

		}

		WebElement textCreditLimit = driver.findElement(By.id("field-creditLimit"));
		textCreditLimit.click();
		textCreditLimit.sendKeys("200");

		WebElement buttonSave = driver.findElement(By.id("form-button-save"));
		buttonSave.submit();
		Thread.sleep(2000);

		// verifica se o cadastro foi realizado
		WebElement textoMensagem = driver.findElement(By.xpath("//div[contains(@class, 'bg-success')]/p"));
		String message = "Your data has been successfully stored into the database. Edit Customer or Go back to list";
		assertEquals(message, textoMensagem.getText());

	}

}
