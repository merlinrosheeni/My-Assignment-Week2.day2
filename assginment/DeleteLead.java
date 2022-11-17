package week2.day2.assginment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("0987654321");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		
		String DeleteleadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]")).getText();
		System.out.println(DeleteleadID);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']//a[1]")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(DeleteleadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String msg = driver.findElement(By.xpath("//div[contains(text(), 'No records')]")).getText();
		System.out.println(msg);
		if (msg.equals("No records to display")) {
			System.out.println("Message verified");
		}
		else {
			System.out.println("Wrong message");
		}
		
		driver.close();
	}

	}


