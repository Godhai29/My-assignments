package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

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
			WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
			Select source=new Select(drop1);
			source.selectByIndex(4);
			WebElement drop2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			Select source1=new Select(drop2);
			source1.selectByVisibleText("Automobile");
			WebElement drop3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			Select source2=new Select(drop3);
			source2.selectByValue("OWN_SCORP");
			driver.findElement(By.name("submitButton")).click();
			String text = driver.findElement(By.id("sectionHeaderTitle_leads")).getText();
		    System.out.println(text);
		    String title = driver.getTitle();
		    System.out.println(title);
		    //driver.close();
			

	}

}
