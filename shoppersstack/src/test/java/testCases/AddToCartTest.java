package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom_scripts.HomePage;
import pom_scripts.RegisterPage;

public class AddToCartTest {

	@Test(groups = "FT")
	public void addToCart() {
System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://demowebshop.tricentis.com/");
		
		HomePage home=new HomePage(driver);
		RegisterPage register=new RegisterPage(driver);
		
		
		home.clickRegisterLink();
		
		register.clickMaleRadioButton();
		
		register.enterFirstName("nandan");
		
		driver.quit();
	}
}
