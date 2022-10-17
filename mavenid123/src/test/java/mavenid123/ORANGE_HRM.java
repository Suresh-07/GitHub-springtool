package mavenid123;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ORANGE_HRM {
	@Test
	public void SURI() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C://Users//HP/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();  
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    Thread.sleep(30000);
	    String beforelogin=driver.getTitle();
	    System.out.println(beforelogin);
	    //login
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	    driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]")).click();
	    Thread.sleep(5000);
	    
	    //admin in nation
	    driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li[5]/a")).click();
	    driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
	    driver.findElement(By.xpath("//*[@class='oxd-label oxd-input-field-required']")).click();
	    driver.findElement(By.xpath("//*[@class='oxd-text oxd-text--h6 orangehrm-main-title']")).click();
	    driver.findElement(By.name("name")).sendKeys("India");
	    driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	    Thread.sleep(20000);
	    
	      	driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]")).click();
			driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav-tab']/a")).click();
			driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary']/i")).click();
			driver.findElement(By.name("oxd-divider")).sendKeys("INDIA");
			Thread.sleep(2502);
			driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
			driver.findElement(By.xpath("//*[@class='--active oxd-topbar-body-nav-tab --parent']/ul/li[2]")).click();
			driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary']/i")).click();
			driver.findElement(By.xpath("//*[@class='oxd-input oxd-input--active']")).click();
			Thread.sleep(50000);
			driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
			driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]")).click();
			driver.findElement(By.name("oxd-label")).sendKeys("Admin");
			driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
			driver.findElement(By.xpath("//*[@class='oxd-icon bi-plus oxd-button-icon']")).click();
			driver.findElement(By.xpath("")).click();	
			Thread.sleep(25000);
	        driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
	        driver.findElement(By.xpath("//a[text()='Logout']")).click();
	        System.out.println("the title is same so i logout");
	        Thread.sleep(25000);
}
        
	}








//driver.findElement(By.xpath("//*[@class='oxd-main-menu-item active']")).click();
//driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary']/i")).click();
////driver.findElement(By.xpath("//*[@class='oxd-icon bi-plus oxd-button-icon']")).clear();
//driver.findElement(By.name("Name")).sendKeys("INDIA");
//driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();

//@Test 
//public void testcase2() throws InterruptedException {
//	driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
//	Thread.sleep(5000);
//	driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(4).click();
//	Thread.sleep(5000);
//	driver.findElements(By.xpath("//*//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(4).click();
//	Thread.sleep(5000);
//	driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(4).click();
//	Thread.sleep(5000);
//	driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
//	Thread.sleep(5000);
