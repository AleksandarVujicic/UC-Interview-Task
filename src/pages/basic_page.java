package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class basic_page {

	protected WebDriver driver;
	protected WebDriverWait wait;

	public basic_page(WebDriver driver, WebDriverWait wait) {
		this.driver = driver;
		this.wait = wait;
	}
}
