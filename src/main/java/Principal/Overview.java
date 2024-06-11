package Principal;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Model.Objetos_Overview;
import utils.ExtractPrice;

public class Overview {
	private static WebDriver driver = Principal.driver;
	static WebDriverWait wait = new WebDriverWait(driver, 10);
	public static void Overview(){
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Objetos_Overview.xpathTitulo)));
		try {
			Assert.assertTrue(ExtractPrice.extractPrice(driver.findElement(By.xpath(Objetos_Overview.xpathItemTotal)).getText()).contains(Objetos_Overview.xpathItemTotalValue));
			Assert.assertTrue(ExtractPrice.extractPrice(driver.findElement(By.xpath(Objetos_Overview.xpathItemTax)).getText()).contains(Objetos_Overview.xpathItemTaxValue));
			Assert.assertTrue(ExtractPrice.extractPrice(driver.findElement(By.xpath(Objetos_Overview.xpathTotal)).getText()).contains(Objetos_Overview.xpathTotalValue));
			driver.findElement(By.xpath(Objetos_Overview.xpathButtonFinish)).click();
			}
			catch (Exception e) {
	            e.printStackTrace();
			}
		try {
			Assert.assertTrue(driver.findElement(By.xpath(Objetos_Overview.xpathFinishOrderTitulo)).getText().contains(Objetos_Overview.xpathFinishOrderTituloValue));
			}
			catch (Exception e) {
	            e.printStackTrace();
			}
	}
}
