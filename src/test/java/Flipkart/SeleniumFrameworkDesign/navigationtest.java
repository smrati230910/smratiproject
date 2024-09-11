package Flipkart.SeleniumFrameworkDesign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class navigationtest {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	
		WebDriver driver= new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(1000));
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.manage().window().maximize();
		driver.get("https:\\www.flipkart.com");
		WebElement searchbtn=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Login']")));
		searchbtn.click();
		driver.navigate().back();
		
		driver.navigate().forward();
		
		
		
		
		
	


	}

}
