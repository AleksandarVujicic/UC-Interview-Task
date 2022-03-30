package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class createNewProfile_page extends basic_page {

	public createNewProfile_page(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	public WebElement getName() {
		return driver.findElement(By.id("profile-name"));
	}

	public WebElement getAge() {
		return driver.findElement(By.xpath("//*[@id= 'AGE_18_PLUS']/.."));
	}

	public WebElement getAvatar() {
		return driver.findElement(By.xpath("//img[@alt= 'Avatar']"));
	}

	public WebElement getCreateProfileButton() {
		return driver.findElement(By.xpath("//button[@type= 'submit']"));
	}

	public WebElement getBirthYearInput() {
		return driver.findElement(By.id("year"));
	}

	public void createNewProfile(String name, String birthYear) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		getName().sendKeys(name);
		Thread.sleep(500);
		getAge().click();
		Thread.sleep(500);
		getBirthYearInput().sendKeys(birthYear);
		js.executeScript("arguments[0].scrollIntoView()", getAvatar());
		Thread.sleep(500);
		js.executeScript("arguments[0].click()", getAvatar());
		Thread.sleep(500);
		getCreateProfileButton().click();
	}
}
