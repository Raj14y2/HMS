package com.objectRepo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert.*;

import com.HMS.genericUtilities.WebDriverUtilities;

public class AdminLoginPage
{

	WebDriverUtilities wu=new WebDriverUtilities();
	@FindBy(xpath = "//input[@name='username']")
	private WebElement AdminuserName;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement AdminPassword;

	@FindBy(xpath = "//button[@name='submit']")
	private WebElement AdminloginBtn;

	public AdminLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAdminuserName() {
		return AdminuserName;
	}

	public WebElement getAdminPassword() {
		return AdminPassword;
	}

	public WebElement getLoginBtn() {
		return AdminloginBtn;
	}

	//bussiness libraries

	public void adminLogin(String un,String pwd,WebDriver driver) throws InterruptedException
	{
		wu.eleVisibilityCheck(driver, 20, AdminuserName);
		AdminuserName.sendKeys(un);
		wu.eleVisibilityCheck(driver, 20, AdminPassword);
		AdminPassword.sendKeys(pwd);
		wu.eleVisibilityCheck(driver, 20, AdminloginBtn);
		Thread.sleep(3000);
		AdminloginBtn.click();
		Thread.sleep(3000);

	}

	public void adminLogPage(WebDriver driver)
	{
		String exptitle="Admin-Login";
		String actTitle = driver.getTitle();
		assertEquals(actTitle, exptitle);
		
	}



}
