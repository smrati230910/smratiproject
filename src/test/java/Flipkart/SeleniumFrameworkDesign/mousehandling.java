package Flipkart.SeleniumFrameworkDesign;

import java.io.File;
import java.time.Duration;

import org.checkerframework.checker.units.qual.Acceleration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class mousehandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
	option.addArguments("--headless=new");
	option.setAcceptInsecureCerts(true);
		WebDriver driver= new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//driver.get("https://www.flipkart.com/");
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		/*
		 * //WebElement
		 * login=driver.findElement(By.xpath("//span[contains(text(),'Login')]"));
		 * 
		 * Actions ac= new Actions(driver); WebElement
		 * fld1=driver.findElement(By.xpath("//input[@id='field1']")); WebElement
		 fld2=driver.findElement(By.xpath("//input[@id='field2']")); WebElement
		 * btn=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		 * WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
		 * WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
		 * fld1.clear(); fld1.sendKeys("smrati"); ac.doubleClick(btn).perform();
		 */
		
		/*
		 * //ac.dragAndDrop(drag, drop).perform();
		 * ac.clickAndHold(drag).moveToElement(drop).release().perform();
		 */
	
		/*
		 * TakesScreenshot ts=(TakesScreenshot) driver; File
		 * sourcefile=ts.getScreenshotAs(OutputType.FILE); File targetfile=new File(
		 * "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumFrameworkDesign\\src\\test\\java\\Screenshot\\new1.png"
		 * ); sourcefile.renameTo(targetfile);
		 * 
		 * WebElement table=driver.findElement(By.
		 * xpath("//div[@class='widget HTML']//table[@name='BookTable']")); File
		 * Source=table.getScreenshotAs(OutputType.FILE); File target=new File(
		 * "C:\\Users\\Administrator\\eclipse-workspace\\SeleniumFrameworkDesign\\src\\test\\java\\Screenshot\\table2.png"
		 * ); Source.renameTo(target); //ac.moveToElement(login).click().perform();
		 */	
		WebElement fld2=driver.findElement(By.xpath("//input[@id='field2']")); 
	//WebElement button=driver.findElement(By.xpath("//button[@fdprocessedid='oc9s1f']"));
	File sr=fld2.getScreenshotAs(OutputType.FILE);
	File ds=new File("C:\\Users\\Administrator\\eclipse-workspace\\SeleniumFrameworkDesign\\src\\test\\java\\Screenshot\\button123.png");
	sr.renameTo(ds);
	
	
	
		/*Thread.sleep(1000);
		WebElement mobile=driver.findElement(By.xpath("//div[@class='_3sdu8W emupdz']//a[2]"));
		ac.moveToElement(mobile).click().build().perform();
	}*/

		
		
		
		
}
}
