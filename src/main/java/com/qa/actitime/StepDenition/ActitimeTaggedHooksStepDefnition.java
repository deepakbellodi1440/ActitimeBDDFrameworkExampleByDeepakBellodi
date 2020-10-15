package com.qa.actitime.StepDenition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ActitimeTaggedHooksStepDefnition {
	@Before //global aplicable to all scenarios
	public void setup() {
		System.out.println("**********Launch the browser*********");
		System.out.println("Enter the URL enter username and password");
		System.out.println("navigate to the userPage");
	}
	@After//aplicable to only all scenario
	public void tearDown() {
		System.out.println("*******************close the browser*************88");
	}
	@Before("@first")//aplicable to only first scenario
	public void beforeFirstMethod() {
		System.out.println("#########Only Before First Method#############");
	}
	@After("@first")//global aplicable to all scenarios
	public void afterFirstMethod() {
		System.out.println("#########Only After First Method#############");
	}
	
	
	@After("@sceond")//aplicable to only second scenario
	public void afterScondMethod() {
		System.out.println("#########Only After second Method#############");
	}
	@Before("@sceond")//aplicable to only secoond scenario
	public void beforesecondMethod() {
		System.out.println("#########Only Before Second Method#############");
	}

	
	@Given("^User is already available on UsersPage page$")
	public void user_is_already_available_on_UsersPage_page() {
		System.out.println("User is already on Userpage");
	}

	
	@When("^Title of the login page is UsersPAge$")
	public void title_of_the_login_page_is_UsersPAge() {
		System.out.println("Title of the page is userPage");
	}

	@Then("^User fills the user form$")
	public void user_fills_the_user_form() {
		System.out.println("User enters the entire form");
	}

	@Then("^User creted$")
	public void user_creted() {
		System.out.println("User created");
	}
	@Given("^User is already available in UsersPage page$")
	public void user_is_already_available_in_UsersPage_page()  {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is on UserPage");
	}

	@Then("^User search the name in the search context$")
	public void user_search_the_name_in_the_search_context()  {
	    System.out.println("User search the name in the context");
	}

	@Then("^User found$")
	public void user_found() {
		System.out.println("User Found");
	}
}
