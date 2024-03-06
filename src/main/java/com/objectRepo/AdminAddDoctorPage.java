package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminAddDoctorPage
{

	@FindBy(xpath = "//select[@name='Doctorspecialization']")
	private WebElement DocSpecDD;

	@FindBy(xpath = "//input[@name='docname']")
	private WebElement DocName;

	@FindBy(xpath = "//textarea[@name='clinicaddress']")
	private WebElement DocAddress;

	@FindBy(xpath = "//input[@name='docfees']")
	private WebElement DocFee;

	@FindBy(xpath = "//input[@name='doccontact']")
	private WebElement DocContact;

	@FindBy(xpath = "//input[@name='docemail']")
	private WebElement DocEmail;

	@FindBy(xpath = "//input[@name='npass']")
	private WebElement DocPassword;

	@FindBy(xpath = "//input[@name='cfpass']")
	private WebElement DocConfirmPass;

	@FindBy(xpath = "//button[@name='submit']")
	private WebElement Submit;

	public AdminAddDoctorPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getDocSpecDD() {
		return DocSpecDD;
	}

	public WebElement getDocName() {
		return DocName;
	}

	public WebElement getDocAddress() {
		return DocAddress;
	}

	public WebElement getDocFee() {
		return DocFee;
	}

	public WebElement getDocContact() {
		return DocContact;
	}

	public WebElement getDocEmail() {
		return DocEmail;
	}

	public WebElement getDocPassword() {
		return DocPassword;
	}

	public WebElement getDocConfirmPass() {
		return DocConfirmPass;
	}

	public WebElement getSubmit() {
		return Submit;
	}



}
