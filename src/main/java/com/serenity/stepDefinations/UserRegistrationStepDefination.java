package com.serenity.stepDefinations;

import com.serenity.steps.UserRegistrationStep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class UserRegistrationStepDefination {

	@Steps
	UserRegistrationStep ur;

	@Given("i navigate to Register Page")
	public void i_navigate_to_register_page() {
		ur.clickOnRegisterButton();
		System.out.println("I Navigate to Register Page");
	}

	@When("I enter required details")
	public void i_enter_required_details() {
		ur.registerUser();
	}

	@Then("I should be able to register the new user successfully")
	public void i_should_be_able_to_register_the_new_user_successfully() {
		System.out.println("User Is Registered Successfully on Retails Website");

	}

}
