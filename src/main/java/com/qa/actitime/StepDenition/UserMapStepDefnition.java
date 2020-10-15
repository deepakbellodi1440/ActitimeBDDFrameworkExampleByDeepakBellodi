/*package com.qa.actitime.StepDenition;


import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class UserMapStepDefnition {
	WebDriver driver;
	List<WebElement> oEles = null;
	@Given("^User is already present in loginPage$")
	public void user_is_already_present_in_loginPage() {
		System.setProperty("webdriver.chrome.driver", "E:\\Work\\javaworkspace\\SeleniumProjects\\COMMON_JARS_FILES\\RealBrowserDriver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
	}
	
	@When("^Title of the login page is ActitimeLogin$")
	public void title_of_the_login_page_is_ActitimeLogin() {
	String title=driver.getTitle();
	System.out.println("title -->"+title);
	}
	@Then("^User enter username and password$")
	public void user_enters_username_and_password(DataTable credential) {
		for(Map<String, String> data :	 credential.asMaps(String.class, String.class)) {
	    driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(data.get("username"));//("//*[@id=\"username\"]")
	    driver.findElement(By.xpath("//input[@name='pwd' ]")).sendKeys(data.get("password"));
		}  
	}
	@Then("^User click on LoginBtn$")
	public void user_click_on_LoginBtn(){
	    driver.findElement(By.xpath("//*[@id=\"loginButton\"]")).click();
	}
	
	@Then("^User is on TimeTrackPage$")
	public void user_is_in_TimeTrackPage() throws InterruptedException 
	{
		Thread.sleep(2000);
		String title=driver.getTitle();
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"sortByTaskNameLink\" and text()='Task']"));
		System.out.println("TimeTrack PAge Title-->"+title.toString());
		Assert.assertTrue(ele.isDisplayed());
		//Assert.assertEquals(title, "actiTIME -  Enter Time-Track");
	}
	
	@Then("^User click on the UserLink$")
	public void User_click_on_the_UserLink() throws InterruptedException {
		Thread .sleep(2000);
				oEles = driver.findElements(By.xpath("//div[@id='gettingStartedShortcutsMenuWrapper']"));
				if(oEles.size()>0)
				{
					System.out.println("found  the shourtcutc menu");
					driver.findElement(By.xpath("//div[@id='gettingStartedShortcutsMenuCloseId']")).click();
				}else {
					System.out.println("Error while detecting the shourtcutc menu");
				}
	  //  Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
	}
	@Then("^User click on addUserBtn$")
	public void user_click_on_addUserBtn() throws Throwable 
	{
	    driver.findElement(By.xpath("//div[@class='buttonText' and text()='Add User']")).click();
	}
	
	@Then("^User enters the firstname and lastname and email$")
	public void User_enters_the_firstname_and_lastname_and_email(DataTable values) throws InterruptedException{
		for(Map<String, String> data :	 values.asMaps(String.class, String.class)) {
			driver.findElement(By.xpath("//*[@id=\"userDataLightBox_firstNameField\"]")).sendKeys(data.get("firstName"));
			driver.findElement(By.xpath("//*[@id=\"userDataLightBox_lastNameField\"]")).sendKeys(data.get("LastName"));
			driver.findElement(By.xpath("//*[@id=\"userDataLightBox_emailField\"]")).sendKeys(data.get("Email"));
		    
			driver.findElement(By.xpath("//*[@id=\"userDataLightBox_cancelBtn\"]")).click();
			Alert alert =driver.switchTo().alert();
			alert.accept();
			Thread.sleep(500);
			driver.findElement(By.xpath("//div[@class='buttonText' and text()='Add User']")).click();
			Thread.sleep(500);
		}
	}
	
	
	@Then("^User close the browser$")
	public void user_close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
		driver.quit();
	}

}

*/