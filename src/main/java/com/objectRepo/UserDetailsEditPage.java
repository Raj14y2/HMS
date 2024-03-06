package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDetailsEditPage
{
	@FindBy(xpath = "//input[@name='fname']")
	private WebElement patUsername;

	@FindBy(xpath = "//input[@name='city']")
	private WebElement patCity;

	@FindBy(xpath = "//select[@name='gender']")
	private WebElement pGen;

	@FindBy(xpath = "//a[text()='Update your email id']")
	private WebElement changEmail;

	@FindBy(xpath = "//button[@name='submit']")
	private WebElement UpdateBtn;

	@FindBy(xpath = "//input[@id='email']")
	private WebElement newEmail;

	@FindBy(xpath = "//button[@id='submit']")
	private WebElement Eupdate;

	public UserDetailsEditPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getPatUsername() {
		return patUsername;
	}

	public WebElement getPatCity() {
		return patCity;
	}

	public WebElement getpGen() {
		return pGen;
	}

	public WebElement getChangEmail() {
		return changEmail;
	}

	public WebElement getUpdateBtn() {
		return UpdateBtn;
	}

	public WebElement getNewEmail() {
		return newEmail;
	}

	public WebElement getEupdate() {
		return Eupdate;
	}

	//business library
	public void updateUserEmail(String email)
	{

		changEmail.click();
		newEmail.sendKeys(email);
		Eupdate.click();


	}














}
