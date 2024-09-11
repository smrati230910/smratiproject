package Flipkart.SeleniumFrameworkDesign;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brkenlink {

	public static void main(String[] args) throws IOException {
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("http://www.deadlinkcity.com/");
	List<WebElement>links=driver.findElements(By.tagName("a"));
	System.out.println("Total links in the page: "+links.size());
	
	for(WebElement link:links){
	String linkattribute=	link.getAttribute("href");
	
	
	
	if(linkattribute==null ||linkattribute.isEmpty())
	{
    System.out.println("link is blank or not having any data");
	continue;
	}
	try
	{
	URL linkurl=new URL(linkattribute);
	HttpURLConnection con=(HttpURLConnection) linkurl.openConnection();
	con.connect();
	
	if(con.getResponseCode()>=400) {
		
		System.out.println(linkattribute+ "----Broken link");
	}
	
	else
	{
		System.out.println(linkattribute+ "----Not a broken link");
	}

	}


catch(Exception e) 
{
}
	}
	}
}
