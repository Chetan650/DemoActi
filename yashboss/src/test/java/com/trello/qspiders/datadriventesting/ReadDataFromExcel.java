package com.trello.qspiders.datadriventesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/facebookdropdown.xlsx");
		Workbook workBook = WorkbookFactory.create(fis);
		Sheet sheet = workBook.getSheet("dropdownoptions");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(12);
//String stringValue = cell.getStringCellValue();
//System.out.println(stringValue);
		long numericValue = (long) cell.getNumericCellValue();
		for (Cell cell2 : row) {
			System.out.println(cell2);

		}
	}
}
