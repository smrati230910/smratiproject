import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.apache.hc.core5.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brknlink {

	public static void main(String[] args) throws IOException {

WebDriver driver=new ChromeDriver();

driver.get("http://www.deadlinkcity.com/");
driver.manage().window().maximize();
List<WebElement>links=driver.findElements(By.tagName("a"));
System.out.println("Total Link "+links.size());

for(WebElement link:links) {
	
	String hreflink=link.getAttribute("href");
	
	if(hreflink==null ||hreflink.isEmpty()) {
		
		System.out.println("link is blank");
		continue;
		
	}
	
try {
URL url= new URL(hreflink);
   HttpURLConnection con=(HttpURLConnection) url.openConnection();
   con.connect();
   
   if(con.getResponseCode()>=400) {
	   
	   System.out.println(hreflink +"-------Broken link" );
   }

   else {
	   
	   System.out.println(hreflink +"-----not broken link");
   }
}
catch(Exception e)
{
}
		}
	}


}



	





	


