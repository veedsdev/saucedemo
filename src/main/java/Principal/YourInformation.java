package Principal;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Model.Objetos_YourInformation;

public class YourInformation {
	private static WebDriver driver = Principal.driver;
	static WebDriverWait wait = new WebDriverWait(driver, 10);
	public static void Plan() throws InterruptedException, IOException {
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Objetos_YourInformation.xpathTitulo)));
		driver.findElement(By.xpath(Objetos_YourInformation.xpathFirstName)).sendKeys(Objetos_YourInformation.xpathFirstNameValue);
		driver.findElement(By.xpath(Objetos_YourInformation.xpathLastName)).sendKeys(Objetos_YourInformation.xpathLastNameValue);
		driver.findElement(By.xpath(Objetos_YourInformation.xpathPostalCode)).sendKeys(Objetos_YourInformation.xpathPostalCodeValue);
		driver.findElement(By.xpath(Objetos_YourInformation.xpathButtonContinue)).click();
	}
}
