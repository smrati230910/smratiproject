package Flipkart.AbstarctComponent;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent {
WebDriver driver;

@FindBy(xpath="//button[contains(.,'Cart')]")
WebElement cart;


public AbstractComponent(WebDriver driver) {
		
	sfghfhgfhf;	
	this.driver=driver;	
	PageFactory.initElements(driver, this);
		
	}

public void cartitem() {
	
	cart.click();
}



public void WaitforApprearElement(By Findby) {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
	wait.until(ExpectedConditions.visibilityOfElementLocated(Findby));
	
}

public void WaitforDisApprearElement(WebElement ele) {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
	wait.until(ExpectedConditions.invisibilityOf(ele));
	


}



}
