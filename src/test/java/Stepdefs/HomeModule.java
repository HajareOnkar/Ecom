package Stepdefs;

import java.io.IOException;

import org.testng.Assert;

import GenaricLib.Baseclass;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeModule extends Baseclass {
	public HomeModule() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	HomePage homepage=new HomePage(driver);
	@Given("User land on home screen")
	public void user_land_on_home_screen() {
		String actTitle=homepage.actualHomePageTitle();
		String expTitle="Automation Exercise";
		Assert.assertEquals(actTitle,expTitle);
	}

	@When("User navigate and check catagory tab")
	public void user_navigate_and_check_catagory_tab() {
	   
	}

	@And("User navigate and check brands tab")
	public void user_navigate_and_check_brands_tab() {
	    
	}

	@Then("user can see values of catagory tab and brands tab")
	public void user_can_see_values_of_catagory_tab_and_brands_tab() {
	    
	}




}
