package Selenium;
import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class JavaExecutor_Popup {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	@Test
	public void Alert_PopUp() throws InterruptedException {
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("alertButton")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
	}
	
	@Test
	public void Alert_Appear_Popup() throws InterruptedException {
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("timerAlertButton")).click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(alert.getText());
		alert.accept();
		Thread.sleep(2000);
	}
	@Test
	public void confirmation_accept_Popup () throws InterruptedException, AWTException {
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Robot robot = new Robot ();
		robot.mouseWheel(1);
		Thread.sleep(3000);
		driver.findElement(By.id("confirmButton")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.accept();
	}
	@Test
	public void confirmation_dismiss_Popup () throws InterruptedException, AWTException {
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Robot robot = new Robot ();
		robot.mouseWheel(1);
		Thread.sleep(3000);
		driver.findElement(By.id("confirmButton")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.dismiss(); 
	}
	@Test
	public void prompt_Popup () throws InterruptedException {
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		JavascriptExecutor exe = (JavascriptExecutor)driver;
		exe.executeScript("window.scrollBy(0,200)");
		driver.findElement(By.id("promtButton")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(3000);
		alert.sendKeys("tushar");
		Thread.sleep(3000);
		alert.accept(); 
	}
}
