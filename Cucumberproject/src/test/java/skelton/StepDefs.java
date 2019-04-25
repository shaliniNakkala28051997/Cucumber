package skelton;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.tests.DriverUtility;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs {
	WebDriver driver;
	@Before
	public void before()
	{
		driver=DriverUtility.getDriver("chrome");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@After
	public void after()
	{
		
		driver.close();
	}
	@Given("The URL of TestMe App")
	public void the_URL_of_TestMe_App() {
	    // Write code here that turns the phrase above into concrete actions
		
	   
	    driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	}

	@When("user enters {word} as username")
	public void user_enters_as_username(String string) {
		driver.findElement(By.name("userName")).sendKeys(string);
	}

	@When("user enters {word} as password")
	public void user_enters_as_password(String string) {
		driver.findElement(By.name("password")).sendKeys(string);
		
	   
	}
	@When("user enters invalid data")
	public void user_enters_invalid_data(io.cucumber.datatable.DataTable dataTable) {
		
	
		List<List<String>> list=dataTable.asLists();
		for (List<String> list2 : list)
		{
			for (String s: list2)
			{
				System.out.print(s+"\t");
				
			}
			System.out.println();
			
		}
	    
	    
	}

	@Then("user is in loginpage")
	public void user_is_in_loginpage(List<String> s)
	{
	    for(String as:s)
	    {
	    	System.out.println(as);
	    }
		
	}



	@Then("user is in (Home|Admin Home)")
	public void user_is_in_home_page() {
		
	}


}
