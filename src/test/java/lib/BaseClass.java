package lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	@BeforeSuite
	public static void initiateChromeAndURL(){
		
			System.out.println("Inside initiateChromeAndURL method");
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://practice-automation.com/");
			
			System.out.println("End of initiateChromeAndURL method");
	}

}
