package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
public static void main(String[] args) {
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://en-gb.facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Godhai");
    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Lakshmi");
    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("godhailakshmi2904@gmail.com");
    driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Facebook123@");
    WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
    Select source=new Select(day);
    source.selectByIndex(28);
    WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
    Select source1=new Select(month);
    source1.selectByValue("4");
    WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
    Select source2=new Select(year);
    source2.selectByVisibleText("1997");
    driver.findElement(By.xpath("//label[text()='Female']")).click();
    }
}
