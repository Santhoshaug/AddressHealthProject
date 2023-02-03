package com.zysk.ah.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.zysk.addressHealth.base.BaseTest;

public class ComplaintsAllFieldsPage extends BaseTest {

	public ComplaintsAllFieldsPage() {
		PageFactory.initElements(driver, this);
	}

	/*********** Page element identifiers ******************/

	String studentSearchName = "SIDDHARTH NAIR";

	@FindBy(xpath = "//button[contains(@class,'relative inline-flex')]")
	WebElement newComplaint;
	@FindBy(xpath = "//input[@placeholder='Search Student name or AH Id *']")
	WebElement searchStudent;
	@FindBy(xpath = "//ul[contains(@class,'absolute w-full z-50 max-h-48')]/li/div")
	WebElement studentName;
	@FindBy(xpath = "//select[contains(@class,'block w-full flex-1')]")
	WebElement complaints;
	@FindBy(name = "child_occupanied_by")
	WebElement childAccompained;

	By day = By.name("duration.days");
	By hours = By.name("duration.hours");
	By minutes = By.name("duration.minutes");

	/********************************
	 * Other complaints
	 ******************************/
	@FindBy(xpath = "//div[.='Other complaints']/following-sibling::div/input")
	List<WebElement> otherCom;
	@FindBy(xpath = "//div[.='Other complaints']/following-sibling::div/div/label")
	List<WebElement> otherComp;
	@FindBy(xpath = "//label[.='Other complaint *']/parent::div/div/input")
	WebElement otherCompText;

	/****************************** ExaminationFindings *************************/
	@FindBy(xpath = "//label[.='Examination findings']")
	WebElement examinationLabel;
	@FindBy(xpath = "(//div[@class=' css-19bb58m'])[1]/input")
	WebElement examinationFindings;

	/****************************** Vitals *************************/
	By temperature = By.xpath("//div[@data-placeholder='°F']/input");

	By respiratoryFindings = By.xpath("//div[@class='my-1 mx-5']/div[2]/input");
	@FindBy(xpath = "//div[@class='my-1 mx-5']/div[@class='flex my-2']/input")
	List<WebElement> respInbox;
	@FindBy(xpath = "//div[@class='my-1 mx-5']/div[@class='flex my-2']/div/label")
	List<WebElement> respLabel;
	@FindBy(xpath = "//label[.='Other auscultation *']/parent::div/div/input")
	WebElement respText;

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

	/***************************** doctorReferral **********************/
	By doctorReferral = By.xpath("//label[.='Referred to AH Doctor *']/following-sibling::div/div/input");

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

	By notes = By.name("notes");

	@FindBy(xpath = "//button[@type='submit']")
	WebElement save;
	@FindBy(xpath = "(//button[@type='button'])[7]")
	WebElement backToHome;

	/***************************** ComplaintSection **********************/
	By complaintSection = By.xpath("//h3[.='Complaints']");
	@FindBy(xpath = "//p[@class='flex items-center text-sm text-gray-600']")
	List<WebElement> studentHome;

	/***************************** Breathlessness **********************/
	@FindBy(xpath = "//label[.='K/C/O wheeze and treatment']/following-sibling::input")
	WebElement wheeze;
	@FindBy(id = "other_ho_wheeze_and_treatment")
	WebElement wheeztText;

	@FindBy(xpath = "//label[.='K/C/O recent illness']/following-sibling::input")
	WebElement illeness;
	@FindBy(id = "other_ho_recent_illness")
	WebElement illenessText;

	/************************ Respiratory findings Inspections ********************/
	@FindBy(xpath = "//div[.='Inspections *']/following-sibling::div/input")
	List<WebElement> inspectionsInput;
	@FindBy(xpath = "//div[.='Inspections *']/following-sibling::div/div/label")
	List<WebElement> inspectinsLabel;
	@FindBy(xpath = "//label[.='Other inspection *']/parent::div/div/input")
	WebElement inspectionsText;

