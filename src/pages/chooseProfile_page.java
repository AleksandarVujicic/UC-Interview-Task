package pages;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class chooseProfile_page extends basic_page {

	public chooseProfile_page(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);

	}

	public WebElement getCreateNewProfile() {
		return driver.findElement(By.xpath("//button[contains(@class, 'button button--primary')]"));
	}

	public void createNewUser() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", getCreateNewProfile());
	}
}
