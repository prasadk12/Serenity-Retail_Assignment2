package com.serenity.pages;

import java.util.List;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends Page {

	@FindBy(xpath = "//a[text()='Register']")
	public WebElementFacade register_btn;

	@FindBy(xpath = "//input[@id='input-email']")
	public WebElementFacade email;

	@FindBy(xpath = "//input[@id='input-password']")
	public WebElementFacade password;

	@FindBy(xpath = "//input[@value='Login']")
	public WebElementFacade login_btn;

}
