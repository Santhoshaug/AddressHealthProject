package com.zysk.ah.qa.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zysk.addressHealth.base.BaseTest;
import com.zysk.ah.qa.pages.ComplaintsPage;
import com.zysk.ah.qa.pages.DetailsPage;
import com.zysk.ah.qa.pages.HomePage;
import com.zysk.ah.qa.pages.LoginPage;

import miscellaneous.Helper;

public class DetailsPageTest extends BaseTest{
	
	public DetailsPageTest()
	{
		super();
	}
	LoginPage loginPage;
	HomePage homePage;
	ComplaintsPage complaintsPage;
	DetailsPage detailsPage;
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		complaintsPage=homePage.clickOnComplaintsViewalLink();
		complaintsPage.complaintSections(2);
		detailsPage=complaintsPage.searchComplaintByStudentName();
		
		
	}
	
	@Test(priority = 1)
	public void scrollDetailsTest() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		/*
		 * //js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); 
		 * String loc1 = "//div[.='Back to home']"; 
		 * String loc2 ="//dt[.='Further treatments']"; String loc3="//dt[.='Medicines']";
		 *  WebElement flag = driver.findElement(By.xpath(loc2));
		 * js.executeScript("arguments[0].scrollIntoView();",flag);
		 * Thread.sleep(2000); 
		 * WebElement flag1 = driver.findElement(By.xpath(loc1));
		 * //js.executeScript("arguments[0].scrollIntoView();",flag1); 
		 * WebElement flag3 = driver.findElement(By.xpath(loc3));
		 * js.executeScript("arguments[0].scrollIntoView();",flag3);
		 */
		
		String loc4="//dt[.='Advice']";
		WebElement flag4 = driver.findElement(By.xpath(loc4));
		js.executeScript("arguments[0].scrollIntoView();",flag4);
		Helper.highLightElement(driver, flag4);
		
		
		Thread.sleep(5000);
		String loc2 ="//dt[.='Further treatments']";
		WebElement flag2 = driver.findElement(By.xpath(loc2));
		js.executeScript("arguments[0].scrollIntoView();",flag2);
		Helper.highLightElement(driver, flag2);
		
		/*
		 * js.executeScript("arguments[0].scrollIntoView(true)",flag3);
		 */
		
		//js.executeScript("window.scrollTo(0,500)","");
		
		/*
		js.executeScript("window.scrollBy(0,500)","");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)","");
		*/
		//detailsPage.scrolltimes(2);
		
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
