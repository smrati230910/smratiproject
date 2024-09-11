package Flipkart.SeleniumFrameworkDesign;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertwindowhandle {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Alert']")).click();
		Thread.sleep(1000);
		/*
		 * Alert alert=driver.switchTo().alert(); alert.sendKeys("value");
		 * Thread.sleep(1000); alert.accept();
		 */
		
wait.until(ExpectedConditions.alertIsPresent()).accept();
	}

}
