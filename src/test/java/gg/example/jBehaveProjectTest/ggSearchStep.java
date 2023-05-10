package gg.example.jBehaveProjectTest;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ggSearchStep {
	
public WebDriver driver;
	
	@Given("I am on the google home page")
	public void goToGoogleHomePage() {
		String pathDriver = "your_path_driver";
		System.setProperty("webdriver.chrome.driver", pathDriver);
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
	}
	
	@When("I input the keyword JBehave")
	public void inputKeyword() {
		driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("JBehave" + Keys.RETURN);
	}
	
	@Then("I should see \"What is JBehave?\"")
	public void expectedOfResults() {
		String bodyText = driver.findElement(By.tagName("body")).getText();
		Assert.assertTrue("Text not found!", bodyText.contains("What is JBehave?"));
		driver.close();
	}

}
