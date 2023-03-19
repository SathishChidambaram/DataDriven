package org.pojo;

import org.base.classes.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Question_5_4thPagePojo extends BaseClass {

	public Question_5_4thPagePojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement firstName;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement billingAddress;
	
	@FindBy(id="cc_num")
	private WebElement CreditNo;
	
	@FindBy(id="cc_type")
	private WebElement CreditCardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement creditCardExpMonth;
	
	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCreditNo() {
		return CreditNo;
	}

	public WebElement getCreditCardType() {
		return CreditCardType;
	}

	public WebElement getCreditCardExpMonth() {
		return creditCardExpMonth;
	}

	public WebElement getCreditCardExpYear() {
		return creditCardExpYear;
	}

	public WebElement getCvvNo() {
		return cvvNo;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	@FindBy(name="cc_exp_year")
	private WebElement creditCardExpYear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvNo;
	
	@FindBy(id="book_now")
	private WebElement bookNow;
	
}
