package AcadamyComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent {
	
	WebDriver driver;

	public AbstractComponent(WebDriver driver) {
		
		this.driver = driver;

	}
	
	@FindBy(css = "[routerlink*='cart']")
	WebElement cartHeader;
	
	
	public void waitForElementToAppear(By findBy) 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findBy));
	}
	
	Public CartPage goToCartPage()
	{
		cartHeader.click();
		CartPage cartPage = new CartPage(driver);
		returm cartPage;
	}
	
	public void waitForElementToDisappear(WebElement ele) throws InterruptedException 
	{
		Thread.sleep(1000);
	}
	
	

}
