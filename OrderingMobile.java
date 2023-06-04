package week5.day2;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class OrderingMobile extends SuperClass {
@Test
	public void orderMobile() throws IOException, InterruptedException {
            	// Click-AllEnter Service catalog in filter navigator and press enter 
	            shadowDOM.findElementByXPath("//span[text()='Service Catalog']").click();
	            WebElement frame = shadowDOM.findElementByXPath("//iframe[@id='gsft_main']");
	            driver.switchTo().frame(frame); 
                //Click on  mobiles
				driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
				//driver.findElement(By.xpath("//input[@class='scSearchInput']")).sendKeys("Apple iphone 13",Keys.ENTER);
				Thread.sleep(1000);
				driver.findElement(By.xpath("(//strong[contains(text(),'Apple iPhone 13')])[1]")).click();
				driver.findElement(By.xpath("//label[contains(text(),'No')]")).click();
				WebElement dataAllow = driver.findElement(By.xpath("//select[@class='form-control cat_item_option ']"));
				Select src=new Select(dataAllow);
				src.selectByVisibleText("Unlimited [add $4.00]");
				driver.findElement(By.xpath("//label[contains(text(),'Pink')]")).click();
				driver.findElement(By.xpath("//label[contains(text(),'256 GB')]")).click();
				driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
				System.out.println("Order Placed: "+driver.getTitle());
				//order placed screenshot
				File src1 = driver.getScreenshotAs(OutputType.FILE);
			    File dest=new File("./snap/orderplaced.png");
			    FileUtils.copyFile(src1, dest);
	}
}
