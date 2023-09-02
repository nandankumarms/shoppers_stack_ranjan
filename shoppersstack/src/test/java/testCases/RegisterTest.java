package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pom_scripts.HomePage;
import pom_scripts.RegisterPage;

public class RegisterTest {
   
	@Test (groups = "ST")
	public void registerTestCase() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get("https://demowebshop.tricentis.com/");
		
		HomePage home=new HomePage(driver);
		RegisterPage register=new RegisterPage(driver);
		
		driver.findElement(By.xpath(""));
		home.clickRegisterLink();
		
		register.clickMaleRadioButton();
		
		register.enterFirstName("nandan");
		
		register.eneterLastName("M S");
		
		register.enterEmail("na1234@gmail.com");
		
		register.eneterPassword("nandan1234");
		
		register.eneterConfirmPassword("nandan1234");
		
		register.clickRegisterButton();
		
		
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test(dependsOnMethods = "registerTestCase")
	public void test2() {
		System.out.println("test2");
	}
}
	
	
	
	

