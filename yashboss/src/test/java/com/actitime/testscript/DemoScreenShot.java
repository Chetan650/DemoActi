package com.actitime.testscript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.actitime.testscript.ListenerClass.class)
public class DemoScreenShot extends ListenerClass {
	@Test
	public void openBrowser() {
		System.out.println("Browser has been opened");
	}

}
