package week5.day1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateIncident extends ServiceNowCondition {
	@Test(priority=-2)
 public void createNewIncident() {
    driver.findElement(By.xpath("//button[text()='New']")).click();
	String incidentNo = driver.findElement(By.xpath("//input[@id='incident.number']")).getAttribute("value");
	System.out.println("New Incident Number: "+incidentNo);
	driver.findElement(By.xpath("//input[@id='incident.short_description']")).sendKeys("New Incident Created");
    driver.findElement(By.xpath("//button[text()='Submit']")).click();
    driver.switchTo().defaultContent();
  }
}
