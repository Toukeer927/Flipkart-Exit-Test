package HomePages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Headers {

	WebDriver driver;

	public Headers(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);

	}

	@FindBy(linkText = "Men's Top Wear")
	WebElement mens;

	public void click_Men() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement element = driver
				.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/a[1]/div[1]/div[1]/img[1]"));
		action.moveToElement(element).build().perform();
		mens.click();
		Thread.sleep(5000);
	}

	@FindBy(css = "div._36fx1h._6t1WkM._3HqJxg div._1YokD2._2GoDe3 div._1YokD2._3Mn1Gg.col-2-12:nth-child(1) div._1YokD2._3Mn1Gg.col-12-12 div._1AtVbE.col-12-12 div._1KOcBL section._167Mu3._2hbLCH:nth-child(8) div._3FPh42 div._2d0we9 div._4921Z.t0pPfW:nth-child(1) div._1Y4Vhm._4FO7b6 label._2iDkf8.t0pPfW > div._24_Dny")
	WebElement buyMore;

	public void click_buyMore() throws InterruptedException {
		buyMore.click();
		Thread.sleep(5000);
	}

	@FindBy(linkText = "Delivery in 1 day")
	WebElement oneDayDelivery;

	public void click_oneDayDelivery() throws InterruptedException {

		oneDayDelivery.click();
		Thread.sleep(5000);
	}

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/img[1]")
	WebElement logo;

	public void click_logo() throws InterruptedException {
		logo.click();
		Thread.sleep(5000);
	}

	@FindBy(linkText = "Audio")
	WebElement audio;

	public void click_audio() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(
				By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[4]/a[1]/div[1]/div[1]/img[1]"));
		action.moveToElement(element).build().perform();
		audio.click();
		Thread.sleep(5000);

	}

	@FindBy(xpath = "//div[contains(text(),'Top Offers')]")
	WebElement offer;

	public void click_offer() throws InterruptedException {
		offer.click();
		Thread.sleep(5000);
	}

	@FindBy(linkText = "Beauty & Personal Care")
	WebElement beauty;

	public void click_beauty() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(
				By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[9]/a[1]/div[1]/div[1]/img[1]"));
		action.moveToElement(element).build().perform();
		beauty.click();
		Thread.sleep(5000);
	}

	@FindBy(xpath = "//a[contains(text(),'Petrol Vehicles')]")
	WebElement vehicel;

	public void click_vehicel() throws InterruptedException {
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(
				By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[10]/a[1]/div[1]/div[1]/img[1]"));
		action.moveToElement(element).build().perform();
		vehicel.click();
		Thread.sleep(5000);

	}

	// travel
	@FindBy(xpath = "/html/body/div[2]/div/div/button")
	WebElement cancel;

	@FindBy(xpath = "//div[contains(text(),'Travel')]")
	WebElement Travel;

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/label[2]/div[1]\r\n"
			+ "")
	WebElement TwoWay;

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement city1;

	@FindBy(xpath = "//div[contains(text(),'LKO')]")
	WebElement Selectcity1;

	@FindBy(xpath = "//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
	WebElement city2;

	@FindBy(xpath = "//div[contains(text(),'DEL')]")
	WebElement Selectcity2;

	@FindBy(name = "0-dateto")
	WebElement RDate;

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[6]/div[1]/button[1]")
	WebElement date;

	@FindBy(xpath = "//span[contains(text(),'SEARCH')]")
	WebElement Search;

	public void cancels() {

		cancel.click();

	}

	public void Click_On_Travel() throws InterruptedException {

		Travel.click();
		Thread.sleep(1500);
	}

	public void Click_On_twoWAY() throws InterruptedException {

		TwoWay.click();
		Thread.sleep(2000);
	}

	public void From_city(String From) throws InterruptedException {

		city1.sendKeys(From);
		Thread.sleep(2000);
		Selectcity1.click();
		Thread.sleep(2000);
	}

	public void To_city(String TO) throws InterruptedException {

		city2.sendKeys(TO);
		Thread.sleep(2000);
		Selectcity2.click();
		Thread.sleep(2000);
	}

	public void Return_Date() throws InterruptedException {

		RDate.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)", "");
		Thread.sleep(2000);
		date.click();
		Thread.sleep(2000);
	}

	public void Sreach_Flight() throws InterruptedException {
		Search.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
	}

	// Became Seller

	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/a[1]/span[1]")
	WebElement BecameASeller;

	public void click_becameASeller() throws InterruptedException {
		BecameASeller.click();
		Thread.sleep(5000);
	}

	@FindBy(xpath = "//body/div[@id='app']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement enterNumber;

	public void click_enterNumber(String name) {
		enterNumber.click();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		enterNumber.sendKeys(name);
	}

	@FindBy(xpath = "//div[contains(text(),'Start Selling')]")
	WebElement sellingbtn;

	public void click_sellingbtn() {
		sellingbtn.click();
	}

	@FindBy(xpath = "//body/div[@id='app-container']/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[2]/input[1]")
	WebElement sellerEmail;

	public void click_sellerEmail(String name) {
		sellerEmail.sendKeys(name);

	}

	@FindBy(xpath = "//body/div[@id='app-container']/div[1]/div[1]/div[1]/form[1]/div[1]/div[4]/div[2]/div[1]/div[1]/div[2]/input[1]")
	WebElement enterGst;

	public void click_enterGst(String name) {
		enterGst.sendKeys(name);
	}

	@FindBy(xpath = "//body/div[@id='app-container']/div[1]/div[1]/div[1]/form[1]/footer[1]/button[1]")
	WebElement registerbtn;

	public void click_registerbtn() throws InterruptedException {
		registerbtn.click();

		Thread.sleep(4000);

	}

}
