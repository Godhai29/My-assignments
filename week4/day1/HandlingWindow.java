package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingWindow {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.leafground.com/window.xhtml");
        System.out.println("First Window:"+driver.getTitle());
        driver.findElement(By.xpath("//span[text()='Open']")).click();
        Thread.sleep(1000);
        // navigating to new window
        Set<String> parentWindow = driver.getWindowHandles();
        List<String> childWindow=new ArrayList<String>(parentWindow);
        driver.switchTo().window(childWindow.get(1));
        System.out.println("New Window Title:"+driver.getTitle());
        driver.close();
        driver.switchTo().window(childWindow.get(0));
        //opens multiple window with delay
        driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
        Set<String> windowHandle = driver.getWindowHandles();
        List<String> multiWindows=new ArrayList<String>(windowHandle);
        driver.switchTo().window(multiWindows.get(1));
        System.out.println("First Window Title: "+driver.getTitle());
        driver.switchTo().window(multiWindows.get(2));
        System.out.println("Second Window Title: "+driver.getTitle());
        driver.close();
        driver.switchTo().window(multiWindows.get(1));
        driver.close();
        driver.switchTo().window(multiWindows.get(0));
        
        //Close all windows except primary
        driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
        Set<String> windowHandles2 = driver.getWindowHandles();
        List<String> closeWindo=new ArrayList<String>(windowHandles2);
        driver.switchTo().window(closeWindo.get(1));
        System.out.println("1st Window Title:" +driver.getTitle());
        Thread.sleep(1000);
        driver.switchTo().window(closeWindo.get(2));
        System.out.println("2nd Window Title:" +driver.getTitle());
        Thread.sleep(1000);
        driver.switchTo().window(closeWindo.get(3));
        System.out.println("3rd Window Title:" +driver.getTitle());
        Thread.sleep(1000);
        driver.close();
        driver.switchTo().window(closeWindo.get(2));
        driver.close();
        driver.switchTo().window(closeWindo.get(1));
        driver.close();
        driver.switchTo().window(closeWindo.get(0));
        
        //Number of opened tabs
        driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
        Set<String> windowHandles3 = driver.getWindowHandles();
        List<String> windowNumber=new ArrayList<String>(windowHandles3);
        System.out.println("Number of opened windows: "+windowNumber.size());
        driver.switchTo().window(windowNumber.get(1));
        System.out.println("Title of opened wimdow: "+driver.getTitle());
        driver.close();
        driver.switchTo().window(windowNumber.get(2));
        System.out.println("Title of opened wimdow: "+driver.getTitle());
        driver.close();
        driver.quit();
      }
}
