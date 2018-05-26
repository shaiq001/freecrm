package stepDefinition;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class TestCase {
	
	public static WebDriver driver;
	@Given("^I have firefox browser running$")
	public void i_have_firefox_browser_running()  {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ahmad Shaiq\\Documents\\geckodriver.exe");
		driver= new FirefoxDriver();
	    
	}


@When("^I go to the websit$")
public void i_go_to_the_websit()  {
	
	driver.get("https://www.freecrm.com");
    
}

	@When("^I enter valid username$")
	public void i_enter_valid_username() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("syntax");
	   
	}

	@When("^I enter valid password$")
	public void i_enter_valid_password()  {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("syntax001");
	   
	}

	@When("^I click on the login button$")
	public void i_click_on_the_login_button() throws InterruptedException  {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	}

	
	@Then("^I should see alogout link$")
	public void i_should_see_alogout_link() {
		
		String logout= driver.findElement(By.xpath("//input[@type='image']")).getText();
		
		Assert.assertEquals(logout, "SEARCH");
	   
	}

	@Given("^i should have a chrome browser running$")
	public void i_should_have_a_chrome_browser_running()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ahmad Shaiq\\Documents\\chromedriver.exe");
		driver= new ChromeDriver();
		
	    
	}

	@When("^i go to website$")
	public void i_go_to_website() throws InterruptedException  {
		driver.get("https://www.albany.edu");
		driver.findElement(By.xpath("//*[@id='block-topnav']/ul/li[1]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".grid-link")).click();
	    Thread.sleep(1000);
	}
	
	@When("^i enter valid \"([^\"]*)\" and valid\"([^\"]*)\"$")
	public void i_enter_valid_and_valid(String username, String pass)  {
		driver.findElement(By.xpath("//input[@name='j_username']")).sendKeys(username);  
		driver.findElement(By.xpath("//input[@name='j_password']")).sendKeys(pass);
	}
	/*@When("^i enter valid username and password$")
	public void i_enter_valid_username_and_password(DataTable data)  {
	    List<List<String>> Datanew=data.raw();
	    driver.findElement(By.xpath("//input[@name='j_username']")).sendKeys(Datanew.get(0).get(0));
	    driver.findElement(By.xpath("//input[@name='j_password']")).sendKeys(Datanew.get(0).get(1));
	}**/

	@When("^i click on sign in button$")
	public void i_click_on_sign_in_button()  {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	}

	@Then("^i should see title$")
	public void i_should_see_title()  {
		Assert.assertTrue(driver.findElement(By.cssSelector(".company-title>a>img")).isDisplayed());
	}

	@Then("^i can click on UAlbany Mail$")
	public void i_can_click_on_UAlbany_Mail()  {
		driver.findElement(By.xpath("//a[contains(.,'UAlbany Mail')]")).click();
	}
	   
	
	@Then("^i Should see new window opened$")
	public void i_Should_see_new_window_opened()   {
		Set<String> ids=driver.getWindowHandles();
		
		//1. iterator methods use to extract id of windows child or parent. 
		Iterator<String> it=ids.iterator();
		
		//now we need to get Parent Id for initial window 
		String parentId =it.next();
		String childid=it.next();
		
		driver.switchTo().window(childid);
		
		
	    
	}

	@Then("^i should be able to click on No button$")
	public void i_should_be_able_to_click_on_No_button() throws InterruptedException  {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='idBtn_Back']")).click();
	   
	}

}
