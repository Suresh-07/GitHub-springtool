package mavenid123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;

public class Auto_Test {
	public static String url="https://www.globalsqa.com/demo-site/";
	WebDriver driver;
	@BeforeTest
	public void suri() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get(url);
		String beforelogin=driver.getCurrentUrl();
		System.out.println(beforelogin);
	}
	@Test 
	
	public void testcase() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id='menu-item-7128']")).click();
		driver.findElement(By.xpath("//*[@id='post-7126']/div/div/div/ul/li[1]/a")).click();
		Thread.sleep(25000);
//		driver.findElement(By.xpath("//*[@class='side_bar_menu']/li[2]/a")).click();
//		driver.findElement(By.xpath("//*[@class='side_bar_menu']/li[2]/a")).click();
//		driver.findElement(By.xpath("//*[@class='side_bar_menu']/li[2]/a")).click();
//		driver.findElement(By.xpath("//*[@class='side_bar_menu']/li[2]/a")).click();
//		driver.findElement(By.xpath("//*[@class='side_bar_menu']/li[2]/a")).click();
	
	}

}