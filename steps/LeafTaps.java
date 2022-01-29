package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LeafTaps extends BaseClass{

	
	@Given("Click on Leads")
	public void click_on_leads() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@Given("Click on Create Lead")
	public void click_on_create_lead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@Given("Create Company Name")
	public void create_company_name() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Invicara");
	}

	@Given("Create FirstName")
	public void create_first_name() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Amudhini");
	}

	@Given("Create LastName")
	public void create_last_name() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Rajavel");
	}

	@When("Click on submit button")
	public void click_on_submit_button() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("Should be created")
	public void should_be_created() {
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("Created successfully");
	}

	
	@Given("Click on Find Leads")
	public void findLeads() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@Given("Enter Edit fields")
	public void editFields() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
	}
	@When("Click ok button")
	public void okBtn() {
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("Should be edited")
	public void should_be_edited() {
		System.out.println("Edited successfully");
}
	@Given ("Click Contacts")
	public void clickContact() {
		driver.findElement(By.linkText("Contacts")).click();
	}
	@Given ("Click Create Contacts")
	public void clickCC() {
		driver.findElement(By.linkText("Create Contact")).click();
	}
	
	@Given ("Create FN {string}")
	public void firstName(String FN) {
		driver.findElement(By.id("firstNameField")).sendKeys(FN);

	}
	@Given ("Create LN {string}")
	public void lastName(String LN) {
		driver.findElement(By.id("lastNameField")).sendKeys(LN);
	}
	
	@When ("Click on Create Contact")
	public void click() {
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

	}
	@Then ("Contact created successfully")
	public void createCon() {
		System.out.println("Contact created successfully");
		}
	
	@Given ("Type Phone Number {string}")
	public void phoneNumber(String PN) {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(PN);
		
	}
	@Given ("Click on Find Leads Button")
	public void findLeadBtn() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	}
	@Given ("Click on Duplicate Lead Button")
	public void dupLeadBtn() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
	}
	@When ("Click on submit Button")
	public void subBtn() {
		driver.findElement(By.name("submitButton")).click();

	}
	
	@Then("Duplicate lead created")
	public void dupLeadCreated() {
		System.out.println("Duplicate Lead created successfully");
	}
	
	
}
