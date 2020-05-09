package homework2;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class TestTechfios {
	
	WebDriver driver;
	@Test
	public void test() {
		//System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
		//driver = new InternetExplorerDriver();
		//driver.get("http://techfios.com/test/billing/?ng=admin/");
		//driver.get("http://google.com");
		//driver.manage().window().maximize();

		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("http://techfios.com/test/billing/?ng=admin/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys(" techfiosdemo@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc123");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(), 'Transactions')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Add Deposit')]")).click();
		
		driver.findElement(By.id("select2-account-container")).click();
		WebElement DROPDOWN_LOCATOR = driver.findElement(By.xpath("//select[@id = 'account']"));
		Select s = new Select(DROPDOWN_LOCATOR);
		s.selectByVisibleText("Homeloan240");
				
		//s.selectByValue("Homeloan199");
		
		
		//driver.findElement(By.linkText("Add Deposit")).click();
		//driver.findElement(By.xpath("//select[@id='account']")).click();
		//Select s = new Select(driver.findElement(By.xpath("//li[@class='select2-results__option']")));
		//s.selectByValue("select2-account-result-9t05-Homeloan199");
		//Select s1 = new Select(driver.findElement(By.xpath("//input[@id='description']")));
		//driver.findElement(By.xpath("//span[contains(@class='select2-search select2-search--dropdown')]")).click();
		
		
		
		
		
	}

}
