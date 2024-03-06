  package com.objectRepo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HMS.genericUtilities.WebDriverUtilities;

public class DoctorDashboardPage
{
	WebDriverUtilities w=new WebDriverUtilities();
	@FindBy(xpath = "//span[text()=' Appointment History ']")
	private WebElement DocAppiontmentHis;

	@FindBy(xpath = "//span[text()=' Patients ']")
	private WebElement DocpatientDD;

	@FindBy(xpath = "//span[text()=' Add Patient']")
	private WebElement DocAddPatient;

	@FindBy(xpath = "//span[text()=' Manage Patient ']")
	private WebElement DocManagePatient;

	@FindBy(xpath = "//span[text()=' Search ']")
	private WebElement DocSearchPat;

	@FindBy(xpath = "//span[@class='username']")
	private WebElement DocProfileDD;

	@FindBy(xpath = "//a[normalize-space()='My Profile']")
	private WebElement DocProfileLink;

	@FindBy(xpath = "//a[normalize-space()='Change Password']")
	private WebElement DocChangePassword;

	@FindBy(xpath = "//a[normalize-space()='Log Out']")
	private WebElement DocLogout;

	public DoctorDashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getDocAppiontmentHis() {
		return DocAppiontmentHis;
	}

	public WebElement getDocpatientDD() {
		return DocpatientDD;
	}

	public WebElement getDocAddPatient() {
		return DocAddPatient;
	}

	public WebElement getDocManagePatient() {
		return DocManagePatient;
	}

	public WebElement getDocSearchPat() {
		return DocSearchPat;
	}

	public WebElement getDocProfileDD() {
		return DocProfileDD;
	}

	public WebElement getDocProfileLink() {
		return DocProfileLink;
	}

	public WebElement getDocChangePassword() {
		return DocChangePassword;
	}

	public WebElement getDocLogout() {
		return DocLogout;
	}

	//bussiness utilities
	public void docAppointmentHis()
	{
		DocAppiontmentHis.click();
	}
	public void docPatientDD1(WebDriver driver)
	{

		
		DocpatientDD.click();

	}
	public void docAddPatientLink()
	{
		DocAddPatient.click();
	}
	public void docManagePatientLink(WebDriver driver)
	{
		w.eleVisibilityCheck(driver, 20, DocManagePatient);
		DocManagePatient.click();
	}
	public void docSearchPatLink()
	{
		DocSearchPat.click();
	}
	public void docProfileDD()
	{
		DocProfileDD.click();
	}
	public void docProfileLink()
	{
		DocProfileLink.click();
	}
	public void docChangePassLink()
	{
		DocChangePassword.click();
	}
	public void docClickLogout()
	{
		DocLogout.click();
	}

	//bussiness library

	public void docLogout()
	{
		DocProfileDD.click();
		DocLogout.click();

	}
	public void docEprofile()
	{
		DocProfileDD.click();
		DocProfileLink.click();

	}
	public void docLogoutHome(WebDriver driver,String ExpData)
	{
		DocProfileDD.click();
		DocLogout.click();
		String title = driver.getTitle();
		if(title.contains(ExpData))
		{
			System.out.println("testCase Pass");
		}
		else
		{
			System.out.println("test case fail");
		}

	}

	public void docPatientDD(WebDriver driver)
	{
		w.eleVisibilityCheck(driver, 20, DocpatientDD);
		DocpatientDD.click();

	}

	public void docDBTitle(WebDriver driver)
	{
		String expTitle="Doctor | Dashboard";
	    String actTitle = driver.getTitle();
	    assertEquals(actTitle, expTitle);
	}


	public void docManagePaientPage(WebDriver driver)
	{
		String expTitle="Doctor | Manage Patients";
	    String actTitle = driver.getTitle();
	    assertEquals(actTitle, expTitle);
	}







}
