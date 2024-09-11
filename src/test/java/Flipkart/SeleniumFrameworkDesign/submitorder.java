package Flipkart.SeleniumFrameworkDesign;import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Flipkart.AbstarctComponent.AbstractComponent;

public class submitorder extends AbstractComponent {

	WebDriver driver;
	
	@FindBy(xpath="//*[text()='IPHONE 13 PRO']")
	WebElement proname;
	
	@FindBy (css=".cartSection h3")
	 List<WebElement> producttitle;
	
	public submitorder(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean verifyprodctname() {
	boolean flag = false;
		for(int i=0;i<producttitle.size();i++) {
			
			String actual=producttitle.get(i).getText();
			
			String expected="IPHONE 13 PRO";
			
			if(actual==expected) {
				
		
				System.out.println("test pass");
				
			}
		}
		return flag;
	}
	
	}
	
