package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Frames {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void Frame() throws InterruptedException {
		driver.get("C:\\Users\\Admin\\OneDrive\\Desktop\\Autoit\\page2.html");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		driver.findElement(By.id("t1")).sendKeys("Jayesh");
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t2")).sendKeys("23");
		Thread.sleep(2000);
	}
}
