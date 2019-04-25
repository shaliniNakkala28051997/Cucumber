package skelton;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class ClassDefinitions {
//private static final String String = null;
person sean=new person();


	@Given("Sean is {int} meters away from Lucia")
	public void sean_is_meters_away_from_Lucia(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	   sean.setDistance(int1);
	}

	@When("Sean shouts {string}")
	public void sean_shouts(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    sean.setmessage(string);
	}

	@Then("Lucia {string} to the message")
	public void lucia_listens_to_the_message(String flag) {
	    
		// Write code here that turns the phrase above into concrete actions
		if(flag.contentEquals("listens"))
		{
	    String message=sean.getMessage();
	    Assert.assertEquals("Free Coffee", message);
		}
		else if(flag.contentEquals("cannot listen")) 
		{
			String message=sean.getMessage();
		    Assert.assertEquals("cannot hear", message);
		}
	}
	
}
