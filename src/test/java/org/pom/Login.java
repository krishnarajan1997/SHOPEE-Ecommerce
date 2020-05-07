package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass{
public Login() {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//a[text()='Login']")
private WebElement loginicon;

@FindBy(xpath="//input[@type='text']")
private WebElement user;

@FindBy(xpath="//input[@type='password']")
private WebElement pass;


public WebElement getLoginicon() {
	return loginicon;
}

public WebElement getUser() {
	return user;
}

public WebElement getPass() {
	return pass;
}


}
