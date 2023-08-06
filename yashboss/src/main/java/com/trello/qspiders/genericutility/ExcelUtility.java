package com.trello.qspiders.genericutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String readStringData(String sheetName, int rowIndex, int cellIndex)
			throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/trelloworkbookdata.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String cellData = workbook.getSheet(sheetName).getRow(rowIndex).getCell(cellIndex).getStringCellValue();
		workbook.close();
		return cellData;

	}
}
