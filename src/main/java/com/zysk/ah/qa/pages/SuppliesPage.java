package com.zysk.ah.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zysk.addressHealth.base.BaseTest;

public class SuppliesPage extends BaseTest{
	public SuppliesPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@aria-label='Next page']")
	WebElement nextPage;
	
	public void suppliesPagination() throws InterruptedException{
		while (!nextPage.getAttribute("aria-disabled").equals("true")){
			scrollBy();
			Thread.sleep(2000);
			nextPage.click();
		    Thread.sleep(2000); 
		}
	}
}