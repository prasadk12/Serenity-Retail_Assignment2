package com.serenity.steps;

import com.serenity.pages.HomePage;
import com.serenity.pages.LoginPage;
import com.serenity.pages.RegistrationPage;
import net.thucydides.core.annotations.Step;

public class UserRegistrationStep extends CommonStep {

	HomePage homepage;
	LoginPage login;
	RegistrationPage registration;

	@Step
	public void clickOnRegisterButton() {
		login.register_btn.click();
	}

	@Step
	public void registerUser() {
		registration.firstName.sendKeys("manzoor");
		registration.lastName.sendKeys("mehadi");
		registration.email.sendKeys("manzoor@gmail.com");
		registration.telephone.sendKeys("9876543210");
		registration.address1.sendKeys("Yeshwanthapur");
		registration.address2.sendKeys("Bangalore");
		registration.city.sendKeys("Bangalore");
		registration.postCode.sendKeys("560022");
		registration.country_dd.selectByValue("99");
		registration.region_dd.selectByValue("1489");
		registration.password.sendKeys("manzoor1");
		registration.passwordConfirm.sendKeys("manzoor");
		registration.subscribe_rb.click();
		registration.privacyPolicy_cb.click();
	}

}
