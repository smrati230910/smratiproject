package Flipkart.SeleniumFrameworkDesign;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver= new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com");
driver.manage().window().maximize();
WebElement drp=driver.findElement(By.cssSelector("[id='country']"));
Select s = new Select(drp);
//s.selectByIndex(2);
//s.selectByVisibleText("India");

  s.selectByValue("uk"); List<WebElement>ls=s.getOptions();
  
  for(WebElement l:ls) {
  
  System.out.println(l.getText()); }
 
	}

}
