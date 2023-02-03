package com.zysk.ah.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zysk.addressHealth.base.BaseTest;
import com.zysk.ah.qa.pages.ComplaintsPage;
import com.zysk.ah.qa.pages.HomePage;
import com.zysk.ah.qa.pages.LoginPage;
import com.zysk.ah.qa.pages.SuppliesPage;

public class HomePageTest extends BaseTest {
	LoginPage loginPage;
	HomePage homePage;
	ComplaintsPage complaintsPage;
    SuppliesPage suppliesPage;
	public HomePageTest() {
		super();
	}

	//test cases should be separated -- independent with each other
	//before each test case -- launch the browser and login
	
	@BeforeMethod
	public void setUp() {
		initialization();
		complaintsPage = new ComplaintsPage();
		suppliesPage=new SuppliesPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String homePageTitle = homePage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle, "Address Health | Healthy children Happy children");
	}
	
	@Test(priority=2)
	public void verifyUserNameTest(){
		Assert.assertTrue(homePage.verifyCorrectUserName());
	}
	@Test(priority = 3)
	public void selectInfirmary() throws InterruptedException
	{
		homePage.selectInfirmary();
	}
	
	@Test(priority=4)
	public void verifyComplaintViewallLinkTest() throws InterruptedException{
		complaintsPage = homePage.clickOnComplaintsViewalLink();
	}
	
	//@Test(priority=5)
	public void verifySuppliesViewallLinkText()
	{
	suppliesPage=homePage.clickOnSupplyViewallLink();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	

}
