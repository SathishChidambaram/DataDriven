package org.pojo;

import org.base.classes.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Question_5_5thPagePojo extends BaseClass{

	public Question_5_5thPagePojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private WebElement orderNo;

	public WebElement getOrderNo() {
		return orderNo;
	}
	
}
