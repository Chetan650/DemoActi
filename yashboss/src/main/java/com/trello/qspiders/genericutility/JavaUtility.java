package com.trello.qspiders.genericutility;

/**
 * this class contains java accessories to which will facilitate in building the automation script
 * @author Chetan B
 */
import java.time.LocalDateTime;

public class JavaUtility {
	/**
	 * This method will be used to provide the unique filename of the screenshot
	 * @author QASM6
	 * @return timeStamp
	 */
	public String timeStamp() {
		String timestamp = LocalDateTime.now().toString().replace(':', '-');
		return timestamp;
	}
}
