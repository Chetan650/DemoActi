package com.trello.qspiders.genericutility;

/**
 * This class will facilitate file handling to fetch the data from different files
 * @author Chetan B
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	/**
	 * We can read the common data from the property file in the form of key and value
	 * @author QASM6
	 * @param key
	 * @return value
	 * @throws IOException
	 */
	public String readDataFromPropertyFile(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/trellocommondata.properties");
		Properties pro = new Properties();
		pro.load(fis);
		String value = pro.getProperty(key);
		return value;
	}
}