	/****************************** Auscultations *************************/
	@FindBy(xpath = "//div[.='Auscultations *']/following-sibling::div/input")
	List<WebElement> auscultationsInput;
	@FindBy(xpath = "//div[.='Auscultations *']/following-sibling::div/div/label")
	List<WebElement> auscultationsLabel;
	@FindBy(xpath = "//label[.='Other auscultation *']/parent::div/div/input")
	WebElement auscultationsText;

	/****************************** Convulsions *************************/
	@FindBy(xpath = "//label[.='K/C/O convulsion and treatment']/following-sibling::input")
	WebElement kcoConvulsions;
	@FindBy(xpath = "//label[.='K/C/O convulsion and treatment value *']/following-sibling::div/input")
	WebElement kcoConvulsionText;

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

	/************************ Descriptions ******************************/
	@FindBy(xpath = "//div[contains(.,'Descriptions')]/following-sibling::div/input")
	List<WebElement> descriptionsInput;
	@FindBy(xpath = "//div[contains(.,'Descriptions')]/following-sibling::div/div/label")
	List<WebElement> descriptionsLabel;
	@FindBy(xpath = "//label[.='Other description *']/following-sibling::div/input")
	WebElement descriptionsText;

	/************************* Locations **********************************/
	@FindBy(xpath = "//div[contains(.,'Locations')]/following-sibling::div/input")
	List<WebElement> locationsInput;
	@FindBy(xpath = "//div[contains(.,'Locations')]/following-sibling::div/div/label")
	List<WebElement> locationsLabel;
	@FindBy(xpath = "//label[.='Other location *']/following-sibling::div/input")
	WebElement locationText;

	/************************* How it occured **********************************/
	@FindBy(xpath = "//label[.='How it occurred']/following-sibling::div/div/input")
	List<WebElement> howItOccuredInbox;
	@FindBy(xpath = "//label[.='How it occurred']/following-sibling::div/div/label")
	List<WebElement> howItOccuredLabel;
	@FindBy(xpath = "//label[.='Other *']/following-sibling::div/input")
	WebElement howItOccuredText;

	/************************ Orientation **************************************/
	@FindBy(xpath = "//label[.='Orientation']/following-sibling::div/div/input")
	List<WebElement> orientationInput;
	@FindBy(xpath = "//label[.='Orientation']/following-sibling::div/div/label")
	List<WebElement> orientationLabel;

	/************************ Palpations **************************************/
	@FindBy(xpath = "//div[.='Palpations']/following-sibling::div/input")
	List<WebElement> palpationInput;
	@FindBy(xpath = "//div[.='Palpations']/following-sibling::div/div/label")
	List<WebElement> palpationLabel;
	@FindBy(xpath = "//label[.='Other palpation *']/following-sibling::div/input")
	WebElement palpationText;

	/************************ Diagnosis **************************************/
	@FindBy(xpath = "//div[.='Diagnosis *']/following-sibling::div/input")
	List<WebElement> diagnosisInput;
	@FindBy(xpath = "//div[.='Diagnosis *']/following-sibling::div/div/label")
	List<WebElement> diagnosisLabel;
	@FindBy(xpath = "//label[.='Other diagnosis *']/following-sibling::div/input")
	WebElement diagnosisText;

	/************************
	 * Covid** Rapid antigen test
	 ************************************/
	@FindBy(xpath = "//label[.='Rapid antigen test']/following-sibling::input")
	WebElement repidAntigenTest;
	@FindBy(xpath = "//label[.='Result *']/following-sibling::div/div/input")
	List<WebElement> resultsInbox;
	@FindBy(xpath = "//label[.='Result *']/following-sibling::div/div/label")
	List<WebElement> resultsLabel;
	@FindBy(xpath = "//label[.='Sample collected for RT PCR']/following-sibling::input")
	WebElement rtPcr;

	/****************************************************************/
	public void newComplaint() {
		waitSeconds(2);
		newComplaint.click();
	}

