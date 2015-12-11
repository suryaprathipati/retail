package myRetail;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Product {
	
	WebDriver driver;
	
	public Product(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void selectProduct()
	{
		driver.findElement(By.linkText("Electronics")).click();
		ArrayList<WebElement> a = new ArrayList<WebElement>(driver.findElement(By.id("Electronics")).findElements(By.tagName("img")));
		System.out.println(a.size());
	}
	
	public void close(){
		driver.close();
	}

}
