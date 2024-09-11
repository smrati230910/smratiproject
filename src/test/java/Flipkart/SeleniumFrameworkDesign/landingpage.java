package Flipkart.SeleniumFrameworkDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Flipkart.AbstarctComponent.AbstractComponent;

public class landingpage extends AbstractComponent{

	WebDriver driver;
	
	
	
	public landingpage(WebDriver driver) {
		super(driver);
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id="userPassword")
	WebElement userPassword;
	
	@FindBy(id="login")
	WebElement login;
	
	
	public void loginapp(String uname,String pwd) {
		
		userEmail.sendKeys(uname);
		userPassword.sendKeys(pwd);
		login.click();
		
	}
	
	public void GoTo() {
		
		driver.get("https://rahulshettyacademy.com/client/");
	}
}