	public void searchStudent() throws InterruptedException {
		waitSeconds(2);
		searchStudent.click();
		searchStudent.sendKeys(studentSearchName);
		Thread.sleep(2000);
		waitSeconds(2);
		studentName.click();
	}

	public void complaintDropdown(int complaintNo) {
		Select sel = new Select(complaints);
		sel.selectByIndex(complaintNo);
	}

	public void childAccompained() {

		waitSeconds(2);
		Select sel = new Select(childAccompained);
		sel.selectByIndex(3);
	}

	public void duration() throws InterruptedException {
		scrollWebElementAppear(save);
		driver.findElement(day).sendKeys("3");
		driver.findElement(hours).sendKeys("2");
		driver.findElement(minutes).sendKeys("30");
	}

	public void otherComplaints() throws InterruptedException {

		scrollWebElementAppear(save);
		for (int i = 0; i < otherComp.size(); i++) {
			otherCom.get(i).click();
			if (otherComp.get(i).getText().equalsIgnoreCase("other")) {
				otherCompText.sendKeys("cold");
			}
		}
	}

	public void examinationFindings() {
		examinationLabel.click();
		scrollWebElementAppear(save);
		examinationFindings.click();
		examinationFindings.sendKeys("temperature" + Keys.ENTER);
		waitSeconds(2);
		driver.findElement(temperature).sendKeys("98");
	}

	public void respiratoryFindings() throws InterruptedException {
		scrollWebElementAppear(save);
		waitSeconds(2);
		for (int i = 0; i < respLabel.size(); i++) {
			respInbox.get(i).click();
			if (respLabel.get(i).getText().equalsIgnoreCase("other")) {
				respText.sendKeys("ronchi");
			}
		}
	}

	/****************************** Permissions ****************************/
	public void permissions() {
		permissions.get(0).click();

	}

	/****************************** Treatments ****************************/
	public void treatments() {
		scrollWebElementAppear(save);
		for (int i = 0; i < treatmentLabel.size(); i++) {
			treatmentInput.get(i).click();
			if (treatmentLabel.get(i).getText().equalsIgnoreCase("other")) {
				waitSeconds(2);
				treatmentText.sendKeys("test");
			}
		}
	}

	/****************************** Medicines ****************************/
	public void medicines() {
		driver.findElement(medecines).sendKeys("Amrutanjan" + Keys.ENTER);
		waitSeconds(2);
		driver.findElement(med).sendKeys("4");

	}

	/****************************** DoctorReferral ****************************/
	public void doctorReferral() throws InterruptedException {
		scrollWebElementAppear(save);
		driver.findElements(doctorReferral).get(0).click();
	}

	/****************************** Advice ****************************/
	public void advice() {
		for (int i = 0; i < adviceLabel.size(); i++) {
			adviceInput.get(i).click();
			if (adviceLabel.get(i).getText().equalsIgnoreCase("other")) {
				waitSeconds(2);
				adviceText.sendKeys("test");
				break;
			}
		}
	}

	/*********************************** outcome **********************/
	public void outcome() throws InterruptedException {
		scrollWebElementAppear(save);
		for (int i = 0; i < 4; i++) {
			outcomeInbox.get(i).click();
		}
	}

	public void notes() {
		driver.findElement(notes).sendKeys("test");
	}

	public void save() throws InterruptedException {
		scrollWebElementAppear(save);
		save.click();
	}

	public void backToHome() throws InterruptedException {
		waitSeconds(2);
		backToHome.click();
	}

	public void complaintSection() throws InterruptedException {
		waitSeconds(2);
		scrollBy();
		for (int i = 0; i < studentHome.size(); i++) {
			if (studentHome.get(i).getText().contains(studentSearchName)) {
				studentHome.get(i).click();
				break;
			}
		}
		Thread.sleep(5000);

	}

	public void wheeze() {
		wheeze.click();
		wheeztText.sendKeys("test");
	}

	public void illeness() {
		illeness.click();
		illenessText.sendKeys("test");
	}

