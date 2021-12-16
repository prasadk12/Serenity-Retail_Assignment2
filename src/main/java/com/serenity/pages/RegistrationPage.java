package com.serenity.pages;

import java.util.List;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;

public class RegistrationPage extends Page {

	@FindBy(xpath = "//input[@id='input-firstname']")
	public WebElementFacade firstName;

	@FindBy(xpath = "//input[@id='input-lastname']")
	public WebElementFacade lastName;

	@FindBy(xpath = "//input[@id='input-email']")
	public WebElementFacade email;

	@FindBy(xpath = "//input[@id='input-telephone']")
	public WebElementFacade telephone;

	@FindBy(xpath = "//input[@id='input-address-1']")
	public WebElementFacade address1;

	@FindBy(xpath = "//input[@id='input-address-2']")
	public WebElementFacade address2;

	@FindBy(xpath = "//input[@id='input-city']")
	public WebElementFacade city;

	@FindBy(xpath = "//input[@id='input-postcode']")
	public WebElementFacade postCode;

	@FindBy(xpath = "//select[@id='input-country']")
	public WebElementFacade country_dd;

	@FindBy(xpath = "//select[@id='input-zone']")
	public WebElementFacade region_dd;

	@FindBy(xpath = "//input[@id='input-password']")
	public WebElementFacade password;

	@FindBy(xpath = "//input[@id='input-confirm']")
	public WebElementFacade passwordConfirm;

	@FindBy(xpath = "//input[@name='newsletter' and @value='0']")
	public WebElementFacade subscribe_rb;

	@FindBy(xpath = "//input[@name='agree']")
	public WebElementFacade privacyPolicy_cb;

}
