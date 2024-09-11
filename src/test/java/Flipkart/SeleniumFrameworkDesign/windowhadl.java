package Flipkart.SeleniumFrameworkDesign;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhadl {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();

		//String parent=driver.getWindowHandle();
		String par=driver.getWindowHandle();
		Set<String> s=driver.getWindowHandles();
		
	for(String winid:s){
		
		String url=driver.switchTo().window(winid).getCurrentUrl();
		
		if(url.equals("https://demo.opencart.com/")) {
			
			driver.findElement(By.name("search")).sendKeys("phone");
			Thread.sleep(1000);
			
			driver.close();
		}
		
		driver.switchTo().window(par);
		driver.findElement(By.xpath("//button[text()='Alert']")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}

	
	}

}