	public void inspections() {
		scrollWebElementAppear(save);
		for (int i = 0; i < inspectinsLabel.size(); i++) {
			inspectionsInput.get(i).click();
			if (inspectinsLabel.get(i).getText().equalsIgnoreCase("other")) {
				inspectionsText.sendKeys("test");

			}
		}
	}

	public void auscultations() {
		scrollWebElementAppear(save);
		for (int i = 0; i < auscultationsLabel.size(); i++) {
			auscultationsInput.get(i).click();
			if (auscultationsLabel.get(i).getText().equalsIgnoreCase("other")) {
				auscultationsText.sendKeys("test");
			}
		}
	}

	/*********************************** convulsions **********************/
	public void kcoConvulsions() {
		scrollWebElementAppear(save);
		kcoConvulsions.click();
		kcoConvulsionText.sendKeys("test");
	}

	/******************************** Consciousness ***********************/
	public void consciousness() {
		consciousness.get(0).click();
	}

	/****************************** Orientation ****************************/
	public void orientation() {
		scrollWebElementAppear(save);
		for (int i = 0; i < orientationLabel.size(); i++) {
			if (orientationLabel.get(i).getText().equalsIgnoreCase("yes")) {
				orientationInput.get(i).click();
			}
		}
	}

	/******************************
	 * Neurological Inspections
	 ****************************/
	public void neuroInspections() {
		scrollWebElementAppear(save);
		for (int i = 0; i < neuroInspectionsLabel.size(); i++) {
			neuroInspectionsInput.get(i).click();
			if (neuroInspectionsLabel.get(i).getText().equalsIgnoreCase("other")) {

				neuroInspectionsText.sendKeys("test");
			}

		}
	}

	/********************************* Descriptions ***********************/
	public void descriptions() {
		scrollWebElementAppear(save);
		for (int i = 0; i < descriptionsLabel.size(); i++) {
			descriptionsInput.get(i).click();
			if (descriptionsLabel.get(i).getText().equalsIgnoreCase("other")) {
				descriptionsText.sendKeys("test");
				break;

			}
		}

	}

	/************************************* Locations *********************/
	public void locations() {
		scrollWebElementAppear(save);
		for (int i = 0; i < locationsLabel.size(); i++) {
			if (locationsLabel.get(i).getText().equals("Other")) {
				locationsInput.get(i).click();
				locationText.sendKeys("test");
				break;
			}
		}
	}

	/***************************** How it occured *********************/
	public void howItOccured() {
		scrollWebElementAppear(save);
		for (int i = 0; i < howItOccuredLabel.size(); i++) {
			if (howItOccuredLabel.get(i).getText().equalsIgnoreCase("other")) {
				howItOccuredInbox.get(i).click();
				howItOccuredText.sendKeys("test");
			}
		}
	}

	/************************ Palpations **************************************/
	public void palpations() {
		scrollWebElementAppear(save);
		for (int i = 0; i < palpationLabel.size(); i++) {
			palpationInput.get(i).click();
			if (palpationLabel.get(i).getText().equalsIgnoreCase("other")) {
				palpationText.sendKeys("test");
			}
		}
	}

	/************************ diagnosis **************************************/
	public void diagnosis() {
		scrollWebElementAppear(save);
		for (int i = 0; i < diagnosisLabel.size(); i++) {
			diagnosisLabel.get(i).click();
			if (diagnosisLabel.get(i).getText().equalsIgnoreCase("other")) {
				diagnosisText.sendKeys("test");
			}
		}
	}

	/************************
	 * Covid** Rapid antigen test
	 ************************************/
	public void rapidAntegenTest() {
		scrollWebElementAppear(save);
		repidAntigenTest.click();
		waitSeconds(2);
		for (int i = 0; i < resultsLabel.size(); i++) {
			if (resultsLabel.get(i).getText().equals("Positive")) {
				resultsInbox.get(i).click();
			}
		}
		rtPcr.click();
	}
}