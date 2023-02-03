package com.zysk.ah.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zysk.addressHealth.base.BaseTest;

public class ComplaintsPage extends BaseTest {

	@FindBy(xpath = "//h3")
	WebElement complaintsLabel;

	@FindBy(xpath = "//nav[contains(@class,'-mb-px flex')]/a")
	List<WebElement> complaintSections;

	@FindBy(xpath = "//div[@class='mt-2 ']/div[1]/p[1]")
	List<WebElement> studentName;

	@FindBy(xpath = "//a[@aria-label='Next page']")
	WebElement nextPage;

	@FindBy(xpath = "(//div[contains(@class,'flex flex-col')]/div[1])/p[1]")
	List<WebElement> complaintName;
	
	By toolBar=By.className("minimal-toolbar_iconButton__hBqdp");
	By disableForSession=By.className("popper_buttonClassName__9mV8V");
	

	public ComplaintsPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyComplaintsPageUrl() {
		return driver.getCurrentUrl();
	}

	public boolean verifyComplaintsLabel() {
		return complaintsLabel.isDisplayed();
	}

	public void complaintSections(int section) throws InterruptedException {
		for (int i = 0; i < 3; i++) {
			complaintSections.get(section).click();
			break;
		}
		Thread.sleep(1000);
	}

	public DetailsPage searchComplaintByStudentName() throws InterruptedException {
		scrollBy();
		// do {
		for (int i = 0; i < studentName.size(); i++) {
			if ((studentName.get(i).getText().contains("MOHAK NATARAJAN"))
					&& (complaintName.get(i).getText().contains("Convulsions"))) {
				studentName.get(i).click();
				break;
			}
		}
		// }
		// while(nextPage.isDisplayed());
		Thread.sleep(2000);
		return new DetailsPage();
	}

	public void toolBarMessage() throws InterruptedException {
		scrollBy();
		Thread.sleep(2000);
		driver.findElement(toolBar).click();
		if(driver.findElement(disableForSession).isDisplayed())
		{
			Thread.sleep(2000);
			driver.findElement(disableForSession).click();
		}
		
	}
	
	public void nextPage() throws InterruptedException
	{
		while (!nextPage.getAttribute("aria-disabled").equals("true")) 
		{
			nextPage.click();
		    Thread.sleep(1000);
//		    namesElements = driver.findElements(By.cssSelector("#example>tbody>tr>td:nth-child(1)"));
//		    for (WebElement nameEle : namesElements) {
//		     names.add(nameEle.getText());
//		    }
//		    nextButtonClass = driver.findElement(By.id("example_next")).getAttribute("class");
//		   }
		}
	}

	
	public void suppliesPagination() throws InterruptedException
	{
		while (!nextPage.getAttribute("aria-disabled").equals("true")) 
		{
			nextPage.click();
		    Thread.sleep(1000);
		    
		    
		}
		
	}
	

}
