package week5.day1;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class AssignIncident extends ServiceNowCondition {
	@Test(priority=0)
public void assignIncident() throws InterruptedException, IOException {
	driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("INC0010011",Keys.ENTER);
	driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
	driver.findElement(By.xpath("//button[contains(@class,'btn btn-icon icon-menu navbar')]")).click();
	driver.findElement(By.xpath("//div[text()='View']")).click();
	driver.findElement(By.xpath("//div[text()='Default view']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@id='sys_display.incident.assignment_group']")).sendKeys("Software",Keys.TAB);
	
	Thread.sleep(1000);
	driver.findElement(By.xpath("//textarea[@id='activity-stream-textarea']")).sendKeys("Assignment group updated");
	driver.findElement(By.xpath("//button[text()='Update']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[contains(@class,'btn btn-icon icon-menu')]")).click();
	driver.findElement(By.xpath("//div[text()='View']")).click();
	driver.findElement(By.xpath("//div[text()='Default view']")).click();

}
}
