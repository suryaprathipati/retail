package myRetail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test_Prog {
	public WebDriver driver;
	
	@Test
	@Parameters({"browser"})
	public void testApp(String br) {
		
		if(br.equals("firefox")){
			driver = new FirefoxDriver();
		}
		if(br.equals("ie")){
			System.setProperty("webdriver.ie.driver", "J:\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		Home h = new Home(driver);
		Product p = new Product(driver);
		h.open();
		h.selectDeal();
		p.selectProduct();
		p.close();
	}
}
