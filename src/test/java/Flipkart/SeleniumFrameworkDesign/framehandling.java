package Flipkart.SeleniumFrameworkDesign;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class framehandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		//WebElement frame=driver.findElement(By.xpath("//div[text()='Frame1']"));
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("test");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("test2");
		
		driver.switchTo().defaultContent();
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("test3");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']")).click();
		driver.switchTo().defaultContent();
		WebElement frame5=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		
		driver.switchTo().frame(frame5);
		driver.findElement(By.linkText("https://a9t9.com")).click();
		driver.switchTo().defaultContent();
		WebElement frame6=driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		
		driver.switchTo().frame(frame6);
	
		driver.findElement(By.xpath(" //input[@name='mytext4']")).sendKeys("test8");
		
		
		
		

	}

}
