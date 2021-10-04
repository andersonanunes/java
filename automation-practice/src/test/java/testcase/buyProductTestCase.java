package testcase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.Status;
//import framework.drivers;
import framework.report;
import framework.screenshot;
import tasks.addProductToCartTask;
import tasks.addressTask;
import tasks.createEmail;
import tasks.newUserTask;
import tasks.paymentTask;
import tasks.shippingTask;
import verificationpoints.verificationPoint;

public class buyProductTestCase {
	private WebDriver driver;
	private addProductToCartTask add;
	private addressTask address;
	private createEmail email;
	private newUserTask newUser;
	private paymentTask payment;
	private shippingTask shipping;
	private verificationPoint verificationPoint;
	
	@Before
	public void setUp() {
		
		report.startTest("Teste - Realizar uma compra com sucesso.");
		
		// define o driver utilizado
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_94\\chromedriver.exe");

		// instancia o objeto
		driver = new ChromeDriver();
		driver.manage().window().maximize();		
		
		add = new addProductToCartTask(driver);
		address = new addressTask(driver);
		email = new createEmail();
		newUser = new newUserTask(driver);
		payment = new paymentTask(driver);
		shipping = new shippingTask(driver);
		verificationPoint = new verificationPoint(driver);
	}
	
	@Test
	public void realizar_compra_com_sucesso() {	
		
		driver.get("http://automationpractice.com/index.php?");
		driver.manage().window().maximize();
		report.log(Status.INFO, "O website foi carregado.", screenshot.capture(driver));
		
		// adiciona o produto ao carrinho
		add.addProductToCart();
		String name = add.productName();
		
		// faz o checkout
		add.checkout();
		verificationPoint.checkProduct(name);
		String total = add.total();
		
		add.checkoutSummary();
		
		// novo cadastro
		newUser.newAccount(email.getSaltString()+"@gmail.com");
		String addressAccount = "Rua Teste, 123";
		String cityAccount = "Carapicuiba";
		newUser.personalInformation("Anderson", "Nunes", "password", addressAccount, cityAccount, "01234", "1589652389");
		newUser.submitAccount();
		verificationPoint.checkAddress(addressAccount,cityAccount);
		address.proceed();
		shipping.agreeTerms();
		shipping.proceed();
		verificationPoint.checkTotal(total);
		payment.payByBankWire();
		payment.proceed();
		verificationPoint.checkOrder();
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}