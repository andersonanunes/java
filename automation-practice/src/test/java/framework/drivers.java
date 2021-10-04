package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class drivers {
	
	public static WebDriver getFirefoxDriver(){
		WebDriverManager.firefoxdriver().setup();
		return new FirefoxDriver();
	}

	public static WebDriver getChromeDriver(){
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();
	}
}