package mavenid123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class zoomclass {
	public static String url="https://zoom.us/";
	WebDriver driver;
	@BeforeTest
	public void suri() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get(url);
		String beforelogin=driver.getCurrentUrl();
		System.out.println(beforelogin);
		Thread.sleep(2000);
	}
		
	@Test
	public void test () throws InterruptedException {
			driver.findElement(By.xpath("//*[@class='signin']")).click();
			driver.findElement(By.name("email")).sendKeys("sureshstalakal@gmail.com");
			driver.findElement(By.name("password")).sendKeys("Talakal_08");
			driver.findElement(By.xpath("//*[@class='btn-block zm-button--primary zm-button--large zm-button']")).click();
			Thread.sleep(50000);
		}
	
	
}
