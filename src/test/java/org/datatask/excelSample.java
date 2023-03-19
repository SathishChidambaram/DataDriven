package org.datatask;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.classes.BaseClass;

public class excelSample extends BaseClass {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\AdactinDetails.xlsx");
		Workbook wb = new XSSFWorkbook();
		Sheet s = wb.createSheet("Sample");
		createRowAndCellOf10(s);
		sendValueToTables(s, 0, 0, "UserName");
		sendValueToTables(s, 0, 1, "SathishC");
		sendValueToTables(s, 1, 0, "Password");
		sendValueToTables(s, 1, 1, "Sathish@123");
		sendValueToTables(s, 2, 0, "FirstName");
		sendValueToTables(s, 2, 1, "Sathish");
		sendValueToTables(s, 3, 0, "LastName");
		sendValueToTables(s, 3, 1, "Chidambaram");
		sendValueToTables(s, 4, 0, "Address");
		sendValueToTables(s, 4, 1, "Chennai");
		sendValueToTables(s, 5, 0, "CreditNo");
		sendValueToTables(s, 5, 1, "1234567890123456");
		sendValueToTables(s, 6, 0, "CVVNo");
		sendValueToTables(s, 6, 1, "123");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);

	}

}
