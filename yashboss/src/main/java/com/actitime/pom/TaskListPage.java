package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addNewbtn;

	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newCustomerMenu;

	@FindBy(xpath = "//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement customerName;

	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement customerDescription;

	@FindBy(xpath = "//div[.='- Select Customer -' and @class='emptySelection']")
	private WebElement selectCustomerDD;

	@FindBy(xpath = "//div[.='Our company' and @class='itemRow cpItemRow ']")
	private WebElement selectCustInDD;

	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createCustomer;

	@FindBy(xpath = "//div[.='+ New Project']")
	private WebElement newProject;

	@FindBy(xpath = "//input[@placeholder='Enter Project Name' and @class]")
	private WebElement projectName;

	@FindBy(xpath = "//div[.='-- Please Select Customer to Add Project for  --' and @class='emptySelection']")
	private WebElement addProjectDD;

	@FindBy(xpath = "//div[@class='scrollableDropdownView']//div[.='Our company']")
	private WebElement selectProjectInDD;

	@FindBy(xpath = "//textarea[@placeholder='Add Project Description']")
	private WebElement addDescription;

	@FindBy(xpath = "//div[.='Create Project']")
	private WebElement createProject;

	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddNewbtn() {
		return addNewbtn;
	}

	public WebElement getNewCustomerMenu() {
		return newCustomerMenu;
	}

	public WebElement getCustomerName() {
		return customerName;
	}

	public WebElement getCustomerDescription() {
		return customerDescription;
	}

	public WebElement getSelectCustomerDD() {
		return selectCustomerDD;
	}

	public WebElement getSelectCustInDD() {
		return selectCustInDD;
	}

	public WebElement getCreateCustomer() {
		return createCustomer;
	}

	public WebElement getNewProject() {
		return newProject;
	}

	public WebElement getProjectName() {
		return projectName;
	}

	public WebElement getAddProjectDD() {
		return addProjectDD;
	}

	public WebElement getSelectProjectInDD() {
		return selectProjectInDD;
	}

	public WebElement getAddDescription() {
		return addDescription;
	}

	public WebElement getCreateProject() {
		return createProject;
	}

}
