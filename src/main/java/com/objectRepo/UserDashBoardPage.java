package com.objectRepo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HMS.genericUtilities.WebDriverUtilities;

public class UserDashBoardPage
{
	WebDriverUtilities wu=new WebDriverUtilities();
	@FindBy(xpath = " //span[text()=' Book Appointment ']")
	private WebElement BookAppointmentLink;

	@FindBy(xpath = " //span[text()=' Appointment History ']")
	private WebElement UserAppointmentHis;

	@FindBy(xpath = " //span[text()=' Medical History ']")
	private WebElement UserMedicalHis;

	@FindBy(xpath = " //span[@class='username']")
	private WebElement UserProfileDD;

	@FindBy(xpath = "//a[normalize-space()='My Profile']")
	private WebElement userProfileLink;

	@FindBy(xpath = "//a[normalize-space()='Change Password']")
	private WebElement UserChangePasswordLink;

	@FindBy(xpath = "//a[normalize-space()='Log Out']")
	private WebElement UserLogoutLink;

	public UserDashBoardPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getBookAppointmentLink() 
	{
		return BookAppointmentLink;
	}

	public WebElement getUserAppointmentHis() {
		return UserAppointmentHis;
	}

	public WebElement getUserMedicalHis() {
		return UserMedicalHis;
	}

	public WebElement getUserProfileDD() {
		return UserProfileDD;
	}

	public WebElement getUserProfileLink() {
		return userProfileLink;
	}

	public WebElement getUserChangePasswordLink() {
		return UserChangePasswordLink;
	}

	public WebElement getUserLogoutLink() {
		return UserLogoutLink;
	}
	//bussiness libraries

	public void userBookAppLink(WebDriver driver)
	{
		wu.eleClickAbleCheck(driver, 20, BookAppointmentLink);
		BookAppointmentLink.click();
	}
	public void userAppHistory()
	{
		UserAppointmentHis.click();
	}
	public void userMedHistory()
	{
		UserMedicalHis.click();
	}
	public void UserProfDD(WebDriver driver)
	{
		wu.eleVisibilityCheck(driver, 20, UserProfileDD);
		UserProfileDD.click();
	}
	public void userMyProfileLink(WebDriver driver)
	{
		wu.eleVisibilityCheck(driver, 20,userProfileLink);
		userProfileLink.click();
	}
	public void userChangePwd()
	{
		UserChangePasswordLink.click();
	}
	public void userLogOUt()
	{
		UserLogoutLink.click();
	}

	public void userCheckNlogOut(WebDriver driver,String expData) throws InterruptedException
	{

	    userMedHistory();
		driver.findElement(By.xpath("//table[@class='table table-hover']/tbody/tr[last()]/td[last()]/a/i[@class='fa fa-eye']")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		Thread.sleep(3000);
		if(title.contains(expData))
		{
			System.out.println("testcase pass");
		}
		else
		{
			System.out.println("testcase fail");
		}
		UserProfDD(driver);
		userLogOUt();


	}
	public void userLogout()
	{
		UserProfileDD.click();
		UserLogoutLink.click();
	}

	public void userDBPage(WebDriver driver)
	{
		String expTitle="User | Dashboard";
	    String actTitle = driver.getTitle();
	    assertEquals(actTitle, expTitle);
	}




}
