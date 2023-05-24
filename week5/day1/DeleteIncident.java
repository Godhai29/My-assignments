package week5.day1;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
public class DeleteIncident extends ServiceNowCondition {
	@Test(priority=-1)
public void deleteExistingIncident() throws InterruptedException, IOException {
driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("INC0010029",Keys.ENTER);
Thread.sleep(1000);
driver.findElement(By.xpath("//a[@class='linked formlink']")).click();
driver.findElement(By.xpath("//button[text()='Delete']")).click();
driver.findElement(By.xpath("//button[@id='ok_button']")).click();

}
}