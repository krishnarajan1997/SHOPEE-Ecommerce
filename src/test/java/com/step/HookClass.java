package com.step;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HookClass extends BaseClass {
	@Before
	public void before() throws InterruptedException {
		// TODO Auto-generated method stub

		String time = time();
		launchBrowser();
		launchUrl("https://shopee.sg/");
		winMaximize();
		Thread.sleep(3000);
		WebElement x = findXpath("(//div[contains(@class,'shopee')])[171]");
		x.click();
		System.out.println("Starting time is " + time);
		Thread.sleep(5000);
	}

	@After
	public void after() throws Exception {
		// TODO Auto-generated method stub

		System.out.println("ending time  " + time());
		System.out.println("scenario completed");
	}
}
