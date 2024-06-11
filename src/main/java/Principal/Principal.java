package Principal;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Model.Objetos_Web;



public class Principal {
	public static WebDriver driver;

	public void SauceDemo() throws InterruptedException, IOException {

			System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver.exe");
	        // Crea una instancia del WebDriver 
	        driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(Objetos_Web.URL);
			
			Login.Login();
			Products.Products();
			YourInformation.Plan();
			Overview.Overview();
			
			driver.quit();
		
	}
}
