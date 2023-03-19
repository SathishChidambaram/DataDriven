package org.pojo;

import org.base.classes.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Question_5_3rdPagePojo extends BaseClass {

	public Question_5_3rdPagePojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement radioClick;

	@FindBy(id = "continue")
	private WebElement next;

	public WebElement getRadioClick() {
		return radioClick;
	}

	public WebElement getNext() {
		return next;
	}

}
