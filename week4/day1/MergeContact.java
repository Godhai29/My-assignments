package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager",Keys.TAB);
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.partialLinkText("CRM")).click();
        driver.findElement(By.xpath("//a[text()='Contacts']")).click();
        driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
        //Click on Widget of From Contact
        driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
        //navigating to resultant window
        Set<String> contacts = driver.getWindowHandles();
        List<String> findContacts=new ArrayList<String>(contacts);
        driver.switchTo().window(findContacts.get(1));
        //Click on First Resulting Contact
        driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
        //switching to parent window
        driver.switchTo().window(findContacts.get(0));
        //Click on Widget of To Contact
        driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
        //navigating to resultant window
        Set<String> contacts1 = driver.getWindowHandles();
        List<String> findContacts1=new ArrayList<String>(contacts1);
        driver.switchTo().window(findContacts1.get(1));
        Thread.sleep(1000);
        //Click on Second Resulting Contact
        driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
        Thread.sleep(1000);
        //switching to parent window
        driver.switchTo().window(findContacts1.get(0));
        //Click on Merge button using Xpath Locator
        driver.findElement(By.xpath("//a[text()='Merge']")).click();
        //Accept the Alert
        Alert confirmAlert = driver.switchTo().alert();
        confirmAlert.accept();
        System.out.println("Title of the resutant page:" +driver.getTitle());
        driver.close();
      }
}
