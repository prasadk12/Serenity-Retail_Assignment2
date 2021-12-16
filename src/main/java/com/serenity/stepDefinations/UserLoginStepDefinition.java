package com.serenity.stepDefinations;

import com.serenity.steps.UserLoginStep;
import com.serenity.steps.UserRegistrationStep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class UserLoginStepDefinition {

	@Steps
	UserLoginStep ul;

	@Given("i login with Username and Password")
	public void i_login_with_below_username_and_password() {
		ul.enterCredentials();
		ul.clickOnLoginButton();
		System.out.println("User enters Username and Password");

	}

	@Then("I should be able to login to the application")
	public void i_should_be_able_to_login_to_the_application() {
		ul.myAccount();
		System.out.println("User logged into application successfully");
	}

}
