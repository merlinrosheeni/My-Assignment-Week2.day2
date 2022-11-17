package week2.day2.assginment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		/*http://leaftaps.com/opentaps/control/main//	Launch the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		//	Enter the username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		
		//	Enter the password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//	Click Login
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		//Click crm/sfa link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click Leads link
		driver.findElement(By.linkText("Leads")).click();
		
//		Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();
//		Enter first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Merlin");
		//Click Find leads button
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
		//Click on first resulting lead
		driver.findElement(By.linkText("Merlin")).click();
		//Verify title of the page
		System.out.println(driver.getTitle());
		//Click Edit
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		//Click Update
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
		//Change the company name
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("TCS");
		// Confirm the changed name appears
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		//Close the browser (Do not log out)
		driver.close();
	
		

		
		
		
		
		

		
	}

}
