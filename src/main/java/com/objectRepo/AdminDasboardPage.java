package com.objectRepo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.HMS.genericUtilities.WebDriverUtilities;

public class AdminDasboardPage
{

	WebDriverUtilities wb=new WebDriverUtilities();
	@FindBy(xpath = "//span[text()=' Doctors ']")
	private WebElement DoctorDropDown;

	@FindBy(xpath = "//span[text()=' Doctor Specialization ']")
	private WebElement DocSpecialization;

	@FindBy(xpath = "//span[text()=' Add Doctor']")
	private WebElement AddDoc;

	@FindBy(xpath = "//span[text()=' Manage Doctors ']")
	private WebElement ManageDoctors;

	@FindBy(xpath = "//span[text()=' Users ']")
	private WebElement usersDropDown;

	@FindBy(xpath = "//span[text()=' Manage Users ']")
	private WebElement ManageUsers;

	@FindBy(xpath = "//span[text()=' Patients ']")
	private WebElement PatientsDD;

	@FindBy(xpath = "//span[text()=' Manage Patients ']")
	private WebElement ManagePatients;

	@FindBy(xpath = "//span[text()=' Appointment History ']")
	private WebElement AppointmentHis;

	@FindBy(xpath = "//span[text()=' Conatctus Queries ']")
	private WebElement contactQueriesDD;

	@FindBy(xpath = "//span[text()=' Unread Query ']")
	private WebElement UnreadQuery;

	@FindBy(xpath = "//span[text()=' Read Query ']")
	private WebElement readQuery;

	@FindBy(xpath = "//span[text()=' Doctor Session Logs ']")
	private WebElement DocSessionLogs;

	@FindBy(xpath = "//span[text()=' User Session Logs ']")
	private WebElement userSessionLogs;

	@FindBy(xpath = "//span[text()=' Reports ']")
	private WebElement ReportsDD;

	@FindBy(xpath = "//span[text()='B/w dates reports ']")
	private WebElement DatesReports;

	@FindBy(xpath = "//span[text()=' Patient Search ']")
	private WebElement SearchPatient;

	@FindBy(xpath = "//span[@class='username']")
	private WebElement ProfileDD;

	@FindBy(xpath = "//a[normalize-space()='Change Password']")
	private WebElement changePass;

	@FindBy(xpath = "//a[normalize-space()='Log Out']")
	private WebElement AdminLogOut;

	@FindBy(xpath = "//a[@class='sidebar-toggler pull-right visible-md visible-lg']")
	private WebElement ClickHam;

	public AdminDasboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getDoctorDropDown() {
		return DoctorDropDown;
	}

	public WebElement getDocSpecialization() {
		return DocSpecialization;
	}

	public WebElement getAddDoc() {
		return AddDoc;
	}

	public WebElement getManageDoctors() {
		return ManageDoctors;
	}

	public WebElement getUsersDropDown() {
		return usersDropDown;
	}

	public WebElement getManageUsers() {
		return ManageUsers;
	}

	public WebElement getPatientsDD() {
		return PatientsDD;
	}

	public WebElement getManagePatients() {
		return ManagePatients;
	}

	public WebElement getAppointmentHis() {
		return AppointmentHis;
	}

	public WebElement getContactQueriesDD() {
		return contactQueriesDD;
	}

	public WebElement getUnreadQuery() {
		return UnreadQuery;
	}

	public WebElement getReadQuery() {
		return readQuery;
	}

	public WebElement getDocSessionLogs() {
		return DocSessionLogs;
	}

	public WebElement getUserSessionLogs() {
		return userSessionLogs;
	}

	public WebElement getReportsDD() {
		return ReportsDD;
	}

	public WebElement getDatesReports() {
		return DatesReports;
	}

	public WebElement getSearchPatient() {
		return SearchPatient;
	}

	public WebElement getProfileDD() {
		return ProfileDD;
	}

	public WebElement getChangePass() {
		return changePass;
	}

	public WebElement getAdminLogOut() {
		return AdminLogOut;
	}

	public WebElement getClickHam() {
		return ClickHam;
	}

