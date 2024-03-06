package com.objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HMS.genericUtilities.WebDriverUtilities;

public class DocAddMedicalHistory extends WebDriverUtilities
{


	WebDriverUtilities wlib=new WebDriverUtilities();
	@FindBy(xpath = "//button[text()='Add Medical History']")
	private WebElement AddMedHisBtn;

	@FindBy(xpath = "//input[@name='bp']")
	private WebElement patBp;

	@FindBy(xpath = "//input[@name='bs']")
	private WebElement patBsugar;

	@FindBy(xpath = "//input[@name='weight']")
	private WebElement patWeight;

	@FindBy(xpath = "//input[@name='temp']")
	private WebElement patTemp;

	@FindBy(xpath = "//textarea[@name='pres']")
	private WebElement patPresc;

	@FindBy(xpath = "//button[@name='submit']")
	private WebElement patSubmit;

	@FindBy(xpath = "//button[@class='btn btn-secondary']")
	private WebElement patClose;

	public DocAddMedicalHistory(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddMedHisBtn() {
		return AddMedHisBtn;
	}

	public WebElement getPatBp() {
		return patBp;
	}

	public WebElement getPatBsugar() {
		return patBsugar;
	}

	public WebElement getPatWeight() {
		return patWeight;
	}

	public WebElement getPatTemp() {
		return patTemp;
	}

	public WebElement getPatPresc() {
		return patPresc;
	}

	public WebElement getPatSubmit() {
		return patSubmit;
	}

	public WebElement getPatClose() {
		return patClose;
	}

	//bussiness logic

	public void DocAddMedHis(WebDriver driver,String bp,String sugar,String weight,String temp,String presc) throws InterruptedException
	{
		
	//	Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//table[@class='table table-hover']/tbody/tr[last()]/td[last()]"));
		wlib.eleVisibilityCheck(driver, 20, ele);
		ele.click();
	//	Thread.sleep(5000);
	//	AddMedHisBtn.click();
		addMEDhisBtn(driver);
		wlib.eleVisibilityCheck(driver, 10, patBp);
		patBp.sendKeys(bp);
		wlib.eleVisibilityCheck(driver, 10, patBsugar);
		patBsugar.sendKeys(sugar);
		wlib.eleVisibilityCheck(driver, 10, patWeight);
		patWeight.sendKeys(weight);
		wlib.eleVisibilityCheck(driver, 10, patTemp);
		patTemp.sendKeys(temp);
		wlib.eleVisibilityCheck(driver, 10, patPresc);
		patPresc.sendKeys(presc);
		wlib.eleVisibilityCheck(driver, 10, patSubmit);
		patSubmit.click();
		wlib.alertAccept(driver);

	}
	public void addMEDhisBtn(WebDriver driver)
	{
		wlib.eleVisibilityCheck(driver, 30, AddMedHisBtn);
		AddMedHisBtn.click();
	}



}
