package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.leafground.com/alert.xhtml");
        //Simple Alert
        
        driver.findElement(By.xpath("//span[text()='Show']")).click();
        Alert simpleAlert = driver.switchTo().alert();
        Thread.sleep(1000);
        System.out.println(simpleAlert.getText());
        simpleAlert.accept();
        String msg = driver.findElement(By.xpath("//span[@id='simple_result']")).getText();
        System.out.println("Simple Dialog:" +msg);
        
        //Confirm Alert
        
        driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
        Alert confirmAlert = driver.switchTo().alert();
        Thread.sleep(1000);
        System.out.println(confirmAlert.getText());
        confirmAlert.dismiss();
        System.out.println("Confirm Dialog:" +driver.findElement(By.xpath("//span[@id='result']")).getText());
        
        //Sweet Simple Alert
        
        driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
        Thread.sleep(1000);
        String msg1 = driver.findElement(By.xpath("//div[@class='ui-dialog-content ui-widget-content']/p")).getText();
        System.out.println("Sweet Simple Dialog:" +msg1);
        driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
        
        //Sweet Modal Confirmation
        
        driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
        Thread.sleep(3000);
        String msg2 = driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content'])[2]/p")).getText();
        System.out.println("Sweet Modal Dialog: " +msg2);
        driver.findElement(By.xpath("//span[text()='Modal Dialog (Sweet Alert)']/following::span")).click();
        
        // Prompt ALert
        
        driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
        Alert promptAlert = driver.switchTo().alert();
        Thread.sleep(1000);
        System.out.println(promptAlert.getText());
        promptAlert.sendKeys("Godhai Lakshmi");
        promptAlert.accept();
        String msg3 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
        System.out.println("Prompt Dialog:" +msg3);
        
        //Sweet Alert confirmation
        
        driver.findElement(By.xpath("//span[text()='Delete']")).click();
        String sweetConfirm = driver.findElement(By.xpath("//span[contains(text(),'want to proceed')]")).getText();
        System.out.println("Sweet Alert Confirmation:" +sweetConfirm);
        driver.findElement(By.xpath("//span[text()='Yes']")).click();
        
       //Minimize and Maximize
        
        driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
        String maxmin = driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content'])[3]/p")).getText();
        System.out.println("Maximum and Minimum:" +maxmin);
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all'])[3]")).click();
	}
	}
