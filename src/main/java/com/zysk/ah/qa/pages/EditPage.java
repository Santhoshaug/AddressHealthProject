package com.zysk.ah.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zysk.addressHealth.base.BaseTest;

public class EditPage extends BaseTest {

	public EditPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[contains(.,'K/C/O')]/following-sibling::div/input")
	WebElement kcoConvulsion;

	@FindBy(xpath = "//label[.='Other inspection *']/following-sibling::div/input")
	WebElement neuroInspectionText;

	@FindBy(xpath = "//label[.='Other treatment *']/following-sibling::div/input")
	WebElement otherComplaintText;

	@FindBy(xpath = "//label[.='Other advice *']/following-sibling::div/input")
	WebElement otherAdvice;

	@FindBy(xpath = "//label[.='Notes']/following-sibling::textarea")
	WebElement notesText;

	@FindBy(xpath = "//label[.='Notes']")
	WebElement notesLabel;

	@FindBy(xpath = "//button[@type='submit' and @name='pending']")
	WebElement updateAndMonitor;

	@FindBy(xpath = "//button[@type='submit' and @name='completed']")
	WebElement updateAndComplete;

	/****************************** K/C/O Convulsions *************************/
	@FindBy(xpath = "//label[.='K/C/O convulsion and treatment']/following-sibling::input")
	WebElement kcoConvulsions;
	@FindBy(xpath = "//label[.='K/C/O convulsion and treatment value *']/following-sibling::div/input")
	WebElement kcoConvulsionText;

	/****************************** ExaminationFindings *************************/
	@FindBy(xpath = "//label[.='Examination findings']")
	WebElement examinationLabel;
	@FindBy(xpath = "(//div[@class=' css-19bb58m'])[1]/input")
	WebElement examinationFindings;

	/****************************** Vitals *************************/
	By temperature = By.xpath("//div[@data-placeholder='°F']/input");

	/************************ Consciousness **********************/
	@FindBy(xpath = "//label[.='Consciousness']/following-sibling::div/div/input")
	List<WebElement> consciousness;

	/************************ Neurological finding **********************/
	@FindBy(xpath = "//div[.='Inspections *']/following-sibling::div/input")
	List<WebElement> neuroInspectionsInput;
	@FindBy(xpath = "//div[.='Inspections *']/following-sibling::div/div/label")
	List<WebElement> neuroInspectionsLabel;
	@FindBy(xpath = "//label[.='Other inspection *']/parent::div/div/input")
	WebElement neuroInspectionsText;

	/***************************** Permissions **********************/
	@FindBy(xpath = "//label[.='Permissions']/following-sibling::div/div/input")
	List<WebElement> permissions;

	/***************************** Treatments **********************/
	@FindBy(xpath = "//div[.='Treatments']/following-sibling::div/input")
	List<WebElement> treatmentInput;
	@FindBy(xpath = "//div[.='Treatments']/following-sibling::div/div/label")
	List<WebElement> treatmentLabel;
	@FindBy(xpath = "//label[.='Other treatment *']/following-sibling::div/input")
	WebElement treatmentText;

	/***************************** Medecines **********************/
	By medecines = By.xpath("(//div[@class=' css-19bb58m'])[2]/input");

	By med = By.name("medicinesValues[0]");

	/***************************** Advice **********************/
	@FindBy(xpath = "//div[contains(.,'Advices')]/following-sibling::div/input")
	List<WebElement> adviceInput;
	@FindBy(xpath = "//div[contains(.,'Advices')]/following-sibling::div/div/label")
	List<WebElement> adviceLabel;
	@FindBy(xpath = "//label[.='Other advice *']/following-sibling::div/input")
	WebElement adviceText;

	/***************************** Outcome **********************/
	@FindBy(xpath = "//div[.='Outcome *']/following-sibling::div/input")
	List<WebElement> outcomeInbox;
	@FindBy(xpath = "//div[.='Outcome *']/following-sibling::div/div/label")
	List<WebElement> outcomeLabel;

