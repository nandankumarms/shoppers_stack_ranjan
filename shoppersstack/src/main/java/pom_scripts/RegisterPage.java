package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;
	
	public void clickMaleRadioButton() {
		maleRadioButton.click();
	}
	
	@FindBy(id = "FirstName")
	private WebElement firstNameTF;
	
	public void enterFirstName(String firstName) {
		firstNameTF.sendKeys(firstName);
	}
	
	@FindBy(id = "LastName")
	private WebElement lastNameTF;
	
	public void eneterLastName(String lastName) {
		lastNameTF.sendKeys(lastName);
	}
	
	@FindBy(id = "Email")
	private WebElement emailTF;
	
	public void enterEmail(String email) {
		emailTF.sendKeys(email);
	}
	
	@FindBy(id = "Password")
	private WebElement passwordTF;
	
	public void eneterPassword(String password) {
		passwordTF.sendKeys(password);
	}
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPasswordTF;
	
	public void eneterConfirmPassword(String cpwd) {
		confirmPasswordTF.sendKeys(cpwd);
	}
	
	
	@FindBy(id = "register-button")
	private WebElement registerButton;
	
	public void clickRegisterButton() {
		registerButton.click();
	}
}
