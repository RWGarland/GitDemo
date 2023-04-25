package AcadamyTesting;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SubmitOrderTest {

	public static void main(String[] args) throws InterruptedException{
		
String productName = "ZARA COAT 3";
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		LandingPage landingPage = new LandingPage(driver);
		landingPage.goTo();
	//	ProductCatalogue productCatalogue = landingPage.loginApplication("anshika@gmail.com", "Iamking@000");
		
		
	//	List<WebElement> products = productCatalogue.getProductList();
	//	productCatalogue.addProductTopCart(productName);	
	//	CartPage cartPage = ProductCatalogue.goToCartPage();
		
		
	//	Boolean match = cartProduct.VerifyProductDisplay(productName);
	//	Assert.assertTrue(match);
		
	//	CheckoutPage checkoutPage = cartOage.goToCheckout();
	//	checkoutPage.selectCountry("india");
	//	ConfirmationPage confirmationPage = checkoutPage.submitOrder();
	//	String confirmMessage = confirmationPage.submitOrder();
	//	Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER"));
		driver.close();

	}

}
