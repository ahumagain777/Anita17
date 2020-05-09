package homework2;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {
	WebDriver driver;
	@Test
	public void test1() {
		//System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
		//driver = new InternetExplorerDriver();
		//driver.get("http://techfios.com/test/billing/?ng=admin/");
		//driver.get("http://google.com");
		//driver.manage().window().maximize();

		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("http://techfios.com/test/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys(" techfiosdemo@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
}
}
