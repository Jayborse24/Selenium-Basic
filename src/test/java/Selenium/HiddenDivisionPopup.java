package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class HiddenDivisionPopup {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void hiddenPopup () throws InterruptedException {
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@placeholder='Pick a date'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("24")).click();
	}
}
