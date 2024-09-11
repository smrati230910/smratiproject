package Flipkart.SeleniumFrameworkDesign;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bootstrapdrphandling {

	
	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(@class,'multiselect dropdown-toggle btn btn-default')]")).click();
		List<WebElement>li=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container dropdown-menu')]//li"));
		for(WebElement list:li) {
			if(!(list.getText().equals("HTML") || list.getText().equals("CSS")))
			list.click();
			System.out.println(list.getText());
			
		}

	}

}
