package org.datatask;

import java.io.IOException;

import org.base.classes.BaseClass;
import org.openqa.selenium.By;

public class Question_6 extends BaseClass {

	public static void main(String[] args) throws IOException {
		browserLaunch();
		launchURL("https://www.facebook.com/");
		maxWindow();
		driver.findElement(By.xpath("//input[@id='email']"))
				.sendKeys(excelValueRead(
						"C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\FacebookLogin.xlsx",
						"Sample", 0, 0));
		driver.findElement(By.xpath("//input[@id='pass']"))
				.sendKeys(excelValueRead(
						"C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\FacebookLogin.xlsx",
						"Sample", 0, 1));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
		System.out.println("UserName Sathish got Passed...");

		browserLaunch();
		launchURL("https://www.facebook.com/");
		maxWindow();
		driver.findElement(By.xpath("//input[@id='email']"))
				.sendKeys(excelValueRead(
						"C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\FacebookLogin.xlsx",
						"Sample", 1, 0));
		driver.findElement(By.xpath("//input[@id='pass']"))
				.sendKeys(excelValueRead(
						"C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\FacebookLogin.xlsx",
						"Sample", 1, 1));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
		System.out.println("UserName Swetha got Passed...");

		browserLaunch();
		launchURL("https://www.facebook.com/");
		maxWindow();
		driver.findElement(By.xpath("//input[@id='email']"))
				.sendKeys(excelValueRead(
						"C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\FacebookLogin.xlsx",
						"Sample", 2, 0));
		driver.findElement(By.xpath("//input[@id='pass']"))
				.sendKeys(excelValueRead(
						"C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\FacebookLogin.xlsx",
						"Sample", 2, 1));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
		System.out.println("UserName Jeni got Passed");

		browserLaunch();
		launchURL("https://www.facebook.com/");
		maxWindow();
		driver.findElement(By.xpath("//input[@id='email']"))
				.sendKeys(excelValueRead(
						"C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\FacebookLogin.xlsx",
						"Sample", 3, 0));
		driver.findElement(By.xpath("//input[@id='pass']"))
				.sendKeys(excelValueRead(
						"C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\FacebookLogin.xlsx",
						"Sample", 3, 1));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
		System.out.println("UserName Reni got Passed");

		browserLaunch();
		launchURL("https://www.facebook.com/");
		maxWindow();
		driver.findElement(By.xpath("//input[@id='email']"))
				.sendKeys(excelValueRead(
						"C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\FacebookLogin.xlsx",
						"Sample", 4, 0));
		driver.findElement(By.xpath("//input[@id='pass']"))
				.sendKeys(excelValueRead(
						"C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\FacebookLogin.xlsx",
						"Sample", 4, 1));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
		System.out.println("UserName Bharathi got Passed");
		System.out.println("All UserName are Successfully Passed...");

	}

}
