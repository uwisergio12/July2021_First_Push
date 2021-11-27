package variousConcepts;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LiginTest_Junit {
	static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
	}
	@Before
	public void launchBrowser() {
		System.out.println("Launch Browser");
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\uwise\\July2021_Selenium\\FirstSelenium\\driver\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.techfios.com/billing/?ng=admin/e");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}
	
	@Test
	public void loginTest() throws InterruptedException {
		System.out.println("Login Test");

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		

	}
	@Test
	public void negLoginTest() throws InterruptedException {
		System.out.println("Neg Login Test");

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);

	}
	
	@After
	public void tearDown() {
		System.out.println("Tear Down");
		driver.close();
		driver.quit();

	}

}
