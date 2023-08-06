package com.trello.qspiders.datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FBDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/fbdropdowndata.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("fbdropdown");
		int firstRowNumber = sheet.getFirstRowNum();
		// System.out.println(firstRowNumber); // 0
		int lastRowNumber = sheet.getLastRowNum();
		// System.out.println(lastRowNumber); // 2
		short dayRowLastCellnumber = sheet.getRow(0).getLastCellNum();
		System.out.println(dayRowLastCellnumber);
		short dayRowFirstCellnumber = sheet.getRow(0).getFirstCellNum();
		System.out.println(dayRowFirstCellnumber);
		CellType cellType = sheet.getRow(0).getCell(0).getCellType();
		System.out.println(cellType);
		if (cellType.equals("NUMERIC")) {
			long numericValue = (long) sheet.getRow(0).getCell(0).getNumericCellValue();
			System.out.println(numericValue);
		} else if (cellType.equals("STRING")) {
			String stringValue = sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println(stringValue);
		}
		// workbook.close();
	}
}
