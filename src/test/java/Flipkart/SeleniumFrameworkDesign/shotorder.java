package Flipkart.SeleniumFrameworkDesign;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class shotorder {

	public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
TakesScreenshot ts= (TakesScreenshot) driver;

File souceloc=ts.getScreenshotAs(OutputType.FILE);
File target=new File("C:\\Users\\Administrator\\eclipse-workspace\\SeleniumFrameworkDesign\\src\\test\\java\\Screenshot\\123.png");

souceloc.renameTo(target);
	}

}
