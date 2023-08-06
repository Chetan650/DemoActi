package com.trello.qspiders.datadriventesting;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadAllWorkBookData {
	public static void main(String[] args) throws Exception {
		FileInputStream fs = new FileInputStream("./src/test/resources/facebookdropdown.xlsx");
		Workbook workBook = WorkbookFactory.create(fs);
		Sheet sheet = workBook.getSheet("dropdownoptions");
		int firstRowIndex = sheet.getFirstRowNum();
		// System.out.println(firstRowIndex);
		int lastRowIndex = sheet.getLastRowNum();
		// System.out.println(lastRowIndex);
		int numberOfRows = sheet.getPhysicalNumberOfRows();
		for (int i = firstRowIndex; i <= lastRowIndex; i++) {
			short firstCellNumber = sheet.getRow(i).getFirstCellNum();
			short lastCellNumber = sheet.getRow(i).getLastCellNum();
			for (int j = firstCellNumber; j < lastCellNumber; j++) {
				String cellType = sheet.getRow(i).getCell(j).getCellType().toString();
				if (cellType.equals("NUMERIC")) {
					long numericValue = (long) sheet.getRow(i).getCell(j).getNumericCellValue();
					System.out.println(numericValue);
				} else if (cellType.equals("STRING")) {
					String stringValue = sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.println(stringValue);
				}
			}
		}
		workBook.close();
	}
}
