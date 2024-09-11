package Flipkart.SeleniumFrameworkDesign;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Flipkart.AbstarctComponent.AbstractComponent;

public class ProductCatalouge extends AbstractComponent {

	WebDriver driver;
	
	
	
	public ProductCatalouge(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 
	By toast=By.cssSelector("#toast-container");
	 
	@FindBy(css=".ng-animating")
	WebElement spinner;
	
	@FindBy(xpath="//*[@class='btn w-10 rounded']")
	List<WebElement>products;
	
	By prod=By.xpath("//*[@class='btn w-10 rounded']");
	
	public List<WebElement> getproducts() throws InterruptedException {
		
		WaitforApprearElement(prod);
		
		return products;
		
	}
	
	
	public void adproductcart() throws InterruptedException {
		
		for (int i = 0; i < products.size(); i++) {
		
			products.get(2).click();
			WaitforDisApprearElement(spinner);
			WaitforApprearElement(toast);

		}
	}
	
}