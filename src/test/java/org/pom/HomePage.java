package org.pom;

import java.util.List;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href]")
	private List<WebElement> link;

	@FindBy(xpath ="//div[contains(@style,'background')]")
	private List<WebElement> image;

	@FindBy(xpath = "//input")
	private List<WebElement> textField;


	public List<WebElement> getLink() {
		return link;
	}

	public List<WebElement> getImage() {
		return image;
	}

	public List<WebElement> getTextField() {
		return textField;
	}

	
}
