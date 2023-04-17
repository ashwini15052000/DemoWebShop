package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoWebShop
{
	WebDriver  driver;
	@BeforeSuite
	public void openBrowser()
	{
		System.out.println("BeforeSuite");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\SeleniumJars\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("Browser Opened");
	}
	@BeforeTest
	public void getUrl()
	{
		System.out.println("Before Test");
		driver.get("https://demowebshop.tricentis.com/register");
		System.out.println("Url get");
	}
	@BeforeClass
	public void maximize()
	{
		System.out.println("Before class");
		driver.manage().window().maximize();
		System.out.println("maximized Browser");
	}
	@Test
	public void Ragi()
	{
	System.out.println("Test");	
	driver.findElement(By.id("gender-female")).click();
	
	driver.findElement(By.id("FirstName")).sendKeys("Ash");
	driver.findElement(By.id("LastName")).sendKeys("Vavhal");
	driver.findElement(By.id("Email")).sendKeys("ash2@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("123456");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
	driver.findElement(By.name("register-button")).click();
	System.out.println("Login Successfully");
	}
}
