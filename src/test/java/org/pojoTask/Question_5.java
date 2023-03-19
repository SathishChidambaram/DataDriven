package org.pojoTask;

import java.io.IOException;

import org.base.classes.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pojo.Question_5_1stPagePojo;
import org.pojo.Question_5_2ndPagePojo;
import org.pojo.Question_5_3rdPagePojo;
import org.pojo.Question_5_4thPagePojo;

public class Question_5 extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		browserLaunch();
		launchURL("http://www.adactin.com/HotelApp/");
		maxWindow();
		Question_5_1stPagePojo q1 = new Question_5_1stPagePojo();
		sendText(q1.getUserName(),
				excelValueRead("C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\AdactinDetails1.xlsx",
						"Sample", 0, 1));
		sendText(q1.getPassWord(),
				excelValueRead("C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\AdactinDetails1.xlsx",
						"Sample", 1, 1));
		click(q1.getLogIn());

		Question_5_2ndPagePojo q2 = new Question_5_2ndPagePojo();
		dropValue(q2.getLocation(), 2);
		dropValue(q2.getHotels(), 2);
		dropValue(q2.getRoomType(), 2);
		dropValue(q2.getNoOfRoom(), 2);
		dropValue(q2.getNoOfPerson(), 2);
		click(q2.getSearch());

		Question_5_3rdPagePojo q3 = new Question_5_3rdPagePojo();
		click(q3.getRadioClick());
		click(q3.getNext());

		Question_5_4thPagePojo q4 = new Question_5_4thPagePojo();
		sendText(q4.getFirstName(),
				excelValueRead("C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\AdactinDetails1.xlsx",
						"Sample", 2, 1));
		sendText(q4.getLastName(),
				excelValueRead("C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\AdactinDetails1.xlsx",
						"Sample", 3, 1));
		sendText(q4.getBillingAddress(),
				excelValueRead("C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\AdactinDetails1.xlsx",
						"Sample", 4, 1));
		sendText(q4.getCreditNo(),
				excelValueRead("C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\AdactinDetails1.xlsx",
						"Sample", 5, 1));
		sendText(q4.getCvvNo(),
				excelValueRead("C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\AdactinDetails1.xlsx",
						"Sample", 6, 1));
		dropValue(q4.getCreditCardType(), 2);
		dropValue(q4.getCreditCardExpMonth(), 5);
		dropValue(q4.getCreditCardExpYear(), 5);
		click(q4.getBookNow());

		Thread.sleep(5000);
		WebElement print = driver.findElement(By.xpath("//input[@id='order_no']"));
		String text = print.getAttribute("value");
		System.out.println("Your Order No is: " + text);
		System.out.println("Successfully Hotel is Booked...");

	}
}
