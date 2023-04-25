package AcadamyTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AcadamyComponents.AbstractComponent;

public class ProductCata extends AbstractComponent{
	
	WebDriver driver;
	
	public ProductCata(WebDriver driver) 
	{
		//initialised 
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(css=".mb-3") List<WebElement> products;
	
	By productsBy =  By.cssSelector(".mb-3");
	
	public List<WebElement> getProductList() 
	{
		waitForElementToAppear(productsBy);
		return products;
	}
	//WebElement userEmail = driver.findElement(By.id("userEmail"));
	
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id="userPassword")
	WebElement password;
	
	@FindBy(id="login")
	WebElement submit;
	
	public void loginApplication(String email, String password)
	{
		userEmail.sendKeys(email);
		userEmail.sendKeys(password);
		submit.click();
		
	}
	
	public void goTo()
	{
		driver.get("https://rahulshettyacademy.com/client");
	}
	
}
