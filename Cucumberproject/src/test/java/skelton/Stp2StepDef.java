package skelton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.tests.DriverUtility;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.PaymentPage;

public class Stp2StepDef {
	WebDriver driver;
	@Before
	public void before()
	{
		driver=DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver, PaymentPage.class);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	

	@Given("URL of TestMeApp")
	public void url_of_TestMeApp() {
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("User add the product to cart")
	public void user_add_the_product_to_cart() {
		PaymentPage.username.sendKeys("Lalitha");
		PaymentPage.Password.sendKeys("Password123");
		PaymentPage.loginButton.click();
		PaymentPage.Allcategories.sendKeys("Headphone");
		PaymentPage.finddetails.click();
		PaymentPage.addtocart.click();
	    PaymentPage.cart.click();
	    PaymentPage.checkout.click();
	    PaymentPage.proceedtopay.click();
	}

	@Then("User added product successfully")
	public void user_added_product_successfully() {
	    
	}





}
