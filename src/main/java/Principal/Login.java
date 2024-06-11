package Principal;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Model.Objetos_Login;


public class Login {

	private static WebDriver driver = Principal.driver;
	static WebDriverWait wait = new WebDriverWait(driver, 10);
	public static void Login()  {
		//Intento 1
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Objetos_Login.xpathTitulo)));
		driver.findElement(By.xpath(Objetos_Login.xpathUser)).sendKeys(Objetos_Login.valueUser);
		driver.findElement(By.xpath(Objetos_Login.xpathPassword)).sendKeys(Objetos_Login.valueFakePassword);
		driver.findElement(By.xpath(Objetos_Login.xpathButton)).click();
		//Intento 2
		driver.findElement(By.xpath(Objetos_Login.xpathPassword)).sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
		driver.findElement(By.xpath(Objetos_Login.xpathPassword)).sendKeys(Objetos_Login.valuePassword);
		driver.findElement(By.xpath(Objetos_Login.xpathButton)).click();
	}
	
}
