package org.datatask;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Question_2 {

	public static void main(String[] args) throws IOException {
		// Print all the data present in excel sheet.

		File f = new File("C:\\Users\\sathi\\eclipse-workspace\\Maven_DataDrivenTask\\Excel\\Sample2.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet sheet = wb.getSheet("SampleSheet");

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				System.out.println(cell);

			}
		}
	}

}
