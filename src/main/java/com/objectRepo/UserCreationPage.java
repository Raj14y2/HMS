package com.objectRepo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HMS.genericUtilities.WebDriverUtilities;

public class UserCreationPage extends WebDriverUtilities{

	WebDriverUtilities wb=new WebDriverUtilities();
	@FindBy(xpath = "//input[@name='full_name']")
	private WebElement username;

	@FindBy(xpath = "//input[@name='address']")
	private WebElement UserAddress;

	@FindBy(xpath = "//input[@name='city']")
	private WebElement UserCityAdd;

	@FindBy(xpath="//input[@name='email']")
	private WebElement UserEmail;

	@FindBy(xpath = "//input[@name='password']")
	private WebElement UserPassword;

	@FindBy(xpath = "//input[@name='password_again']")
	private WebElement userconfirmPass;

	@FindBy(xpath = "//input[@value='female']")
	private WebElement femaleUserRadiobth;

	@FindBy(xpath = "//label[@for='rg-male']")
	private WebElement MaleUserRadioBtn;

	@FindBy(xpath = "//input[@id='agree']")
	private WebElement iagreeUser;

	@FindBy(xpath = "//a[normalize-space()='Log-in']")
	private WebElement userLoginLink;

	@FindBy(xpath = "//button[@id='submit']")
	private WebElement SubmitUserBtn;

	public UserCreationPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getUserAddress() {
		return UserAddress;
	}

	public WebElement getUserCityAdd() {
		return UserCityAdd;
	}

	public WebElement getUserEmail() {
		return UserEmail;
	}

	public WebElement getUserPassword() {
		return UserPassword;
	}

	public WebElement getUserconfirmPass() {
		return userconfirmPass;
	}

	public WebElement getFemaleUserRadiobth() {
		return femaleUserRadiobth;
	}

	public WebElement getMaleUserRadioBtn() {
		return MaleUserRadioBtn;
	}

	public WebElement getIagreeUser() {
		return iagreeUser;
	}

	public WebElement getUserLoginLink() {
		return userLoginLink;
	}

	public WebElement getSubmitUserBtn() {
		return SubmitUserBtn;
	}

	//bussiness logic

	public void userMaleCreation(WebDriver driver,String un,String Address,String city,String email,String Pwd,String Cpwd)
	{
		username.sendKeys(un);
		UserAddress.sendKeys(Address);
		UserCityAdd.sendKeys(city);
		UserEmail.sendKeys(email);
		UserPassword.sendKeys(Pwd);
		userconfirmPass.sendKeys(Cpwd);
		MaleUserRadioBtn.click();
		SubmitUserBtn.click();
		wb.alertAccept(driver);
		userLoginLink.click();



	}

	public void userFeMaleCreation(WebDriver driver,String un,String Address,String city,String email,String Pwd,String Cpwd)
	{
		username.sendKeys(un);
		UserAddress.sendKeys(Address);
		UserCityAdd.sendKeys(city);
		UserEmail.sendKeys(email);
		UserPassword.sendKeys(Pwd);
		userconfirmPass.sendKeys(Cpwd);
		femaleUserRadiobth.click();
		SubmitUserBtn.click();
		wb.alertAccept(driver);
		userLoginLink.click();



	}

	public void userRegistrationPage(WebDriver driver)
	{
		String expTitle="User Registration";
	    String actTitle = driver.getTitle();
	    assertEquals(actTitle, expTitle);
	}


}
