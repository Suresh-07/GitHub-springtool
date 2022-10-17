package mavenid123;

	import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.print.attribute.standard.PrinterInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class demo2 {
		private static final boolean flase = false;
		public static String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		WebDriver driver;
		@BeforeTest
		public void suri() {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  // NO NEED THREAD SLEEP
			driver.manage().window().maximize();
			String beforelogin=driver.getCurrentUrl();
			System.out.println(beforelogin);
			}
		//login
		@Test(priority = 1)
		public void testcase1() {
			Thread.sleep(5000);
			driver.findElement(By.name("username")).sendKeys("Admin");
		    driver.findElement(By.name("password")).sendKeys("admin123");
		    driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		    driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]")).click();
		    driver.navigate().back();
		    driver.navigate().forward();
		    driver.navigate().refresh();
		    
		}
		
		
		
		//Login2 done
		@Test (enabled = false)
		public void testlogin()  {
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
		    
		}
		
		//manintence done
	@Test(priority = 2)

	public void testcase2()  {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[10]/a")).click();
	    driver.findElement(By.name("password")).sendKeys("admin123");   
	    driver.findElement(By.xpath("//*[@type='submit']")).click();
		
		}
	
	
	
	//admin done
	@Test(priority = 3,enabled = true)
	public void testadmin() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li")).click();
		Actions act = new Actions(driver);
		WebElement suri=driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
		act.click(suri).build().perform();
		act.sendKeys(suri,Keys.ARROW_DOWN).click().build().perform();
	    act.sendKeys(suri,Keys.ARROW_DOWN).click().build().perform();
	
	   	}
	
	//time
	
	@Test (enabled = false)
	public void tesetime ()    {
		driver.findElement(By.linkText("Time")).click();
		driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(5).click();
		driver.findElements(By.xpath("//*[@class='oxd-table-cell-actions']")).get(5).click();
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--success orangehrm-left-space']")).click();
		}
	
	
	
	@Test(enabled = false)
	public void testadmin1()  {
		
		Actions act = new Actions(driver);
		
		WebElement sur=driver.findElements(By.linkText("Admin")).get(1);
		act.click(sur).build().perform();
		act.sendKeys(sur,Keys.ARROW_DOWN).click().build().perform();
	    act.sendKeys(sur,Keys.ARROW_DOWN).click().build().perform();
	    act.sendKeys(sur,Keys.ARROW_DOWN).click().build().perform();
		act.sendKeys(sur,Keys.ARROW_DOWN).click().build().perform();
		driver.findElements(By.xpath("//*[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input']")).get(2).click();
		driver.findElements(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).get(2).click();
			
	}
	
	//list in admin and delete
	@Test (enabled = false)
	public void testlist () {
		
		driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
		List<WebElement> li=driver.findElements(By.xpath("//*[@class='oxd-table-card']"));
		System.out.print(li.size());
		driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(2).click();
		driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(2);
       	driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(2).click();
//      driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-horizontal-margin']")).click();
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
		}
	
	
	//admin select done
		@Test (enabled = false)
		public void testadmin_act() {
			WebElement suri=driver.findElement(By.linkText("Admin"));
			Actions act= new Actions(driver);
			act.click(suri).build().perform();
			//username
			driver.findElement(By.xpath("//*[@class='oxd-form-row']/div/div[1]/div/div[2]/input")).sendKeys("Cassidy.Hope");
			//user role admin
			WebElement suri1=driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
			act.click(suri1).build().perform();
			act.sendKeys(suri1,Keys.ARROW_DOWN).click().build().perform();
			act.sendKeys(suri1,Keys.ENTER).click().build().perform();
			//empployeee id
	        WebElement emid =  driver.findElement(By.xpath("//*[@class='oxd-autocomplete-wrapper']/div/input"));
			act.sendKeys("Cassidy Hope").click().build().perform();
			WebElement suri3=driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
			act.click(suri3).build().perform();
			//status
			act.sendKeys(suri3,Keys.ARROW_DOWN).click().build().perform();
			act.sendKeys(suri3,Keys.ARROW_DOWN).click().build().perform();
			act.sendKeys(suri3,Keys.ENTER).click().build().perform();
			WebElement suri4=driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
			act.click(suri4).build().perform();
		
		}
		
		//action mouseover
		@Test 
		public void testmouse() {
			
			Actions act1= new Actions(driver);
			act1.moveToElement(driver.findElement(By.linkText("Recruitment"))).click().build().perform();
			act1.contextClick(driver.findElement(By.linkText("Recruitment"))).build().perform();//click right button
			act1.moveToElement(driver.findElement(By.linkText("Leave"))).build().perform();
			act1.moveToElement(driver.findElement(By.linkText("Performance"))).doubleClick().build().perform();
			act1.moveToElement(driver.findElement(By.linkText("Leave"))).click().build().perform();
		}
		
		
			//logout done
			@Test(enabled = false)
			public void testlogout() throws InterruptedException {
				Thread.sleep(25000);
		        driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
		        driver.findElement(By.xpath("//a[text()='Logout']")).click();
		        System.out.println("the title is same so i logout");

			}
	
	
			@Test(enabled = false)
			public void testlink() {
				List<WebElement> links =driver.findElements(By.tagName("a"));
				System.out.println("Total number of the links "+ links.size());
				
				for(int i=0;i<links.size();i++) {
				{
					System.out.println(links.get(i).getText());
					System.out.println(links.get(i).getAttribute("href"));
//					System.out.println(links.get(i).getTagName());
					System.out.println(links.get(i).getLocation());
					System.out.println(links.get(i).getRect());
					
				}}
			}
			///window handle
			@Test
			public void window() {
				driver.getWindowHandle();
				driver.switchTo()).newWindow((WindowType.TAB));
