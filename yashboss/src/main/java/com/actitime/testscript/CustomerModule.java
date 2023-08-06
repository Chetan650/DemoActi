package com.actitime.testscript;

import org.testng.annotations.Listeners;

import com.actitime.genericutility.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.genericutility.ListenerImplementation.class)

public class CustomerModule extends BaseClass {

	public void testCreateCustomer() throws InterruptedException {
		HomePage h = new HomePage(driver);
		h.getTaskTab().click();

		TaskListPage tl = new TaskListPage(driver);
		tl.getAddNewbtn().click();
		tl.getNewCustomerMenu().click();
		tl.getCustomerName().sendKeys("SBI-003");
		tl.getCustomerDescription().sendKeys("Our Company");
		tl.getSelectCustomerDD().click();
		tl.getSelectCustInDD().click();
		tl.getCreateCustomer().click();
		Thread.sleep(3000);
	}

}
