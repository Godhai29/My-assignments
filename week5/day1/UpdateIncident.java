package week5.day1;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UpdateIncident extends ServiceNowCondition {
	@Test(priority=1)
public void updateExistingIncident() throws IOException {
	driver.findElement(By.xpath("(//a[@class='linked formlink'])[4]")).click();
	WebElement urgency = driver.findElement(By.xpath("//select[@id='incident.urgency']"));
	Select source=new Select(urgency);
	source.selectByVisibleText("1 - High");
	WebElement state = driver.findElement(By.xpath("//select[@id='incident.state']"));
	Select source1=new Select(state);
	source1.selectByIndex(1);
	driver.findElement(By.xpath("//button[text()='Update']")).click();
	driver.findElement(By.xpath("(//a[@class='linked formlink'])[4]")).click();
	//verification by snapshot
	File src = driver.getScreenshotAs(OutputType.FILE);
    File dest=new File("./snap/updatedIncident.png");
    FileUtils.copyFile(src, dest);
	}
}
