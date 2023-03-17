package Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class SelectClass {
	public WebDriver driver;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
}
	@Test
	public void selectIndexmethod () throws InterruptedException {
		driver.get("https://omayo.blogspot.com/");
		
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
	WebElement dropdown= driver.findElement(By.id("drop1"));
	Select select= new Select(dropdown);
	 Thread.sleep(2000);
	select.selectByIndex(2);
	driver.close();
	}
	@Test
	public void selectValueMethod () throws InterruptedException {
		driver.get("https://omayo.blogspot.com/");
		
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
	WebElement dropdown= driver.findElement(By.id("drop1"));
	Select select= new Select(dropdown);
	 Thread.sleep(2000);
	select.selectByValue("jkl");
	 Thread.sleep(2000);
	driver.close();
}
	@Test
	public void selectVisibleTextMethod () throws InterruptedException {
		driver.get("https://omayo.blogspot.com/");
		
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
	WebElement dropdown= driver.findElement(By.id("drop1"));
	Select select= new Select(dropdown);
	 Thread.sleep(2000);
	 select.selectByVisibleText("doc 1");
	 Thread.sleep(2000);
		driver.close();
	}
	@Test
	public void getFirstSelectOption () throws InterruptedException {
		driver.get("https://omayo.blogspot.com/");
		
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
	WebElement multiSelectionBoxField= driver.findElement(By.id("multiselect1"));
	Select select= new Select(multiSelectionBoxField);
	 Thread.sleep(2000);
	 select.selectByVisibleText("Audi");
	 select.selectByVisibleText("Volvo");
	 select.selectByVisibleText("Hyundai");
	 WebElement element = select.getFirstSelectedOption();
	 System.out.println(element.getText());
	 driver.close();
}
	@Test
	
	public void getAllSelectOption () throws InterruptedException {
		driver.get("https://omayo.blogspot.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
	WebElement multiSelectionBoxField= driver.findElement(By.xpath("//select[@id='multiselect1']"));
	Select select= new Select(multiSelectionBoxField);
	 Thread.sleep(2000);
	 select.selectByVisibleText("Volvo");
	 select.selectByVisibleText("Hyundai");
	 select.selectByVisibleText("Audi");
	 Thread.sleep(2000);
	 List<WebElement> selectedOptions = select.getAllSelectedOptions();
	 for(WebElement selectedOption:selectedOptions) {
		 System.out.println(selectedOption.getText());
		 Thread.sleep(2000);
		 driver.close();
	 }
		 
	 }
	 @Test
		
		public void deselectAllMethod () throws InterruptedException {
			driver.get("https://omayo.blogspot.com/");
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 WebElement multiSelectionBoxField= driver.findElement(By.xpath("//select[@id='multiselect1']"));
				Select select= new Select(multiSelectionBoxField);
				 Thread.sleep(2000);
				 select.selectByVisibleText("Volvo");
				 select.selectByVisibleText("Swift");
				 select.selectByVisibleText("Hyundai");				
				 select.selectByVisibleText("Audi");
				 Thread.sleep(2000);
				 select.deselectAll();
				 Thread.sleep(2000);
				 driver.close();
	 }
	 @Test
		
		public void ismultipleMethod() throws InterruptedException {
			driver.get("https://omayo.blogspot.com/");
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 WebElement dropdown=driver.findElement(By.id("drop1"));
			 WebElement multiselectionField =driver.findElement(By.id("multiselect1"));
				Select select= new Select( multiselectionField);
				System.out.println(select.isMultiple());
				Select select2= new Select(dropdown);
				System.out.println(select.isMultiple());
				driver.close();
				 }
	 @Test
		
		public void deSelectbyValueMethod() throws InterruptedException {
			driver.get("https://omayo.blogspot.com/");
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 WebElement multiselectionField =driver.findElement(By.id("multiselect1"));
				Select select= new Select( multiselectionField);
				Thread.sleep(2000);
				 select.selectByVisibleText("Volvo");
				 select.selectByVisibleText("Swift");
				 select.selectByVisibleText("Hyundai");				
				 select.selectByVisibleText("Audi");
				 Thread.sleep(2000);
				 select.deselectByValue("Hyundaix");
				 driver.close();
	 }
	 @Test
		
		public void deSelectbyindexMethod() throws InterruptedException {
			driver.get("https://omayo.blogspot.com/");
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 WebElement multiselectionField =driver.findElement(By.id("multiselect1"));
				Select select= new Select( multiselectionField);
				Thread.sleep(2000);
				 select.selectByVisibleText("Volvo");
				 select.selectByVisibleText("Swift");
				 select.selectByVisibleText("Hyundai");				
				 select.selectByVisibleText("Audi");
				 Thread.sleep(2000);
				 select.deselectByIndex(3);
				 driver.close();
}
	 @Test
		
		public void deSelectbyVisibleTextMethod() throws InterruptedException {
			driver.get("https://omayo.blogspot.com/");
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 WebElement multiselectionField =driver.findElement(By.id("multiselect1"));
				Select select= new Select( multiselectionField);
				Thread.sleep(2000);
				 select.selectByVisibleText("Volvo");
				 select.selectByVisibleText("Swift");
				 select.selectByVisibleText("Hyundai");				
				 select.selectByVisibleText("Audi");
				 Thread.sleep(2000);
				 select.deselectByVisibleText("Audi");
				 driver.close();
}

}
