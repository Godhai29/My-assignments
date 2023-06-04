package week5.day2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateNewCaller extends SuperClass {
@Test
	public void newCaller() throws InterruptedException, IOException {
		shadowDOM.findElementByXPath("//input[@id='filter']").sendKeys("Callers",Keys.ENTER);
		shadowDOM.findElementByXPath("//mark[text()='Callers']").click();
		WebElement frame = shadowDOM.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//button[text()='New']")).click();
		driver.findElement(By.xpath("//input[@id='sys_user.first_name']")).sendKeys("Godhai");
		driver.findElement(By.xpath("//input[@id='sys_user.last_name']")).sendKeys("Lakshmi");
		driver.findElement(By.xpath("//input[@id='sys_user.title']")).sendKeys("Software Tester");
		driver.findElement(By.xpath("//input[@id='sys_user.email']")).sendKeys("godhailakshmi@gmail.com");
		driver.findElement(By.xpath("//input[@id='sys_user.mobile_phone']")).sendKeys("9884488011");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(1000);
		WebElement dropDown = driver.findElement(By.xpath("//span[contains(text(),'View')]/following::select[1]"));
		Select source=new Select(dropDown);
		source.selectByVisibleText("First name");
		driver.findElement(By.xpath("//span[contains(text(),'View')]/following::select[1]/following::input[1]")).sendKeys("Godhai",Keys.ENTER);
		//order placed screenshot
		File src1 = driver.getScreenshotAs(OutputType.FILE);
	    File dest=new File("./snap/newcaller.png");
	    FileUtils.copyFile(src1, dest);
	    }
}
