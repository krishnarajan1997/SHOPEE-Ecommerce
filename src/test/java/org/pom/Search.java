package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search extends BaseClass{
public Search() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//form[@role='search']//child::input")
private WebElement sbox;

@FindBy(xpath="//button[@type='button']")
private WebElement sbutton;

@FindBy(xpath="(//div[contains(@class,'_1NoI8_ ')])[6]")
private WebElement item;

@FindBy(xpath="//div[@class='_3n5NQx']")
private WebElement pprice;


public WebElement getPspecification() {
	return pspecification;
}

public WebElement getPcolour() {
	return pcolour;
}

public WebElement getPquantity() {
	return pquantity;
}

public WebElement getAddToCart() {
	return addToCart;
}
@FindBy(xpath="(//button[@class='product-variation'])[2]")
private WebElement pspecification;

@FindBy(xpath="(//button[contains(@class,'product')])[8]")
private WebElement pcolour;


@FindBy(xpath="//input[@type='text']")
private WebElement pquantity;


@FindBy(xpath="(//button[@type='button'])[2]")
private WebElement addToCart;


public WebElement getItem() {
	return item;
}

public WebElement getSbox() {
	return sbox;
}

public WebElement getSbutton() {
	return sbutton;
}

public WebElement getPprice() {
	// TODO Auto-generated method stub
	return pprice;
}




}
