package org.datatask;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Question_3 {

	public static void main(String[] args) throws IOException {
		// Insert one new row in the excel sheet.

		File f = new File("C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\Sample3.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheet("SampleSheet");

		Row createRow = sheet.createRow(11);

		Cell cell0 = createRow.createCell(0);
		cell0.setCellValue("Divya");

		Cell cell1 = createRow.createCell(1);
		cell1.setCellValue("Bigdata");

		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);
	}

}