//				driver.get(SST+"/windows");
//				driver.navigate().to("SST");
	
	
	
	
	
	
//			my information
			@Test
			public void testcase5() throws InterruptedException {
				List<WebElement> li=driver.findElements(By.xpath("//*[@class='oxd-main-menu']"));
			    System.out.print(li.size());
				driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[6]")).click();
				driver.findElement(By.name("firstName")).sendKeys("NISI");
				driver.findElement(By.name("middleName")).sendKeys("SINI");
				driver.findElement(By.name("Last Name")).sendKeys("CLFU");
	
		}
			
				@Test
				public void tesetpim () throws InterruptedException   {
					WebElement sur=driver.findElement(By.linkText("PIM"));
					Actions act= new Actions(driver);
					act.click(sur).build().perform();
					WebElement PIM = driver.findElement(By.xpath("//*[@class='oxd-select-text--after']"));
					Actions act6 = new Actions(driver);
					act.click(PIM).build().perform();
					Thread.sleep(2000);
					act.sendKeys(PIM,Keys.ARROW_DOWN).click().build().perform();
					act.sendKeys(PIM,Keys.ARROW_DOWN).click().build().perform();
					Thread.sleep(2000);
					act.sendKeys(PIM,Keys.ENTER).click().build().perform();
					WebElement SS=driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
					Actions act1= new Actions(driver);
					act.click(SS).build().perform();
					Thread.sleep(1000);
					act.sendKeys(SS,Keys.ARROW_DOWN).click().build().perform();
					act.sendKeys(SS,Keys.ARROW_DOWN).click().build().perform();
					act.sendKeys(PIM,Keys.ARROW_DOWN).click().build().perform();
					act.sendKeys(SS,Keys.ENTER).click().build().perform();
					Thread.sleep(1000);
					WebElement ns=driver.findElement(By.xpath("//*[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
					Actions act2 = new Actions(driver);
					act.click(ns).build().perform();
					Thread.sleep(2000);
					act.sendKeys(ns,Keys.ARROW_DOWN).click().build().perform();
					act.sendKeys(ns,Keys.ARROW_DOWN).click().build().perform();
					Thread.sleep(2000);
					act.sendKeys(ns,Keys.ENTER).click().build().perform();
					act.click(SS).build().perform();
					WebElement sech =driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']"));
					Actions act4 = new Actions(driver);
					act.click(sech).build().perform();
					Thread.sleep(2000);
			}
	
