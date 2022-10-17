package mavenid123;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRM68 {
	public static String HRM="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	 String SST="https://www.bing.com/search?q=tagname+in+selenium&FORM=HDRSC1";
	WebDriver driver;
	@BeforeTest
	public void suri() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get(HRM);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  // NO NEED THREAD SLEEP
		driver.manage().window().maximize();
		String beforelogin=driver.getCurrentUrl();
		System.out.println(beforelogin)
		
	}
	@Test //login
	public void testcase1() throws InterruptedException {
		WebElement username=driver.findElement(By.name("username"));
		if (username.isEnabled())
		{
			username.sendKeys("Admin");
		}
		
		WebElement password= driver.findElement(By.name("password"));
		if(password.isDisplayed())
		{
			password.sendKeys("admin123");
		}
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
//	    driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();			
}
	
	
	//admin using action 
	@Test(enabled = false)
		
	public void testcase5() throws InterruptedException  {
		WebElement suri=driver.findElement(By.linkText("Admin"));
		Actions act= new Actions(driver);
		act.click(suri).build().perform();
		//username
		driver.findElement(By.xpath("//*[@class='oxd-form-row']/div/div[1]/div/div[2]/input")).sendKeys("David.Morris");
		//user role admin
		WebElement suri1=driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
		act.click(suri1).build().perform();
		act.sendKeys(suri1,Keys.ARROW_DOWN).click().build().perform();
		act.sendKeys(suri1,Keys.ENTER).click().build().perform();
	//empployeee id
        WebElement emid =  driver.findElement(By.xpath("//*[@class='oxd-autocomplete-wrapper']/div/input"));
		act.sendKeys("David Morris").click().build().perform();
		Thread.sleep(000);
		WebElement suri3=driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
		act.click(suri3).build().perform();
		//status
		act.sendKeys(suri3,Keys.ARROW_DOWN).click().build().perform();
		act.sendKeys(suri3,Keys.ARROW_DOWN).click().build().perform();
		act.sendKeys(suri3,Keys.ENTER).click().build().perform();
//		WebElement suri4=driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
//		act.click(suri4).build().perform();
		WebElement suri4=driver.findElement(By.xpath("//button[@type='submit']"));
		Actions act1 =new Actions(driver);
		act1. moveToElement(suri4).doubleClick().build().perform();
		
	}
//	action mouseover
	@Test (enabled = false)
	public void testmouse() {
		
		Actions act1= new Actions(driver);
		act1.moveToElement(driver.findElement(By.linkText("Recruitment"))).click().build().perform();
		act1.contextClick(driver.findElement(By.linkText("Recruitment"))).build().perform();
		driver.navigate().back();
//		act1.moveToElement(driver.findElement(By.linkText("Leave"))).build().perform();
		act1.moveToElement(driver.findElement(By.linkText("Performance"))).doubleClick().build().perform();
		act1.moveToElement(driver.findElement(By.linkText("Leave"))).click().build().perform();
	}
	
	
	
	@Test(enabled = false)
	public void testlink() {
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println("Total number of the links "+ links.size());
		
		for(int i=0;i<links.size();i++) {
		{
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("href"));
//			System.out.println(links.get(i).getTagName());
			System.out.println(links.get(i).getLocation());
			System.out.println(links.get(i).getRect());
			
		}}
	}
	
	///window handle
	@Test
	public void window() {
		driver.getWindowHandle();
		driver.switchTo().newWindow((WindowType.TAB));
		driver.navigate().to("SST");
	}}
	