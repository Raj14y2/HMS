package com.objectRepo;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorAddPatientPage
{

	@FindBy(xpath = "//input[@name='patname']")
	private WebElement Pname;

	@FindBy(xpath = "//input[@name='patcontact']")
	private WebElement PatContact;

	@FindBy(xpath = "//input[@name='patemail']")
	private WebElement Patemail;

	@FindBy(xpath = "//input[@name='patage']")
	private WebElement patAge;

	@FindBy(xpath = "//label[@for='rg-female']")
	private WebElement PatGenderfe;

	@FindBy(xpath = "//label[@for='rg-male']")
	private WebElement PatGenderMale;

	@FindBy(xpath = "//textarea[@name='pataddress']")
	private WebElement patAddress;

	@FindBy(xpath = "//textarea[@name='medhis']")
	private WebElement PatMedHis;

	@FindBy(xpath = "//button[@name='submit']")
	private WebElement ClickAdd;

	public DoctorAddPatientPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getPname() {
		return Pname;
	}

	public WebElement getPatContact() {
		return PatContact;
	}

	public WebElement getPatemail() {
		return Patemail;
	}

	public WebElement getPatAge() {
		return patAge;
	}

	public WebElement getPatGenderfe() {
		return PatGenderfe;
	}

	public WebElement getPatGenderMale() {
		return PatGenderMale;
	}

	public WebElement getPatAddress() {
		return patAddress;
	}

	public WebElement getPatMedHis() {
		return PatMedHis;
	}

	public WebElement getClickAdd() {
		return ClickAdd;
	}

	//bussiness libraries

	public void patName(String un)
	{
		Pname.sendKeys(un);
	}
	public void patCont(String contact)
	{
		PatContact.sendKeys(contact);
	}
	public void patEmail(String email)
	{
		Patemail.sendKeys(email);
	}
	public void patAge(String age)
	{
		patAge.sendKeys(age);
	}
	public void patGenderMale()
	{
		PatGenderMale.click();
	}
	public void patGenderFemale()
	{
		PatGenderfe.click();
	}
	public void patAdress(String address)
	{
		patAddress.sendKeys(address);
	}
	public void patMedHis(String his)
	{
		PatMedHis.sendKeys(his);
	}
	public void clickAddPat()
	{
		ClickAdd.click();
	}


	//bussiness library2

	public void addPatMale(String un,String contact,String email,String age,String address,String his)
	{
		Pname.sendKeys(un);
		PatContact.sendKeys(contact);
		Patemail.sendKeys(email);
		patAge.sendKeys(age);

		PatGenderMale.click();
		patAddress.sendKeys(address);
		PatMedHis.sendKeys(his);
		ClickAdd.click();
	}
	public void docAddPaientPage(WebDriver driver)
	{
		String expTitle="Doctor | Add Patient";
	    String actTitle = driver.getTitle();
	    assertEquals(actTitle, expTitle);
	}


	public void addPatFeMale(String un,String contact,String email,String age,String address,String his)
	{
		Pname.sendKeys(un);
		PatContact.sendKeys(contact);
		Patemail.sendKeys(email);
		patAge.sendKeys(age);
		PatGenderMale.click();
		patAddress.sendKeys(address);
		PatMedHis.sendKeys(his);
		ClickAdd.click();
	}

}
