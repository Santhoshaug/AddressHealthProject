package com.zysk.ah.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.zysk.addressHealth.base.BaseTest;
import com.zysk.addressHealth.util.TestUtil;
import com.zysk.ah.qa.pages.ComplaintsPage;
import com.zysk.ah.qa.pages.DetailsPage;
import com.zysk.ah.qa.pages.EditPage;
import com.zysk.ah.qa.pages.HomePage;
import com.zysk.ah.qa.pages.LoginPage;

import miscellaneous.Helper;

public class EditPageTest extends BaseTest{
	
	public EditPageTest()
	{
		super();
	}
	
	LoginPage loginPage;
	HomePage homePage;
	ComplaintsPage complaintsPage;
	DetailsPage detailsPage;
	EditPage editPage;
	
	String sheetName = "otherFields";
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		complaintsPage=homePage.clickOnComplaintsViewalLink();
		complaintsPage.complaintSections(2);
		detailsPage=complaintsPage.searchComplaintByStudentName();
		editPage=detailsPage.clickOnEditButton();
		
	}
	
	@DataProvider
	public Object[][] getOtherFieldsData()
	{
		Object[][] data = TestUtil.getTestData(sheetName);
		return data;
	}
	
	
	
	@Test(priority = 1, dataProvider = "getOtherFieldsData")
	public void editOtherFieldsTest(String convulsion, String neuro, String treatment, String advice, String notes ) throws InterruptedException
	{
		editPage.editOtherFields(convulsion, neuro, treatment, advice, notes);
		editPage.editNotes(convulsion, neuro, treatment, advice, notes);
		Thread.sleep(2000);
		editPage.clickOnUpdateAndMonitor();
		Thread.sleep(2000);
	}
	
	
	@Test(priority = 2)
	public void editClickableFields() throws InterruptedException
	{
		try {
		scrollBy();	
		editPage.kcoConvulsions();
		editPage.examinationFindings();
		scrollBy();	
		editPage.consciousness();
		scrollBy();
		editPage.neuroInspections();
		editPage.permissions();
		scrollBy();
		editPage.treatments();
		editPage.medicines();
		scrollBy();
		editPage.advice();
		scrollTillBottom();
		editPage.outcome();
		editPage.notes();
		//editPage.clickOnUpdateAndComplete();
		editPage.clickOnUpdateAndMonitor();
		}
		catch (Exception e) {
			Thread.sleep(5000);
		}
		
	}
	
	@Test(priority = 3)
	public void scrollSendKeysTest() throws InterruptedException
	{
		
		try {
			editPage.notes();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			Thread.sleep(10000);
		}
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}
