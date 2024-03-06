package com.objectRepo;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminAddDoctorSpecilazitionPage
{

	@FindBy(xpath = "//input[@name='doctorspecilization']")
	private WebElement DocSpecTextField;

	@FindBy(xpath = "//button[@name='submit']")
	private WebElement submitBtn;

	public AdminAddDoctorSpecilazitionPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getDocSpecTextField() {
		return DocSpecTextField;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}

	public void addSpecialization(String sp,WebDriver driver)
	{
		DocSpecTextField.sendKeys(sp);
		submitBtn.click();
		WebElement conm = driver.findElement(By.xpath("//p[normalize-space()='Doctor Specialization added successfully !!']	"));
		boolean di = conm.isDisplayed();
		if(di)
		{
			System.out.println("Confirmation message is Displayed");
		}
		else
		{
			System.out.println("confirmation message is not displayed");
		}
	}

	public void docSpecPage(WebDriver driver)
	{
		String expTitle="Admin | Doctor Specialization";
	    String actTitle = driver.getTitle();
	    assertEquals(actTitle, expTitle);
	}

}
