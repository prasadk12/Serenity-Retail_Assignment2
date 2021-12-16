package com.serenity.steps;

import com.serenity.pages.HomePage;

import net.thucydides.core.annotations.Step;

public class CommonStep {

	HomePage homepage;

	@Step
	public void i_am_on_retail_homepage() {
		homepage.getDriver().get("http://retailm1.upskills.in/");
	}

	@Step
	public void clickOnAccountIcon() {
		homepage.accountIcon_btn.click();
	}

}
