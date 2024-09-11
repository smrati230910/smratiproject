package Flipkart.SeleniumFrameworkDesign;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class screnst {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.get("https://testautomationpractice.blogspot.com/");
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trgt=new File("C:\\Users\\Administrator\\eclipse-workspace\\SeleniumFrameworkDesign\\src\\test\\java\\Screenshot\\kuhu.png");
		src.renameTo(trgt);
		System.out.println("table 1screenshot taken");
		
		WebElement tbl= driver.findElement(By.xpath("//table[@id='productTable']"));
		
		File sr1=tbl.getScreenshotAs(OutputType.FILE);
		File trget=new File("C:\\Users\\Administrator\\eclipse-workspace\\SeleniumFrameworkDesign\\src\\test\\java\\Screenshot\\darsh.png");
		
		
		sr1.renameTo(trget);
		System.out.println("seconscreen shot taken");
		
		
		
		
	}

	private static void screenshot() {
		
		
	

}
