package week5.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FillMandatory extends SuperClass {
	@Test
public void mandatoryField() throws InterruptedException {
	shadowDOM.findElementByXPath("//input[@id='filter']").sendKeys("Knowledge",Keys.ENTER);
	shadowDOM.findElementByXPath("//mark[text()='Knowledge']").click();
	WebElement frame = shadowDOM.findElementByXPath("//iframe[@id='gsft_main']");
	driver.switchTo().frame(frame);
	driver.findElement(By.xpath("//span[text()='Create an Article']")).click();
	driver.findElement(By.xpath("(//span[@class='icon icon-search'])[1]")).click();
	//switching to new window
	Set<String> window 
	= driver.getWindowHandles();
	List<String> newWindow=new ArrayList<String>(window);
	driver.switchTo().window(newWindow.get(1));
	driver.findElement(By.xpath("//a[text()='IT']")).click();
	driver.switchTo().window(newWindow.get(0));
	driver.switchTo().frame(frame);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@id='lookup.kb_knowledge.kb_category']/span")).click();
	WebElement categoryIT = driver.findElement(By.xpath("//div[@class='list-item arrow'][4]/span"));
	driver.executeScript("arguments[0].click();",categoryIT);
	driver.findElement(By.xpath("(//div[@class='list-item'])[6]")).click();
	driver.findElement(By.xpath("//button[@id='ok_button']")).click();
	driver.findElement(By.xpath("//span[text()='Short description']/following::input[2]")).sendKeys("New Article created");
	driver.findElement(By.xpath("(//button[text()='Submit'])[1]")).click();
	}
}
