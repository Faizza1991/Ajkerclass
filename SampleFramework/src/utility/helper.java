package utility;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class helper {

	public static void hoverOver(WebDriver driver, WebElement element) {
		Actions a=new Actions(driver);
		a.moveToElement(element).build().perform();
		
}
	public static void verifyElement(WebElement element) {
		if(element.isDisplayed())
		{
	
	System.out.println(element+"is Displayed");

	}else
		
		System.out.println(element+"is not Displayed");

	}
	
	public static void verifyTitle(WebDriver driver, String text) {
		if (driver.getTitle().contains(text))
			
		{
			System.out.println("title matched");
		}else
			System.out.println("title not matched");
		

	}

}
