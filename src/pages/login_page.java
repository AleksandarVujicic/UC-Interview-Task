package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login_page extends basic_page {

	public login_page(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);

	}
	public WebElement getUserName() {
		return driver.findElement(By.id("username"));
	}
	public WebElement getPassword() {
		return driver.findElement(By.id("password"));
	}
	public WebElement getLoginButton() {
		return driver.findElement(By.xpath("//button[contains(@type, 'submit')]"));
	}
	public WebElement getLoginErrorMessage() {
		return driver.findElement(By.xpath("//span[contains(@class, 'form__error')]"));
	}
	public void UserLogin(String userName, String password) {
		getUserName().clear();
		getUserName().sendKeys(userName);
		getPassword().clear();
		getPassword().sendKeys(password);
		getLoginButton().click();
	}
}
