package com.objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DoctorSearchPatientpage
{

	@FindBy(xpath = "//input[@id='searchdata']")
	private WebElement searchPatText;

	@FindBy(xpath = "//button[@id='submit']")
	private WebElement searchbtn;

	public DoctorSearchPatientpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getSearchPatText() {
		return searchPatText;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public void searchPatNum(String num,WebDriver driver,String name)
	{
		searchPatText.sendKeys(num);
		searchbtn.click();
		WebElement pname = driver.findElement(By.xpath("//td[text()='"+name+"']"));
		boolean displayed = pname.isDisplayed();
		if(displayed)
		{
			System.out.println(" Testcase pass");
		}
		else
		{
			System.out.println("TestCase fail");
		}
	}
	public void searchPatName(String name,WebDriver driver,String patname)
	{
		searchPatText.sendKeys(name);
		searchbtn.click();
		WebElement pname = driver.findElement(By.xpath("//td[text()='"+patname+"']"));
		boolean displayed = pname.isDisplayed();
		if(displayed)
		{
			System.out.println(" Testcase pass");
		}
		else
		{
			System.out.println("TestCase fail");
		}
	}



}
