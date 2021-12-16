package com.serenity.steps;

import org.junit.Assert;

import com.serenity.pages.HomePage;
import com.serenity.pages.LoginPage;
import com.serenity.pages.MyAccountPage;

import net.thucydides.core.annotations.Step;

public class UserLoginStep extends CommonStep {

	HomePage homepage;
	LoginPage login;
	MyAccountPage myAccount;

	@Step
	public void enterCredentials() {
		login.email.sendKeys("manzoor@gmail.com");
		login.password.sendKeys("manzoor1");
	}

	@Step
	public void clickOnLoginButton() {
		login.login_btn.click();
	}

	@Step
	public void myAccount() {
		String actual = myAccount.myAccount.getText();
		String expected = "My Account";
		Assert.assertEquals(actual, expected);

	}

}
