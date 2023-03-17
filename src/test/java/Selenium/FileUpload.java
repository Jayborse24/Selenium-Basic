package Selenium;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class FileUpload {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void fileUpLoad () throws InterruptedException {
		driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Admin\\OneDrive\\Desktop\\jay.txt");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button'][@class='btn btn-success btn-xs']")).click();
	}
	@Test
	public void file_Upload() throws InterruptedException, IOException {
		driver.get("https://smallpdf.com/pdf-converter");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='l3tlg0-0 ggoliT']")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\Admin\\OneDrive\\Desktop\\jay.txt");
		Thread.sleep(2000);
		driver.close();	
	}
	@Test
	public void download() {
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("4.8.0")).click();
		
	}

}
