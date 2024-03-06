package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HMS.genericUtilities.WebDriverUtilities;

public class DoctorEditDetailsPage
{

	WebDriverUtilities wl=new WebDriverUtilities();
	@FindBy(xpath = "//select[@name='Doctorspecialization']")
	private WebElement EdocSpec;

	@FindBy(xpath = "//input[@name='docname']")
	private WebElement EdocName;

	@FindBy(xpath = "//input[@name='docfees']")
	private WebElement EdocFee;

	@FindBy(xpath = "//input[@name='doccontact']")
	private WebElement EdocContact;

	@FindBy(xpath = "//input[@name='docemail']")
	private WebElement EdocEmail;

	@FindBy(xpath = "//textarea[@name='clinicaddress']")
	private WebElement EdocAddress;

	@FindBy(xpath = "//button[@name='submit']")
	private WebElement EdocUpdateBtn;

	public DoctorEditDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getEdocSpec() {
		return EdocSpec;
	}

	public WebElement getEdocName() {
		return EdocName;
	}

	public WebElement getEdocFee() {
		return EdocFee;
	}

	public WebElement getEdocContact() {
		return EdocContact;
	}

	public WebElement getEdocEmail() {
		return EdocEmail;
	}

	public WebElement getEdocAddress() {
		return EdocAddress;
	}

	public WebElement getEdocUpdateBtn() {
		return EdocUpdateBtn;
	}

	//business library
	public void docConfee(String Fee,WebDriver driver)
	{
		EdocFee.sendKeys(Fee);
		EdocUpdateBtn.click();
		wl.alertAccept(driver);

	}


}