	/*********************************** Notes **********************/
	By notes = By.name("notes");

	public void editOtherFields(String convulsion, String Neuro, String treatment, String advice, String notes) {
		kcoConvulsion.sendKeys(convulsion);
		neuroInspectionText.sendKeys(Neuro);
		otherComplaintText.sendKeys(treatment);
		otherAdvice.sendKeys(advice);

	}

	public void editNotes(String convulsion, String Neuro, String treatment, String advice, String notes) {
		notesText.sendKeys(notes);
		notesLabel.click();
	}

	/****************************** K/C/O Convulsions *************************/
	public void kcoConvulsions() {
		waitSeconds(2);
		if (kcoConvulsions.isEnabled()) {
			kcoConvulsions.click();
		}
	}

	/****************************** ExaminationFindings *************************/
	public void examinationFindings() {
		highLightElement(driver, examinationLabel);
		examinationLabel.click();
		examinationFindings.click();
		highLightElement(driver, examinationFindings);
		examinationFindings.sendKeys("temperature" + Keys.ENTER);
		driver.findElement(temperature).sendKeys("98");
	}

	/*****************************************
	 * Consciousness ***************
	 **********************/
	public void consciousness() {
		for (int i = 0; i < consciousness.size(); i++) {
			if (i % 2 == 1) {
				consciousness.get(i).click();
			}
		}

	}

	/******************************
	 * Neurological Inspections
	 ****************************/
	public void neuroInspections() {
		for (int i = 0; i < neuroInspectionsLabel.size(); i++) {
			if (i % 2 == 0) {
				highLightElement(driver, neuroInspectionsLabel.get(i));
				neuroInspectionsInput.get(i).click();
			}
		}
	}

	/****************************** Permissions ****************************/
	public void permissions() {
		for (int i = 0; i < permissions.size(); i++) {
			if (i % 2 == 1) {
				highLightElement(driver, permissions.get(i));
				permissions.get(1).click();
				break;
			}
		}
	}

	/******************************
	 * Treatments
	 * @throws InterruptedException
	 ****************************/
	public void treatments() throws InterruptedException {
		waitSeconds(2);
		for (int i = 0; i < treatmentLabel.size(); i++) {
			if (i % 2 == 1) {
				treatmentInput.get(i).isDisplayed();
				highLightElement(driver, treatmentLabel.get(i));
				treatmentInput.get(i).click();
			}
		}
	}

	/******************************
	 * Medicines
	 * @throws InterruptedException
	 ****************************/
	public void medicines() {
		waitSeconds(2);
		driver.findElement(medecines).sendKeys("Amrutanjan" + Keys.ENTER);
		driver.findElement(med).sendKeys("4");
	}

	/****************************** Advice ****************************/
	public void advice() {
		for (int i = 0; i < adviceLabel.size(); i++) {
			if (i % 2 == 1) {
				highLightElement(driver, adviceLabel.get(i));
				adviceInput.get(i).click();
			}
		}
	}

	/*********************************** outcome **********************/
	public void outcome() throws InterruptedException {
		for (int i = 0; i < 4; i++) {
			if (i % 2 == 1) {
				highLightElement(driver, outcomeInbox.get(i));
				outcomeInbox.get(i).click();
			}
		}
	}

	/*********************************** Notes 
	 * @throws InterruptedException **********************/
	public void notes() throws InterruptedException {
		scrollTillBottom();
		//WebElement ele = driver.findElement(notes);
		sendKeys(driver, driver.findElement(notes), 10, "test");
		
		//sendKeys(driver, ele, 10, "test");
	}

	/*********************************** Update **********************/
	public void clickOnUpdateAndMonitor() {
		if (updateAndMonitor.isEnabled()) {

			updateAndMonitor.click();
		}
	}

	public void clickOnUpdateAndComplete() {
		updateAndComplete.click();
	}

}
