package Flipkart.SeleniumFrameworkDesign;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddendrpdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();

driver.get("https://opensource-demo.orangehrmlive.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("admin123");
driver.findElement(By.xpath("//button[@type='submit']")).click();
driver.findElement(By.xpath("//span[text()='PIM']")).click();

	}

}
