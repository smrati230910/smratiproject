package Flipkart.SeleniumFrameworkDesign;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testnewclass {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();

URL url=new URL("https://www.guru99.com/");

driver.navigate().to(url);
driver.manage().window().maximize();
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(2000));
WebElement btn=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Web']/following::button[2]")));
btn.click();
//driver.findElement(By.xpath("//span[text()='Web']/following::button[4]")).click();

	}

}