	//bussiness libraries
	public void adminlogout()
	{
		AdminLogOut.click();
	}
	public void adminChangePass()
	{
		changePass.click();
	}
	public void adminProfileDD()
	{
		ProfileDD.click();
	}
	public void adminSearchPatientLink()
	{
		SearchPatient.click();
	}
	public void adminDateReportsLink(WebDriver driver)
	{
		wb.eleVisibilityCheck(driver, 20, DatesReports);
		DatesReports.click();
	}
	public void adminReportsLink()
	{
		ReportsDD.click();
	}
	public void adminDocDdLink()
	{
		DoctorDropDown.click();
	}
	public void adminDocSpecLink()
	{
		DocSpecialization.click();
	}
	public void adminAddDoctorLink()
	{
		AddDoc.click();
	}
	public void adminManageDocLink()
	{
		ManageDoctors.click();
	}
	public void adminUsersDD()
	{
		usersDropDown.click();
	}
	public void adminManageUsersLink(WebDriver driver)
	{
		wb.eleClickAbleCheck(driver, 20, ManageUsers);
		ManageUsers.click();
	}
	public void adminPatientsDD()
	{
		PatientsDD.click();
	}
	public void adminManagePatLink(WebDriver driver)
	{
		wb.eleVisibilityCheck(driver, 10, ManagePatients);
		ManagePatients.click();
	}
	public void adminAppointmentHis(WebDriver driver)
	{
		wb.eleVisibilityCheck(driver, 30, AppointmentHis);
		AppointmentHis.click();
	}
	public void adminContactQueriesDD()
	{
		contactQueriesDD.click();
	}
	public void adminUnreadQ()
	{
		UnreadQuery.click();
	}
	public void adminreadQ()
	{
		readQuery.click();
	}
	public void adminDocSession()
	{
		DocSessionLogs.click();
	}
	public void adminUserSession()
	{
		userSessionLogs.click();
	}

	//bussiness libraries
	public void adminCheckPatient(WebDriver driver,String expData,String name) throws InterruptedException
	{
		adminPatientsDD();
		adminManagePatLink(driver);
		Thread.sleep(3000);
	    WebElement eye = driver.findElement(By.xpath("//td[text()='"+name+"']/parent::tr/td[last()]/a/i[@class='fa fa-eye']"));
	    wb.eleClickAbleCheck(driver, 10, eye);
	    eye.click();
		String title = driver.getTitle();
		if(title.contains(expData))
		{
			System.out.println("test case pass");
		}
		else
		{
			System.out.println("testCase fail");
		}
	}

	public void deleteUser(WebDriver driver,String Name)
	{
		usersDropDown.click();
		adminManageUsersLink(driver);
		wb.scrollToBottomJs(driver);
		driver.findElement(By.xpath("//td[text()='"+Name+"']/parent::tr/td[last()]/div/a")).click();
		wb.alertAccept(driver);
	}
	public void adminLogoutE()
	{
		ProfileDD.click();
		AdminLogOut.click();
	}
	public void adminDboardPage(WebDriver driver)
	{
		String expTitle="Admin | Dashboard";
	    String actTitle = driver.getTitle();
	    assertEquals(actTitle, expTitle);
	}

	public void viewPatientsPage(WebDriver driver)
	{
		String expTitle="Admin | View Patients";
	    String actTitle = driver.getTitle();
	    assertEquals(actTitle, expTitle);
	}
	public void doctorLogSession(WebDriver driver)
	{
		String expTitle="Admin | Doctor Session Logs";
	    String actTitle = driver.getTitle();
	    assertEquals(actTitle, expTitle);
	}
	public void userLogSession(WebDriver driver)
	{
		String expTitle="Admin | User Session Logs";
	    String actTitle = driver.getTitle();
	    assertEquals(actTitle, expTitle);
	}
	public void reportsPage(WebDriver driver)
	{
		String expTitle="B/w dates reports | Admin";
	    String actTitle = driver.getTitle();
	    assertEquals(actTitle, expTitle);
	}
	public void appointMentHisPage(WebDriver driver)
	{
		String expTitle="Patients | Appointment History";
	    String actTitle = driver.getTitle();
	    assertEquals(actTitle, expTitle);
	}
	





}
