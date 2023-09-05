package testCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pom_scripts.HomePage;
import pom_scripts.RegisterPage;

public class LoginTest {
	
	@Parameters({"url"})
	@Test(groups = "IT")
	public void login(@Optional("https://demowebshop.tricentis.com") String url) throws InterruptedException, IOException {
		
		//Create report object
		ExtentReports report=new ExtentReports("./Reports/report.html");
		
		//Create ExtentTest Object
		ExtentTest test=report.startTest("LoginTest");
		
        System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		test.log(LogStatus.INFO, "Browser launched");
		
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Browser maximized");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		
//		//Read data from property file
//		Properties prop=new Properties();
//		
//		FileInputStream fis=new FileInputStream("./src/test/resources/PropertyFiles/data.properties");
//		prop.load(fis);
		driver.get(url);
		report.endTest(test);
		report.flush();
		Thread.sleep(2000);
		driver.quit();
	}

}
