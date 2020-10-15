/*package com.qa.actitime.StepDenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefnition {
	WebDriver driver;
	@Given("^User is already available on login page$")
	public void user_is_already_On_loginPage() {
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\javaworkspace\\SeleniumProjects\\COMMON_JARS_FILES\\RealBrowserDriver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://localhost/login.do");
	}
	
	@When("^Title of the login page is ActiTimeLogin$")
	public void title_of_the_LoginPage() {
	String title=driver.getTitle();
	System.out.println("title -->"+title);
	//Assert.assertEquals(title, "<actiTIME - []Login");//"<actiTIME - []Login"
	
	}
	// 1>\"(.*)\==Regular expression
	@Then("^User enters \\\"(.*)\\\" and  \\\"(.*)\\\"$")
	public void user_enters_username_and_password(String username,String password) {
	    driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);;//("//*[@id=\"username\"]")
	    driver.findElement(By.xpath("//input[@name='pwd' ]")).sendKeys(password);;
	}
	@Then("^User enters admin and  manager(\\d+)$")
	public void user_enters_username_and_password(String username,String password) {
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(username);;//("//*[@id=\"username\"]")
	    driver.findElement(By.xpath("//input[@name='pwd' ]")).sendKeys(password);;
	}
	@Then("^User click on LoginBtn$")
	public void user_click_on_LoginBtn(){
	    driver.findElement(By.xpath("//*[@id=\"loginButton\"]")).click();
	}
	
	@Then("^User is in TimeTrackPage$")
	public void user_is_in_TimeTrackPage() throws InterruptedException {
		String title=driver.getTitle();
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"sortByTaskNameLink\" and text()='Task']"));
		System.out.println("TimeTrack PAge Title-->"+title.toString());
		Thread.sleep(2000);
		Assert.assertTrue(ele.isDisplayed());
		//Assert.assertEquals(title, "actiTIME -  Enter Time-Track");
	}
	@Then("^User close the Browser$")
	public void user_close_the_Browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver.quit();
	}
	
}
*/