package Flipkart.SeleniumFrameworkDesign;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sliderhandding {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com");
		//Set<String>str=driver.getWindowHandles();
		List<String>abc=ArrayList(driver.getWindowHandles());
		String par=abc.get(0);
		String child=abc.get(1);
	if(par.equals(child))
		
		
		driver.manage().window().maximize();
		/*
		 * WebElement slider=driver.findElement(By.
		 * xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		 * System.out.println("before sliding " +slider.getLocation());
		 */
		/*
		 * Actions ac= new Actions(driver);
		 * 
		 * ac.dragAndDropBy(slider, 25, 0).perform();
		 * System.out.println("After sliding " +slider.getLocation());
		 * 
		 * 
		 * 
		 * WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
		 * WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		 * WebElement phone=driver.findElement(By.xpath("//input[@id='phone']"));
		 * 
		 * name.sendKeys("test");
		 * 
		 * ac.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		 * 
		 * email.sendKeys("test@gmail.com");
		 * ac.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		 * phone.sendKeys("93830398392");
		 */

	}

	private static List<String> ArrayList(Set<String> windowHandles) {
		// TODO Auto-generated method stub
		return null;
	}

}
