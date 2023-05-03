package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/");
		    driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		    driver.findElement(By.id("password")).sendKeys("crmsfa");
		    driver.findElement(By.className("decorativeSubmit")).click();
		    driver.findElement(By.partialLinkText("CRM")).click();
		    driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Godhai");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lakshmi");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Godhai");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
			driver.findElement(By.id("createLeadForm_description")).sendKeys("Software Testing");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("godhailakshmi2904@gmail.com");
			driver.findElement(By.name("submitButton")).click();
			String title = driver.getTitle();
		    System.out.println(title);
		    driver.findElement(By.linkText("Duplicate Lead")).click();
		    driver.findElement(By.id("createLeadForm_companyName")).clear();
		    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf Software Solutions");
	        driver.findElement(By.id("createLeadForm_firstName")).clear();
	        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("O.Godhai");
	        driver.findElement(By.name("submitButton")).click();
	        String title2 = driver.getTitle();
	        System.out.println(title2);
	}
}

