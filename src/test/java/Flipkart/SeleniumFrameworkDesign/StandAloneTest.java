package Flipkart.SeleniumFrameworkDesign;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Flipkart.AbstarctComponent.AbstractComponent;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		landingpage landingpage= new landingpage(driver);
		landingpage.GoTo();
		landingpage.loginapp("smrati@gmail.com", "P@ssw0rd");
		ProductCatalouge ProductCatalouge= new ProductCatalouge(driver);
		List<WebElement>products=ProductCatalouge.getproducts();
		ProductCatalouge.adproductcart();
		ProductCatalouge.cartitem();
	
	}
	


		

	}


