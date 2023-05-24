package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import io.github.sukgu.Shadow;

public class ServiceNowCondition {
	public ChromeDriver driver;
	@BeforeMethod
public void preCondition() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://dev69593.service-now.com/navpage.do");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Sairam29@");
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	//creating a shadowDOM
	Shadow shadowDOM=new Shadow(driver);
	shadowDOM.setImplicitWait(15);
	//Creating a new incident
	shadowDOM.findElementByXPath("//div[@id='d6e462a5c3533010cbd77096e940dd8c']").click();
	shadowDOM.findElementByXPath("//span[text()='Incidents']").click();
	WebElement frame = shadowDOM.findElementByXPath("//iframe[@id='gsft_main']");
	driver.switchTo().frame(frame);
}
	@AfterMethod
public void postCondition() {
	driver.close();
}
}
