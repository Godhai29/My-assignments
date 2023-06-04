package week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class CreateNewProposal extends SuperClass {
@Test
	public void newProposal() {
	shadowDOM.findElementByXPath("//input[@id='filter']").sendKeys("My Proposal",Keys.ENTER);
	//shadowDOM.setImplicitWait(10);
	shadowDOM.findElementByXPath("//mark[text()='My Proposal']").click();
	WebElement frame = shadowDOM.findElementByXPath("//iframe[@id='gsft_main']");
	driver.switchTo().frame(frame);
	driver.findElement(By.xpath("//button[text()='New']")).click();
	driver.findElement(By.xpath("//input[@id='std_change_proposal.short_description']")).sendKeys("New Proposal Created");
	String proposalID = driver.findElement(By.xpath("//span[text()='Number']/following::input[2]")).getAttribute("value");
	System.out.println("New Proposal ID: "+proposalID);
	driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();  
	}
}
