package businessapplication;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserConfig {
	static WebDriver driver;
	public static WebDriver oprnBrowser() {
		
		if (driver==null);
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.bankkrate.com");
			driver.manage().timeouts().implicitlyWait(20,  TimeUnit.SECONDS);
	
		}
		
		
		
		return driver;
		
		
	}

}
