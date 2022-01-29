package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public ChromeDriver driver;
	
	@Given("Launch the Browser")
	public void launch_the_browser() {
		  WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
	}

	@Given("Load the URL")
	public void load_the_url() {
		driver.get("http://leaftaps.com/opentaps");
}

	@Given("Enter UserName as {string}")
	public void enter_user_name(String userName) {
		driver.findElement(By.id("username")).sendKeys(userName);
		
	}

	@Given("Enter Password as {string}")
	public void enter_password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@Given("Click on Login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
}
/*
	@Given("Click on CRM\\/SFA Link")
	public void click_on_crm_sfa_link() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}

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


}
*/
