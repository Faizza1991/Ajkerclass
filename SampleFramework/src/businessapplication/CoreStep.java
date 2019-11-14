package businessapplication;

import org.openqa.selenium.WebDriver;

import db.ObjectRepo;
import db.TestData;
import utility.helper;

public class CoreStep {
	WebDriver driver;
	
	public CoreStep() {
		
		this.driver=driver;
	}
	
	public void verifyHomePage() {
		
		helper.verifyElement(driver.findElement(ObjectRepo.logo));
	}
    public void verifyHomePageTitle() {
    	helper.verifyTitle(driver, TestData.Htitle);
    	
    }
    public void hoverOverOnMortgage() {
    	
    	helper.hoverOver(driver,driver.findElement(ObjectRepo.mortgagemenu));
    	
    }
}
