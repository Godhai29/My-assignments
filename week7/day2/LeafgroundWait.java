package week7.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeafgroundWait {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/waits.xhtml");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
		//Wait for Visibility (1 - 10 Sec)
		String title1 = driver.findElement(By.xpath("(//div[@class='card']/h5)[1]")).getText();
		System.out.println(title1);
		driver.findElement(By.xpath("(//span[text()='Click'])[1]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='I am here']")));
		String text1 = driver.findElement(By.xpath("//span[text()='I am here']")).getText();
		System.out.println(text1);
	    
		//Wait for Invisibility (1 - 10 Sec)
		String title2 = driver.findElement(By.xpath("(//div[@class='card']/h5)[2]")).getText();
		System.out.println(title2);
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='I am about to hide']")));
		
		//Wait for Text Change (1 - 10 Sec)
		String title4 = driver.findElement(By.xpath("(//div[@class='card']/h5)[4]")).getText();
		System.out.println(title4);
		driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[text()='Did you notice?']")));
		
		//Wait for Clickability
		String title3 = driver.findElement(By.xpath("(//div[@class='card']/h5)[3]")).getText();
		System.out.println(title3);
		WebElement clickWait = driver.findElement(By.xpath("//span[text()='Click First Button']"));
		clickWait.click();
		wait.until(ExpectedConditions.elementToBeClickable(clickWait));
		
		}
}
