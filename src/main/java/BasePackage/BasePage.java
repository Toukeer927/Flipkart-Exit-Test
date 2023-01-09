package BasePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ExcelReport.ExcelManager;
import ExtendReport.ExtendManagerReport;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage extends ExcelManager {

	public static WebDriver driver = null;

	public static ExtentReports extent;
	public static ExtentTest test;

	@BeforeSuite

	public void launchBrowser() throws IOException, InterruptedException {

		String browserName = ReadPropertyFile.getProperty("browser");

		if (ReadPropertyFile.getProperty("mode").equalsIgnoreCase("non-headless")) {
			if (browserName.equals("chrome")) {
				extent = ExtendManagerReport.getInstance("reports/ExtentReports.html");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			}
		} else if (browserName.equals("edge")) {
			extent = ExtendManagerReport.getInstance("reports/ExtentReports.html");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}

		else {
			System.out.println("");
		}

		if (ReadPropertyFile.getProperty("mode").equalsIgnoreCase("headless")) {
			if (browserName.equals("chrome")) {
				extent = ExtendManagerReport.getInstance("reports/ExtentReports.html");
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("headless", "--window-size=1920,1200");
				driver = new ChromeDriver(options);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			}
		} else if (browserName.equals("edge")) {
			extent = ExtendManagerReport.getInstance("reports/ExtentReports.html");
			WebDriverManager.edgedriver().setup();
			EdgeOptions options = new EdgeOptions();
			options.addArguments("headless", "--window-size=1920,1200");
			driver = new EdgeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}

		else {
			System.out.println("");
		}
	}

	@AfterSuite

	public void CloseBrowser() {

		extent.flush();
		driver.quit();

	}

	@BeforeMethod
	public void startTest(Method method) throws IOException {
		test = extent.startTest(method.getName());

		driver.get(ReadPropertyFile.getProperty("url"));

	}

	@AfterMethod
	public void reportFlush(ITestResult result) throws IOException {

		System.out.println(result.getMethod().getMethodName());
		if (result.getStatus() == ITestResult.FAILURE)

			test.log(LogStatus.FAIL, result.getThrowable());
		else if (result.getStatus() == ITestResult.SKIP)
			test.log(LogStatus.SKIP, result.getThrowable());

		else

			test.log(LogStatus.PASS, "Test passes");

		if (result.getStatus() == ITestResult.FAILURE) {

			String imagePath = ScreenShot.captureScreenshot(driver, result.getName());
			test.log(LogStatus.FAIL, test.addScreenCapture(imagePath));

		}

		else {

			if (result.getStatus() == ITestResult.SUCCESS) {

				test.log(LogStatus.PASS, "Test Case Pass");
			}

		}

	}
}
