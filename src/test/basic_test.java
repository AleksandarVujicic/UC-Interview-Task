package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import pages.basic_page;
import pages.chooseProfile_page;
import pages.createNewProfile_page;
import pages.login_page;
import pages.profilePage_page;

public abstract class basic_test {

	protected WebDriver driver;
	protected SoftAssert softAssert;
	protected WebDriverWait wait;
	protected basic_page basicPage;
	protected chooseProfile_page chooseProfilePage;
	protected createNewProfile_page createNewProfilePage;
	protected login_page loginPage;
	protected profilePage_page profilePage;
	protected String baseURL = "https://qa-interview.united.cloud/login";

	
	@BeforeMethod
	public void beforeMethod() {

		System.setProperty("webdriver.chrome.driver", "driver-lib/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.navigate().to(baseURL);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		softAssert = new SoftAssert();

		chooseProfilePage = new chooseProfile_page (driver, wait);
		createNewProfilePage = new createNewProfile_page (driver, wait);
		loginPage = new login_page (driver, wait);
		profilePage = new profilePage_page (driver, wait);
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		driver.quit();
	}
}
