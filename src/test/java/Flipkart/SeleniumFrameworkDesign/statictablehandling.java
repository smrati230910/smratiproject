package Flipkart.SeleniumFrameworkDesign;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class statictablehandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		// printing table data
		// String tabletext=
		// driver.findElement(By.xpath("//table[@name='BookTable']")).getText();

//System.out.println(tabletext  +" \t");

		// print total no of row
		int total = 0;
		List<WebElement> row = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
		int rowcount = row.size();
		System.out.println("Total no of row " + rowcount);

		List<WebElement> col = driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));
		int colcount = col.size();
		System.out.println("Total no of column " + colcount);

		List<WebElement> price = driver.findElements(By.xpath("//table[@name='BookTable']//td[4]"));
		System.out.println("price:");
		
		  for (WebElement pr : price) { String prices = pr.getText();
		  
		  int ab = Integer.parseInt(prices); System.out.println(ab);
		  System.out.println(prices); total = total + Integer.parseInt(prices);
		  
		  // System.out.println(total); }
		  
		  System.out.println("Total Price :" + total);
		  
		 
		int min=0;
		
		for(int i=0;i<price.size();i++) {
			
			
		min=Integer.parseInt(price.get(0).getText());
		
		if(min<=Integer.parseInt(price.get(i).getText())) ;
				
		}
		
		
		System.out.println("minimum price of book is: " +min);	
		
		
		List<WebElement> athrname=driver.findElements(By.xpath("//table[@name='BookTable']//td[2]"));
		
		
		for(WebElement name:athrname) {
			
			if(name.getText().equals("Mukesh")) {
				
				System.out.println(prices);
				
				
			}
			
		}		
			
			
			
			
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
