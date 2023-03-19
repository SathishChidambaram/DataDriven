package org.datatask;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.base.classes.BaseClass;

public class Question_1 extends BaseClass {

	// Find the Total number of Rows and Total number of cells in excel sheet.

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\Sample.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheet("SampleSheet");
		int totalRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Total Numbers of Rows " + totalRows);

		Row row = sheet.getRow(0);
		int totalCells = row.getPhysicalNumberOfCells();
		System.out.println("Total Numbers of Cells " + totalCells);

	}

}
