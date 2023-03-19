package org.datatask;

import java.io.IOException;

import org.base.classes.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Question_5 extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {

		browserLaunch();
		launchURL("http://www.adactin.com/HotelApp/");
		maxWindow();
		driver.findElement(By.xpath("//input[@id='username']"))
				.sendKeys(excelValueRead(
						"C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\AdactinDetails1.xlsx",
						"Sample", 0, 1));
		driver.findElement(By.xpath("//input[@id='password']"))
				.sendKeys(excelValueRead(
						"C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\AdactinDetails1.xlsx",
						"Sample", 1, 1));
		WebElement clk = driver.findElement(By.xpath("//input[@id='login']"));
		clk.click();
		driver.findElement(By.xpath("//select[@id='location']")).click();
		driver.findElement(By.xpath("//option[@value='London']")).click();
		driver.findElement(By.xpath("//select[@id='hotels']")).click();
		driver.findElement(By.xpath("//option[@value='Hotel Sunshine']")).click();
		driver.findElement(By.xpath("//select[@id='room_type']")).click();
		driver.findElement(By.xpath("//option[@value='Super Deluxe']")).click();
		driver.findElement(By.xpath("//select[@id='room_nos']")).click();
		driver.findElement(By.xpath("(//option[@value='1'])[1]")).click();
		driver.findElement(By.xpath("//select[@id='adult_room']")).click();
		driver.findElement(By.xpath("(//option[@value='2'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@id='first_name']"))
				.sendKeys(excelValueRead(
						"C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\AdactinDetails1.xlsx",
						"Sample", 2, 1));
		driver.findElement(By.xpath("//input[@id='last_name']"))
				.sendKeys(excelValueRead(
						"C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\AdactinDetails1.xlsx",
						"Sample", 3, 1));
		driver.findElement(By.xpath("//textarea[@id='address']"))
				.sendKeys(excelValueRead(
						"C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\AdactinDetails1.xlsx",
						"Sample", 4, 1));
		driver.findElement(By.xpath("//input[@id='cc_num']"))
				.sendKeys(excelValueRead(
						"C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\AdactinDetails1.xlsx",
						"Sample", 5, 1));
		driver.findElement(By.xpath("//select[@id='cc_type']")).click();
		driver.findElement(By.xpath("//option[@value='VISA']")).click();
		driver.findElement(By.xpath("//select[@id='cc_exp_month']")).click();
		driver.findElement(By.xpath("//option[@value='5']")).click();
		driver.findElement(By.xpath("//select[@id='cc_exp_year']")).click();
		driver.findElement(By.xpath("//option[@value='2017']")).click();
		driver.findElement(By.xpath("//input[@id='cc_cvv']"))
				.sendKeys(excelValueRead(
						"C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\AdactinDetails1.xlsx",
						"Sample", 6, 1));
		driver.findElement(By.xpath("//input[@id='book_now']")).click();
		Thread.sleep(5000);
		WebElement print = driver.findElement(By.xpath("//input[@id='order_no']"));
		String text = print.getAttribute("value");
		System.out.println("Your Order No is: " + text);
		System.out.println("Successfully Hotel is Booked...");

	}
}
