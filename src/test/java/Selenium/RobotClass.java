package Selenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class RobotClass {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	/*****	Mouse operator ******/
	@Test
	public void mouseOperation () throws InterruptedException, AWTException {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("jayborse59@gmail.com");
		Thread.sleep(3000);
		Robot robo = new Robot ();	
		robo.mouseMove(300, 600);
		Thread.sleep(3000);
		robo.mouseWheel(3);
		Thread.sleep(3000);
		robo.mouseWheel(-3);
		Thread.sleep(3000);
//		driver.quit();
	}	
	
/*****	Keyboard operator ******/
	@Test
	public void keyboardOperation () throws InterruptedException, AWTException {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("jayborse59@gmail.com");
		Thread.sleep(3000);
		Robot robo = new Robot ();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_T);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_T);
		Thread.sleep(3000);

		robo.keyPress(KeyEvent.VK_G);
		robo.keyRelease(KeyEvent.VK_G);
		robo.keyPress(KeyEvent.VK_O);
		robo.keyRelease(KeyEvent.VK_O);
		robo.keyPress(KeyEvent.VK_O);
		robo.keyRelease(KeyEvent.VK_O);
		robo.keyPress(KeyEvent.VK_G);
		robo.keyRelease(KeyEvent.VK_G);
		robo.keyPress(KeyEvent.VK_L);
		robo.keyRelease(KeyEvent.VK_L);	
		robo.keyPress(KeyEvent.VK_E);
		robo.keyRelease(KeyEvent.VK_E);
		robo.keyPress(KeyEvent.VK_DECIMAL);
		robo.keyRelease(KeyEvent.VK_DECIMAL);
		robo.keyPress(KeyEvent.VK_C);
		robo.keyRelease(KeyEvent.VK_C);
		robo.keyPress(KeyEvent.VK_O);
		robo.keyRelease(KeyEvent.VK_O);
		robo.keyPress(KeyEvent.VK_M);
		robo.keyRelease(KeyEvent.VK_M);
		Thread.sleep(3000);

		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

	}
}
