package Inclassassignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OranageHrmLocators {
static WebDriver driver;
By orangHrmLogo = By.xpath("//a[@class=\"navbar-brand nav-logo\"]/img");
By contactSales = By.xpath("//div[@class=\"d-flex web-menu-btn\"]//button[@class=\"btn btn-ohrm btn-free-demo\"]");
By bookFreeDemo = By.xpath("//div[@class=\"d-flex web-menu-btn\"]//button[@class=\"btn btn-ohrm btn-contact-sales\"]");
//input Box
By yourFullName = By.xpath("//*[@id='Form_getForm_FullName']");
By businessEmail= By.xpath("//*[@id='Form_getForm_Email']");
By phoneNumber = By.xpath("//*[@id=\"Form_getForm_Contact\"]");
By country = By.xpath("//*[@name=\"Country\"]");
By submit = By.id("Form_getForm_action_submitForm");
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.orangehrm.com/");
	}

}
