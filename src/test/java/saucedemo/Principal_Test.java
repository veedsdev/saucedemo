package saucedemo;

import java.io.IOException;

import org.junit.Test;

import Principal.Principal;




public class Principal_Test {
	
	public static Principal principal;
	@Test
	public void test() throws InterruptedException, IOException {
		principal = new Principal(); 
		principal.SauceDemo();
	}
}
