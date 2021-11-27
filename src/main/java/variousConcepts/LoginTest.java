package variousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException  {
		
	launchBrowser();
	loginTest();
	tearDown();
	
	launchBrowser();
	negLoginTest();
	tearDown();
		
	}
	public static void launchBrowser() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\uwise\\July2021_Selenium\\FirstSelenium\\driver\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.techfios.com/billing/?ng=admin/e");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	
	}

	public static void loginTest() throws InterruptedException {

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
	}
	
	public static void negLoginTest() throws InterruptedException {

		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
		
	}
	public static void tearDown() {
		driver.close();
		
	 }

}


