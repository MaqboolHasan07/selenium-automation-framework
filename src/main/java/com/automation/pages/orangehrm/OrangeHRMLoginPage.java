package com.automation.pages.orangehrm;

import com.automation.pages.base.BasePage;
import org.openqa.selenium.By;

import com.automation.enums.WaitStrategy;
import com.automation.utils.decoder.DecodeUtils;

public final class OrangeHRMLoginPage extends BasePage {

	private final By textboxUsername = By.id("txtUsername");
	private final By textboxPassword = By.xpath("//input[@id='txtPassword' and @type='password']");
	private final By buttonLogin = By.id("btnLogin");

	public OrangeHRMLoginPage enterUserName(String username) {
		
		sendKeys(textboxUsername, username, WaitStrategy.PRESENCE, "Username");
		return this;
	}

	public OrangeHRMLoginPage enterPassWord(String password) {
		sendKeys(textboxPassword, DecodeUtils.getDecodedString(password), WaitStrategy.PRESENCE, "Password");
		return this;
	}
	public OrangeHRMHomePage clickLogin() {
		click(buttonLogin, WaitStrategy.PRESENCE, "Login Button");
		return new OrangeHRMHomePage();
	}

	public String getTitle() {
		return getPageTitle();
	}
	
	
}
