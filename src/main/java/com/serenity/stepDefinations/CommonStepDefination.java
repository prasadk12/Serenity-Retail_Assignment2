package com.serenity.stepDefinations;

import com.serenity.steps.CommonStep;

import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

public class CommonStepDefination {

	@Steps
	CommonStep cs;

	@Given("I am on Retail Homepage")
	public void i_am_on_retail_homepage() {
		cs.i_am_on_retail_homepage();
		System.out.println("I am on Retail Homepage");
	}

	@Given("i navigate to Login Page")
	public void i_navigate_to_login_page() {
		cs.clickOnAccountIcon();
		System.out.println("I Navigate to Login Page");
	}
}
