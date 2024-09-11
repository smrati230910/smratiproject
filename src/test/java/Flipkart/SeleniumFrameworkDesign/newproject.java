package Flipkart.SeleniumFrameworkDesign;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newproject {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https:\\www.flipkart.com");
		driver.manage().window().maximize();
		//css selector using class and attribute----- .classname[attributename='value']
		//driver.findElement(By.cssSelector(".Pke_EE[title='Search for Products, Brands and More']")).sendKeys("laptop");
		
//css selector using tag and id tag#id

//css selector using tag and class name tag.classname
		
		//driver.findElement(By.cssSelector(".Pke_EE")).sendKeys("mobile");
		
		//css selector using tag and attribute name tag[attributename='value']
		
		//driver.findElement(By.cssSelector("[name=q]")).sendKeys("women dress");
		//Thread.sleep(10);
		//driver.close();
		
		
		// tag#id
		//tag.classname
		//tag[attributename='value']
		//tag.classname[attributename='value']
		
		
		//driver.findElement(By.xpath("//span[text()=\"Fashion\"]")).click();
		//Action ac= new Action();
		
		//driver.findElement(By.xpath("//a[text()='Women Ethnic']")).findElement(By.xpath("//*[text()='Women Sarees']")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//*[text()='Women Sarees']")).click();
		
		//div[@class='NmD+EK']
	driver.findElement(By.xpath("//span[text()='Travel']")).click();
	String title=driver.findElement(By.xpath("//div[@class='NmD+EK']")).getText();
	System.out.println(title);
	String expected="Travel";
	if(title==expected) {
		
		System.out.println("true");
		
	}
	
	System.out.println(driver.getCurrentUrl());
	System.out.println("first window id" +driver.getWindowHandle());
	System.out.println("second window id" +driver.getWindowHandles());
	System.out.println(driver.getTitle()) ;
	}
	

}
