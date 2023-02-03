package com.zysk.ah.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zysk.addressHealth.base.BaseTest;

public class DetailsPage extends BaseTest{
	
	public DetailsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='ml-2 flex-shrink-0']/p")
	WebElement status;
	
	@FindBy(xpath = "//button[.='Edit']")
	WebElement editButton;
	
	
	
	public boolean status()
	{
		return status.isDisplayed();
	}
	
	public EditPage clickOnEditButton()
	{
		editButton.click();
		return new EditPage();
	}

}
