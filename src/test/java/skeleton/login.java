package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class login {
	
	private WebDriver driver;
	
	@Given("Larry is on  login page")	
	public void larry_is_on_login_page() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\pdc2b-training.pdc2b\\Desktop\\DRIVERS\\chromedriver_win32 (3)\\chromedriver.exe");
    driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.findElement(By.partialLinkText("SignIn")).click();
	}
	
	  
	
	@When("user enters correct username as {string}")
	public void user_enters_correct_username_as(String username) {
	  driver.findElement(By.name("userName")).sendKeys(username);
	}
	
	@When("user enters correct password as {string}")
	public void user_enters_correct_password_as(String password) {
	   driver.findElement(By.name("password")).sendKeys(password);
	}


	@Then("user can do successful login")
	public void user_can_do_successful_login() {
	    
	}
	
	
}
