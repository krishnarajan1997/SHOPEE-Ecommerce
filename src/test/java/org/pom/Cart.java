package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart extends BaseClass {
public Cart() {
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="(//div[starts-with(@class,'header')])[2]")
private WebElement cart;

@FindBy(xpath="//span[contains(text(),'check out')]")
private WebElement checkout;


@FindBy(xpath="(//input[@type='text'])[2]")
private WebElement fullname;

@FindBy(xpath="(//input[@type='text'])[3]")
private WebElement phone;

public WebElement getCart() {
	return cart;
}


public WebElement getCheckout() {
	return checkout;
}


public WebElement getFullname() {
	return fullname;
}


public WebElement getPhone() {
	return phone;
}


public WebElement getPostal() {
	return postal;
}


public WebElement getAddress() {
	return address;
}


public WebElement getUnit() {
	return unit;
}


public WebElement getSubmit() {
	return submit;
}

@FindBy(xpath="(//input[@type='text'])[4]")
private WebElement postal;

@FindBy(xpath="(//input[@type='text'])[5]")
private WebElement address;

@FindBy(xpath="(//input[@type='text'])[6]")
private WebElement unit;


@FindBy(xpath="//button[@type='button']")
private WebElement submit;
}
