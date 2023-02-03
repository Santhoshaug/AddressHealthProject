package com.zysk.ah.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zysk.addressHealth.base.BaseTest;
import com.zysk.addressHealth.util.TestUtil;
import com.zysk.ah.qa.pages.ComplaintsPage;
import com.zysk.ah.qa.pages.DetailsPage;
import com.zysk.ah.qa.pages.HomePage;
import com.zysk.ah.qa.pages.LoginPage;
import com.zysk.ah.qa.pages.SuppliesPage;

public class SuppliesPageTest extends BaseTest {
	public SuppliesPageTest() {
		super();
	}
	
	LoginPage loginPage;
	HomePage homePage;
	DetailsPage detailsPage;
	SuppliesPage suppliesPage;


	String suppliesPageUrl = "https://address-health-revamp-git-dev-v2-zysktech.vercel.app/supplies";

	@BeforeMethod
	public void setUp() throws InterruptedException {

		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		suppliesPage=new SuppliesPage();

	}

	@Test(priority = 1)
	public void suppliesNavigation() throws InterruptedException{
		homePage.selectInfirmary();
		Thread.sleep(2000);
		driver.navigate().to(suppliesPageUrl);
		Thread.sleep(2000);
		suppliesPage.suppliesPagination();
		
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}