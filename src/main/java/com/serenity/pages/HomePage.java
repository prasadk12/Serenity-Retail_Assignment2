package com.serenity.pages;

import org.openqa.selenium.support.FindBy;

import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends Page {

	@FindBy(xpath = "//i[@class='fa fa-user-o']")
	public WebElementFacade accountIcon_btn;

	public void clickOnAccountIcon() {
		accountIcon_btn.click();
	}

}
