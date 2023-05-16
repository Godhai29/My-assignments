package week4.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.leafground.com/frame.xhtml");
        
        //CLick Me inside frames
        driver.switchTo().frame(0);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Click Me']")).click();
        String frmMsg = driver.findElement(By.xpath("(//button[@id='Click'])[1]")).getText();
        System.out.println("Click me inside frames:" +frmMsg);
        
        //Nested Frames
        driver.switchTo().defaultContent();
        driver.switchTo().frame(2);
        driver.switchTo().frame("frame2");
        driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
        String nestedFrame = driver.findElement(By.xpath("//button[contains(text(),'Hurray!')]")).getText();
        System.out.println("Nested Frame: "+nestedFrame);
        
        //To find the count of  Frames
        driver.switchTo().defaultContent();
        List<WebElement> count = driver.findElements(By.tagName("iframe"));
        Thread.sleep(3000);
        System.out.println("Total no of frames:" +count.size());
        Thread.sleep(1000);
        }
	}
