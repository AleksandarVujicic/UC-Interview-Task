package test;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class newUserTest extends basic_test {

	@Test

	public void loginTest() throws InterruptedException {

		loginPage.UserLogin("aleksandar.vujicic1", "Lozinka123");
		Thread.sleep(500);
		Assert.assertTrue(chooseProfilePage.getCreateNewProfile().isEnabled(), "[ERROR], Login failed.");
		chooseProfilePage.createNewUser();
		createNewProfilePage.createNewProfile("Aleksandar", "1993");
		Assert.assertTrue(profilePage.getDeleteProfile().isDisplayed(), "[ERROR]'Profile wasn't created successfully'");
		wait.until(ExpectedConditions.visibilityOf(profilePage.getCardLoremText()));
		profilePage.deleteProfile();
	}
}
