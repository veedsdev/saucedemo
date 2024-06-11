package Principal;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import Model.Objetos_Products;


public class Products {
	private static WebDriver driver = Principal.driver;
	static WebDriverWait wait = new WebDriverWait(driver, 10);
	public static void Products()  {
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Objetos_Products.xpathTitulo)));
		driver.findElement(By.xpath(Objetos_Products.xpathSauceLabsBackpack)).click();
		driver.findElement(By.xpath(Objetos_Products.xpathSauceLabsBoltTShirt)).click();
		driver.findElement(By.xpath(Objetos_Products.xpathSauceLabsBikeLight)).click();
		driver.findElement(By.xpath(Objetos_Products.xpathCart)).click();
		
		try {
		Assert.assertTrue(driver.findElement(By.xpath(Objetos_Products.xpathCartItem1)).getText().contains(Objetos_Products.textItem1));
		Assert.assertTrue(driver.findElement(By.xpath(Objetos_Products.xpathCartItem2)).getText().contains(Objetos_Products.textItem2));
		Assert.assertTrue(driver.findElement(By.xpath(Objetos_Products.xpathCartItem3)).getText().contains(Objetos_Products.textItem3));
		driver.findElement(By.xpath(Objetos_Products.xpathCheckout)).click();
		}
		catch (Exception e) {
            e.printStackTrace();
		}
		
		
		
	}
}
