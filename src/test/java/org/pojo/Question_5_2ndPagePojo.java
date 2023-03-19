package org.pojo;

import org.base.classes.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Question_5_2ndPagePojo extends BaseClass {

	public Question_5_2ndPagePojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement roomType;

	@FindBy(id = "room_nos")
	private WebElement noOfRoom;

	@FindBy(id = "adult_room")
	private WebElement noOfPerson;

	@FindBy(id = "Submit")
	private WebElement search;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfRoom() {
		return noOfRoom;
	}

	public WebElement getNoOfPerson() {
		return noOfPerson;
	}

	public WebElement getSearch() {
		return search;
	}
}
