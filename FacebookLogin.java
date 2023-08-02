package Inclassassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rani bogidi");
		//driver.findElement(By.xpath("//input[contains(@name, 'pass')]")).sendKeys("899489498");
		driver.findElement(By.xpath("//input[starts-with(@id, 'pa')]")).sendKeys("899489498");

		
	driver.close();
	
	
	
	}

}
