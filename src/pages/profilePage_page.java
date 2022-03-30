package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class profilePage_page extends basic_page{

	public profilePage_page(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}
	public WebElement getCardLoremText() {
		return driver.findElement(By.xpath("//*[@class= 'card__lorem']"));
	}
	public WebElement getDeleteProfile() {
		return driver.findElement(By.xpath("//div[contains(@class, 'card__description')]/button"));
	}
	public WebElement getLogout() {
		return driver.findElement(By.xpath("//div[@class='card__description']/button[2]"));
	}
	public void deleteProfile() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOf(getCardLoremText()));
		getDeleteProfile().click();
	}
}
