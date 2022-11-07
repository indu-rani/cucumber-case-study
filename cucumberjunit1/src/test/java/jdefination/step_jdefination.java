package jdefination;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class step_jdefination {
	String url=" https://demo.guru99.com/test/newtours/index.php";
	WebDriver driver;
	
	

	@Given("i should go to login page")
	public void i_should_go_to_login_page() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		   Thread.sleep(5000);
		   driver=new ChromeDriver();
		   driver.get(url);
	}
	@And("Enter username {string}")
	public void enter_username(String string)throws InterruptedException  {
		Thread.sleep(5000);
		driver.findElement(By.name("userName")).sendKeys(string);
	}
	@And("Enter password {string}")
	public void enter_password(String string) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys(string);
	}
	@Then("click on submit button")
	public void click_on_submit_button() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.name("submit")).click();
	}




}




