package parallelTest2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	
	
	public static WebDriver driver;
	
	@Test
	public void crossBrowserTesting() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\all jars\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.close();
		
	}

	
	
}
