package Flipkart.SeleniumFrameworkDesign;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamictablehandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		List<WebElement>data=driver.findElements(By.xpath("//table[@id='productTable']//tr"));
		
		int row=driver.findElements(By.xpath("//table[@id='productTable']//tr")).size();
		System.out.println(row);
		
		List<WebElement>page=driver.findElements(By.xpath("//ul[@class='pagination']"));
	
		//ul[@class='pagination']//li[2]
		 	for(int i=1;i<=page.size();i++) {
		 		
		 		for(WebElement r:data) {
		 		System.out.println(r.getText());
		 		}
		 		
		 

		 	}
	}

}












/*	String text=driver.findElement(By.xpath("//ul[@class='pagination']//a[(text()="+i+")]")).getText();

	System.out.println(text);
	Thread.sleep(1000);
		
		}

*/