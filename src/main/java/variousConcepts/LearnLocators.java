
package variousConcepts;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	WebDriver driver;
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
	
	@Test
	public void testLocators() {
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		driver.findElement(By.id("sex-1")).click();
		
		//upload file
		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\NanduVani\\Desktop\\Selenium\\2022-08-13--Session 2.pptx");
		
		//link text
		//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		
		//driver.navigate().back();
		
		//partial link text
	//	driver.findElement(By.partialLinkText("Backend")).click();
		
		//css selector
		//driver.findElement(By.cssSelector("input#exp-1")).click();
		
		//driver.findElement(By.cssSelector("input[id='profession-1']")).click();
		
		//driver.findElement(By.cssSelector("input[name='tool'][value='Selenium Webdriver']")).click();
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='exp' and @value='6']")).click();
		
		//driver.findElement(By.xpath("//strong[text() = 'Link Test : Page Change']")).click();
		driver.findElement(By.xpath("//strong[contains(text(),'Link Test : Page Change')]")).click();
		
	}
	
	
	
}
