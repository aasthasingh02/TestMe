package skeleton;

import java.util.NoSuchElementException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class casestudy3{
private WebDriver driver;
	@Given("user is on TestMeApp")
	public void user_is_on_TestMeApp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pdc2b-training.pdc2b\\Desktop\\driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	}

	@When("user search for a product")
	public void user_search_for_a_product() {
		WebElement search = driver.findElement(By.xpath("//*[@id='myInput']"));
		 Actions act = new Actions(driver);
		 
		 search.sendKeys("w");
		 search.sendKeys("e");
		 search.sendKeys("a");
		 search.sendKeys("r");
		 
		 //Thread.sleep(2000);
		 act
		 .sendKeys(Keys.ARROW_DOWN)
		 .sendKeys(Keys.ARROW_DOWN)
		 .sendKeys(Keys.ARROW_DOWN)
		 .sendKeys(Keys.ENTER)
		 //.click(driver.findElement(By.xpath("//*[@id='myInputautocomplete-list']/div[3]")))
		 .build()
		 .perform();
	}

	@When("user clicks on add to cart")
	public void user_clicks_on_add_to_cart() {
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div/div[2]/center/a")).click();
	}

	@Then("user is directed to signin page")
	public void user_is_directed_to_signin_page() {
		
		String t = driver.getTitle();
		Assert.assertEquals("Login", t);
	}

	


	
	
	
	
	@When("user sign in the app")
	public void user_sign_in_the_app() {
		driver.findElement(By.partialLinkText("SignIn")).click();
		driver.findElement(By.id("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();
	}

	@When("user searchs product by one alphabet at a time")
	public void user_searchs_product_by_one_alphabet_at_a_time() {
		WebElement search = driver.findElement(By.xpath("//*[@id='myInput']"));
		 Actions act = new Actions(driver);
		 
		 search.sendKeys("h");
		 search.sendKeys("e");
		 search.sendKeys("a");
		 search.sendKeys("d");
		 
		
	}

	@Then("user should get suggestions from app")
	public void user_should_get_suggestions_from_app() {
		String s = driver.findElement(By.xpath("//*[@id=\"myInputautocomplete-list\"]/div")).getText();
		Assert.assertEquals("Headphone", s);
	}

	
	
	
	
	
	
	
	@When("user searchs for a product and didn't add product in the cart")
	public void user_searchs_for_a_product_and_didn_t_add_product_in_the_cart() {
		WebElement search = driver.findElement(By.xpath("//*[@id='myInput']"));
		 Actions act = new Actions(driver);
		 
		 search.sendKeys("w");
		 search.sendKeys("e");
		 search.sendKeys("a");
		 search.sendKeys("r");
		 
		 //Thread.sleep(2000);
		 act
		 .sendKeys(Keys.ARROW_DOWN)
		 .sendKeys(Keys.ARROW_DOWN)
		 .sendKeys(Keys.ARROW_DOWN)
		 .sendKeys(Keys.ENTER)
		 .build()
		 .perform();
	}

	@Then("Cart icon is not available")
	public void cart_icon_is_not_available() {

	    try {
			driver.findElement(By.partialLinkText("Cart")).click();
			
		}
		catch(NoSuchElementException|StaleElementReferenceException e)
		{
			System.out.println("Cart icon is not available");
		}
	
	}

}

