package com.objectRepo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HMS.genericUtilities.WebDriverUtilities;

public class UserLoginPage
{
	WebDriverUtilities w=new WebDriverUtilities();
	@FindBy(xpath= "//input[@name='username']")
	private WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement user_password;

	@FindBy(xpath = "//button[@name='submit']")
	private WebElement Login;

	@FindBy(xpath = "//a[normalize-space()='Forgot Password ?']")
	private WebElement ForgotPassword;

	@FindBy(xpath = "//a[normalize-space()='Create an account']")
	private WebElement createAccount;

	//intialization
	public UserLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	//utilization
	public WebElement getUsername() {
		return username;
	}

	public WebElement getUser_password() {
		return user_password;
	}

	public WebElement getLogin() {
		return Login;
	}

	public WebElement getForgotPassword() {
		return ForgotPassword;
	}

	public WebElement getCreateAccount() {
		return createAccount;
	}

	//bussiness library


	public void userCreateLink(WebDriver driver)
	{
		w.eleVisibilityCheck(driver, 20,createAccount );
		createAccount.click();
	}
	public void userLoginN(String un,String pwd)
	{

		username.sendKeys(un);
		user_password.sendKeys(pwd);
		Login.click();

	}
	

	public void userlogPage(WebDriver driver)
	{
		String expTitle="User-Login";
	    String actTitle = driver.getTitle();
	    assertEquals(actTitle, expTitle);
	}


}
