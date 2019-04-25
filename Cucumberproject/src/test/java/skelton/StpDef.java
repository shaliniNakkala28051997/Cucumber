package skelton;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.tests.DriverUtility;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.LoginPage;

public class StpDef {
	WebDriver driver;
	@Before
	public void before()
	{
		driver=DriverUtility.getDriver("chrome");
		PageFactory.initElements(driver, LoginPage.class);
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Given("url of the TestMeApp")
	public void url_of_the_TestMeApp() {
		driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("user enters the data for LoginPage")
	public void user_enters_the_data_for_LoginPage() {
		LoginPage.username.sendKeys("admin");
		LoginPage.password.sendKeys("Password456");
	    LoginPage.LoginButton.click();
	    LoginPage.addproduct.click();
	    LoginPage.
	}

	@Then("user is Login successfully")
	public void user_is_Login_successfully() {
	    
	}


}
