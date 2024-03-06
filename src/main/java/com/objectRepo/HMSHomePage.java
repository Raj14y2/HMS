package com.objectRepo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert.*;

import com.HMS.genericUtilities.WebDriverUtilities;

public class HMSHomePage
{
	WebDriverUtilities wu=new WebDriverUtilities();

	
	//Declaration
	@FindBy(xpath = "//div[@class='text list_1_of_2' and contains(.,'Patients')]/descendant::a[text()='Click Here']")
	private WebElement clickPatient;

	@FindBy(xpath = "//div[@class='text list_1_of_2' and contains(.,'Doctors Login')]/descendant::a[text()='Click Here']")
	private WebElement clickDoc;

	@FindBy(xpath = "//div[@class='text list_1_of_2' and contains(.,'Admin Login')]/descendant::a[text()='Click Here']")
	private WebElement clickAdmin;

	@FindBy(xpath = "//a[text()='Hospital Management system']/ancestor::div[@class='header']/descendant::a[text()='Home']")
	private WebElement clickHome;

	@FindBy(xpath = "//a[text()='Hospital Management system']/ancestor::div[@class='header']/descendant::a[text()='contact']")
	private WebElement clickContact;

	//initialization
	public 	HMSHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//utilization
	public WebElement getClickPatient() {
		return clickPatient;
	}

	public WebElement getClickDoc() {
		return clickDoc;
	}

	public WebElement getClickAdmin() {
		return clickAdmin;
	}

	public WebElement getClickHome() {
		return clickHome;
	}

	public WebElement getClickContact() {
		return clickContact;
	}

	//Bussiness Libraries

	public void clickHereDoc()
	{
		clickDoc.click();
	}
	public void clickHereAdmin(WebDriver driver)
	{
		wu.eleVisibilityCheck(driver, 20, clickAdmin);
		clickAdmin.click();
	}
	public void clickHerePatient()
	{
		clickPatient.click();
	}


	public void homeTitle(WebDriver driver)
	{
		String ExpectedTitle="Hospital Management System";
		String ActualTitle = driver.getTitle();
		assertEquals(ActualTitle, ExpectedTitle,"validate Home page");
		
	}






}
