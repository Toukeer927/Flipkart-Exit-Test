package BaseTest;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import BasePackage.BasePage;
import ExcelReport.ExcelManager;
import HomePages.HomePage;
import HomePages.VerifyPage;

public class Test1_VerifyTitlePage extends BasePage {
	public static String sheetName = "Sheet1";

	@Test
	public void verifyTitle() throws InterruptedException {
		HomePage h = new HomePage(driver);
		h.CrossButton();
		String testname = "verifyTitle_Test";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execute").toLowerCase();
		ExcelManager.toCheckExecutionRequired(executionRequired);

		String title = driver.getTitle();
		System.out.println("Title:-" + title);
		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		log.info("Page Title is verified");
	}

	@Test(priority = 2)
	public void verifyLogo() {
		VerifyPage v = new VerifyPage(driver);
		String testname = "verifyLogo_Test";
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testname);
		String executionRequired = testData.get("Execute").toLowerCase();
		ExcelManager.toCheckExecutionRequired(executionRequired);

		boolean flag = driver
				.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[1]/div/a[1]/img"))
				.isDisplayed();
		Assert.assertTrue(flag);

		log.info("Logo found successfully");
	}
}
