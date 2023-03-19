package org.pojoTask;

import java.io.IOException;

import org.base.classes.BaseClass;
import org.pojo.Question_1_Pojo;

public class Question_1 extends BaseClass {

	public static void main(String[] args) throws IOException {

		browserLaunch();
		launchURL("https://www.facebook.com/");
		maxWindow();
		Question_1_Pojo fp = new Question_1_Pojo();
		sendText(fp.getUserName(),
				excelValueRead("C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\FacebookLogin.xlsx",
						"Sample", 0, 0));
		sendText(fp.getPassWord(),
				excelValueRead("C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\FacebookLogin.xlsx",
						"Sample", 0, 1));
		click(fp.getLogIn());

	}
}
