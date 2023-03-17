package Selenium;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class JS_Executor {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void enter_Text_DisableField() throws InterruptedException {
		driver.get("C:\\Users\\Admin\\OneDrive\\Desktop\\Autoit\\Js.html");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t1').value='Jayesh Borse'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t2').value=''");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t2').value='manager'");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('t2').type='button'");
		Thread.sleep(2000);
	}
	@Test 
	public void ScrollUp_MoveToElement() throws InterruptedException {
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor jsexe = (JavascriptExecutor)driver;
		jsexe.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		jsexe.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(2000);
		driver.close();
	}
}
