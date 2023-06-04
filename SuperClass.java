package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.sukgu.Shadow;

public class SuperClass {
	public ChromeDriver driver;
	public Shadow shadowDOM;
	@Parameters({"url","username","password"})
@BeforeMethod	
public void preCondition(String URL,String uName, String PWD) {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//input[@id='user_name']")).sendKeys(uName);
	driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(PWD);
	driver.findElement(By.xpath("//button[text()='Log in']")).click();
	//creating a shadowDOM
	shadowDOM=new Shadow(driver);
	shadowDOM.setImplicitWait(30);
	//Creating a new incident
	shadowDOM.findElementByXPath("//div[@id='d6e462a5c3533010cbd77096e940dd8c']").click();
	}
@AfterMethod
public void postCondition() {
	driver.close();

}
}
