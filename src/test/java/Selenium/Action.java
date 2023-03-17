package Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Action {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void ContextClick_Method() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
		Actions actions = new Actions(driver);
		actions.contextClick(Email).perform();
		Thread.sleep(2000);
		//driver.close();
	}
	
	@Test
	public void DragAndDrop_Method() throws InterruptedException {
		driver.get("https://jqueryui.com/droppable");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement src =driver.findElement(By.id("draggable"));
		WebElement des = driver.findElement(By.xpath("//p[text()='Drop here']"));
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		actions.dragAndDrop(src, des).perform();
		actions.moveToElement(src).clickAndHold().perform();
		actions.release(des).perform();
		Thread.sleep(2500);
		//driver.close();
	}
	@Test
	public void DoubleClick_Method() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		WebElement MobNum = driver.findElement(By.id("email"));
		WebElement Pass = driver.findElement(By.name("pass"));
		actions.doubleClick(Pass).perform();
		Thread.sleep(2000);
		actions.doubleClick(MobNum).perform();
		Thread.sleep(2000);
		//driver.close();
	}
	 @Test
     public void scrollup_MoveTOElement() throws InterruptedException {
   	  driver.get("https://www.facebook.com/");
   	  driver.manage().window().maximize();
   	  Thread.sleep(2000);
   	  JavascriptExecutor js=(JavascriptExecutor)driver;
   	  js.executeScript("window.scrollBy(0,1000)");
   	  Thread.sleep(2000);
   	  js.executeScript("window.scrollBy(0,-500)");
   	  Thread.sleep(2000);
   	  //driver.close();
   	  
     }
}
