package com.actitime.testscript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genericutility.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.genericutility.ListenerImplementation.class)

public class ProjectModule extends BaseClass {

	@Test
	public void testCreateProject() throws InterruptedException {

		HomePage h = new HomePage(driver);
		h.getTaskTab().click();

		TaskListPage tl = new TaskListPage(driver);
		tl.getAddNewbtn().click();
		tl.getNewProject().click();
		tl.getProjectName().sendKeys("Soft Serve");
		tl.getAddProjectDD().click();
		tl.getSelectProjectInDD().click();
		tl.getAddDescription().sendKeys("Tell Something about your Project");
		tl.getCreateProject().click();
		Thread.sleep(3000);
	}
}
