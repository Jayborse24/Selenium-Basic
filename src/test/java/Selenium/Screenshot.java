package Selenium;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Screenshot {
	
	public WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test	 
	public void screenshot() throws IOException {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		File dfile = new File("C:\\Users\\Admin\\OneDrive\\Pictures\\Screenshots\\FB_SS.png");
		FileHandler.copy(file, dfile);
	}
}
