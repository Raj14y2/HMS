package com.objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPatientSearchPage
{

	@FindBy(xpath = "//input[@id='searchdata']")
	private WebElement SearchTextField;

	@FindBy(xpath = "//button[@id='submit']")
	private WebElement searchBtn;

	public AdminPatientSearchPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getSearchTextField() {
		return SearchTextField;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}



}
