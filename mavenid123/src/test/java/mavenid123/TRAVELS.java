package mavenid123;

	import javax.swing.JList.DropLocation;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class TRAVELS {
		public static String url="https://demo.guru99.com/test/newtours/";
		WebDriver driver;
		@BeforeTest
		public void suri() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(url);
			driver.manage().window().maximize();
			String beforelogin=driver.getCurrentUrl();
			System.out.println(beforelogin);
			Thread.sleep(2000);
		}
			@Test(priority = 0)
			public void test() throws InterruptedException {
			driver.findElement(By.name("userName")).sendKeys("user");
			driver.findElement(By.name("password")).sendKeys("user");
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			Thread.sleep(10000);
		
			}
			@Test(priority = 1)
			public void test2() throws InterruptedException {
				Thread.sleep(10000);
				driver.findElement(By.xpath("//*[text()='REGISTER']")).click();
				driver.findElement(By.name("firstName")).sendKeys("suresh");
				driver.findElement(By.name("lastName")).sendKeys("talakal");
				driver.findElement(By.name("phone")).sendKeys("879564133");
				driver.findElement(By.name("userName")).sendKeys("sure@gmail.com");
				Thread.sleep(2500);
				driver.findElement(By.name("address1")).sendKeys("koopal");
				driver.findElement(By.name("city")).sendKeys("hubli");
				driver.findElement(By.name("state")).sendKeys("kA");
				driver.findElement(By.name("postalCode")).sendKeys("524612");
				WebElement dropdown=driver.findElement(By.name("country"));
				Select selectObject = new Select(dropdown);
				selectObject.selectByIndex(10);
				selectObject.selectByVisibleText("ARMENIA");
				Thread.sleep(2500);
				driver.findElement(By.name("email")).sendKeys("Suresh");
				driver.findElement(By.name("password")).sendKeys("Suresh123");
				driver.findElement(By.name("confirmPassword")).sendKeys("Suresh123");
				driver.findElement(By.xpath("//*[@name='submit']")).click();
	        	driver.findElement(By.xpath("//*[@face='Arial, Helvetica, sans-serif']")).click();	
				
			}
				
			@Test
			public void test3() {
				driver.findElement(By.xpath(url))
			}
			
			
			
			
			
			
			@AfterTest(enabled = true)
			public void sst() throws InterruptedException {
				System.out.println(url);
				Thread.sleep(2500);
				driver.close();
	}
	}
	
