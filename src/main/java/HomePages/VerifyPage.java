package HomePages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifyPage {
	WebDriver driver;

	public VerifyPage(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id=\\\"container\\\"]/div/div[1]/div[1]/div[2]/div[1]/div/a[1]/img")
	WebElement vlogo;

	public void verifiylogo() {
		vlogo.isDisplayed();
	}

}
