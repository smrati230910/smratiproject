package Flipkart.SeleniumFrameworkDesign;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class getoptionclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		/*
		 * WebElement drpdwn=driver.findElement(By.xpath("//select[@id='country']"));
		 * Select s= new Select(drpdwn);
		 */
		
		//s.selectByIndex(3);
		//s.selectByVisibleText("india");
		//s.selectByValue("india");
		WebElement table1=driver.findElement(By.xpath("//table[@name='BookTable']"));
		File file=table1.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\Administrator\\eclipse-workspace\\SeleniumFrameworkDesign\\src\\test\\java\\Screenshot\\smrat.png");
		file.renameTo(target);
		/*
		 * List<WebElement>ls=s.getOptions();
		 * 
		 * for(WebElement list:ls) {
		 * 
		 * System.out.println(list.getText());
		 * 
		 * }
		 */
	}

}
