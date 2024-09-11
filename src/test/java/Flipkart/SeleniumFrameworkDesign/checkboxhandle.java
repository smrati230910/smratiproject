package Flipkart.SeleniumFrameworkDesign;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();

List<WebElement>checkboxs=driver.findElements(By.xpath("(//input[@type='checkbox'])"));

/*
 * for(int i=7;i<checkboxs.size()-3;i++) {
 * 
 * checkboxs.get(i).click();
 * 
 * }
 */
for(WebElement ele:checkboxs) {
	
	
        ele.click();

}

	}

}
