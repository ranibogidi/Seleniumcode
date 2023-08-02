package Inclassassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {
static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https:www.google.com/");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//div[@class=\"FPdoLc lJ9FBc\"]/center/input[1]")).click();
		//driver.findElement(By.xpath("//html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"));
		//driver.findElement(By.className("LC20lb")).click();
		
		driver.quit();

	}

}
