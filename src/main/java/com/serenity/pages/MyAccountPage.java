package com.serenity.pages;

import org.junit.Assert;
import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;

public class MyAccountPage extends Page {

	@FindBy(xpath = "//h2[contains(text(),'My Account')]")
	public WebElementFacade myAccount;

}
