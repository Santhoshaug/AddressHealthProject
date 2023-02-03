/*
 * @author Santhosha U G
 * 
 */

package com.zysk.ah.qa.testcases;

import java.io.IOException;

import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.zysk.addressHealth.base.BaseTest;
import com.zysk.addressHealth.util.TestUtil;
import com.zysk.ah.qa.pages.ComplaintsPage;
import com.zysk.ah.qa.pages.ContactsPage;
import com.zysk.ah.qa.pages.DetailsPage;
import com.zysk.ah.qa.pages.HomePage;
import com.zysk.ah.qa.pages.LoginPage;

public class ComplaintsPageTest extends BaseTest {

	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	// ContactsPage contactsPage;
	ComplaintsPage complaintsPage;
	DetailsPage detailsPage;

	// String sheetName = "contacts";

	String complaintsPageUrl = "https://address-health-revamp-git-dev-v2-zysktech.vercel.app/complaints";

	public ComplaintsPageTest() {
		super();

	}

	@BeforeMethod
	public void setUp() throws InterruptedException {

		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		complaintsPage = homePage.clickOnComplaintsViewalLink();

	}

	@Test(priority=1)
	public void verifyComplaintPage() {
		Assert.assertEquals(complaintsPage.verifyComplaintsPageUrl(), complaintsPageUrl);
		Assert.assertTrue(complaintsPage.verifyComplaintsLabel(), "Complaints");
	}

	@Test(priority = 2)
	public void detailsPageTest() throws InterruptedException {
		complaintsPage.complaintSections(2);
		detailsPage = complaintsPage.searchComplaintByStudentName();
		detailsPage.status();
		Thread.sleep(5000);
	}

	@Test(priority = 3)
	public void navigateToStudentComplaint() throws InterruptedException
	{
		try {
		complaintsPage.complaintSections(2);
		complaintsPage.toolBarMessage();
		complaintsPage.nextPage();
		}
		catch (Exception e) {
			
          Thread.sleep(2000);
		}
	}
	
	
	
	

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
