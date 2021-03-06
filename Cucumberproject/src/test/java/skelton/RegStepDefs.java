package skelton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.tests.DriverUtility;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.RegisterPage;



public class RegStepDefs {
	WebDriver driver;
	@Before
	public void init()
	{

		driver=DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver, RegisterPage.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Given("url of the demowebshop")
	public void url_of_the_demowebshop() {
	    driver.get("http://demowebshop.tricentis.com/register");
	}

	@When("user enters the data for registration")
	public void user_enters_the_data_for_registration() {
		
		  RegisterPage.gender.click();
		   RegisterPage.firstname.sendKeys("Shalini");
		   RegisterPage.lastname.sendKeys("N");
		   RegisterPage.email.sendKeys("shalinin@gmail.com");
		   RegisterPage.password.sendKeys("abc123");
		   RegisterPage.confirmpassword.sendKeys("abc123");
		   RegisterPage.registerbutton.click();
	}

	@Then("user is registered successfully")
	public void user_is_registered_successfully() {
		
	}


}