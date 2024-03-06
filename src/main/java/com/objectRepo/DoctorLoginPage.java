package com.objectRepo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorLoginPage
{
	@FindBy(xpath = "//input[@name='username']")
	private WebElement DocUser;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement DocPass;

	@FindBy(xpath = "//button[@name='submit']")
	private WebElement login;

	@FindBy(xpath = "//a[normalize-space()='Forgot Password ?']")
	private WebElement ForgotDocPass;

	//intialization
	public DoctorLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getDocUser() {
		return DocUser;
	}

	public WebElement getDocPass() {
		return DocPass;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getForgotDocPass() {
		return ForgotDocPass;
	}

	//bussiness libraries
	public void docLogin(String un,String pwd)
	{
		DocUser.sendKeys(un);
		DocPass.sendKeys(pwd);
		login.click();

	}
	public void forgotDocPass()
	{
		ForgotDocPass.click();
	}

	public void docLoginTitle(WebDriver driver)
	{
		String expTitle="Doctor Login";
	    String actTitle = driver.getTitle();
	    assertEquals(actTitle, expTitle);
	}


}
