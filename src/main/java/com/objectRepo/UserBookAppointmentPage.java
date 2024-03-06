package com.objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HMS.genericUtilities.WebDriverUtilities;

public class UserBookAppointmentPage
{

	WebDriverUtilities wl=new WebDriverUtilities();
	@FindBy(xpath = "//select[@name='Doctorspecialization']")
	private WebElement SelectDocSpec;

	@FindBy(xpath = "//select[@name='doctor']")
	private WebElement selectDoc;

	@FindBy(xpath = "//button[@name='submit']")
	private WebElement submitBook;

	public UserBookAppointmentPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getSelectDocSpec() {
		return SelectDocSpec;
	}

	public WebElement getSelectDoc() {
		return selectDoc;
	}

	public WebElement getSubmitBook() {
		return submitBook;
	}


	public void userBookAPP(String spec,String doc,WebDriver driver,String month,String t,String d,String year) throws InterruptedException
	{
		wl.handleDropDown(spec,SelectDocSpec);
		wl.handleDropDown(doc, selectDoc);
		driver.findElement(By.xpath("//input[@name='appdate']")).click();
		Thread.sleep(3000);
		WebElement date = driver.findElement(By.xpath("//span[text()='"+year+"']/ancestor::div[@class='datepicker-years']/preceding-sibling::div[@class='datepicker-months']/descendant::span[text()='"+month+"']/ancestor::div[@class='datepicker-months']/preceding-sibling::div[@class='datepicker-days']/descendant::td[@class='day' and text()='"+d+"']"));
		date.click();
		Thread.sleep(3000);
		WebElement time = driver.findElement(By.xpath("//input[@name='apptime']"));
		time.sendKeys(t);
		submitBook.click();
		wl.alertAccept(driver);


	}



}
