package Inclassassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OhrmDemo {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		driver.findElement(By.xpath("//input[@name='FullName']")).sendKeys("QA Test");
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("QA@Test.com");
		
		driver.findElement(By.xpath("//input[@name='Contact']")).sendKeys("9876543210");
		
		//WebElement countrydropDown = driver.findElement(By.xpath("/select[@id='Form_getForm_Country'])"));
		WebElement countryDropDown = driver.findElement(By.xpath("//select[@id=\"Form_getForm_Country\"]"));
		Select dropdown = new Select(countryDropDown);
		
		dropdown.selectByValue("India");
		//driver.close()	;	

	}

}
