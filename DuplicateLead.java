package week2.day1;

import org.apache.poi.ss.formula.functions.Replace;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		
				// call WDM
				WebDriverManager.chromedriver().setup();
				
				//launch URL
				ChromeDriver driver = new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.manage().window().maximize();
				
				
				
				//Username and password using id locator
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				//click login button using class locator
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//click CRM/SFA link
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				//click leads button
				driver.findElement(By.linkText("Leads")).click();
				
				//click create lead
				driver.findElement(By.linkText("Create Lead")).click();
				
				//Enter companyname using is locator
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
				
				//Enter firstname using id locator
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rajee");
				
				//Enter last name using id locator
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sundaram");
				
				//Enter firstname(local) using id locator
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Raj");
				
				//Enter department field using any locator
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
				
				//Description field using any locator
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium");
				
				//Enter E-mail 
				
				driver.findElement(By.name("primaryEmail")).sendKeys("r@gmail.com");
				
				//Select state/province as NewYork using visible text
				WebElement dropdown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select list = new Select(dropdown);
				list.selectByVisibleText("New York");
				
				//click create button
				driver.findElement(By.className("smallSubmit")).click();
				
				//Get the title of the resulting page
				String title = driver.getTitle();
				System.out.println("The title of the page is " + title);
				
				//Click duplicate button
				driver.findElement(By.linkText("Duplicate Lead")).click();
				
				
				//clear the company name and enter new company name
				WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
				companyName.clear();
				companyName.sendKeys("Leaftest");
				
				
				//clear the firstname and enter new firstname
				WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
				firstName.clear();
				firstName.sendKeys("Shree");
				
				
				//click create lead button
				
				driver.findElement(By.className("smallSubmit")).click();
				
				//Get the title of the page
				String title1 = driver.getTitle();
				System.out.println("The title of this page is " + title1);

	}

}
