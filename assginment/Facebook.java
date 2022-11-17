package week2.day2.assginment;

import java.sql.DriverManager;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.DriverManagerType;

public class Facebook {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Merlin");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Valantina");
		driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("0987654321");
		driver.findElement(By.xpath("//input[contains(@data-type,'password')]")).sendKeys("Test@leaf");
		WebElement source = driver.findElement(By.xpath("//select[@id='day']"));
		Select dropsource=new Select(source);
		dropsource.selectByValue("25");
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select dropmonth=new Select(month);
		dropmonth.selectByValue("8");
		WebElement year= driver.findElement(By.xpath("//select[@id='year']"));
		Select dropyear=new Select(year);
		dropyear.selectByValue("1991");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.close();
		
		
		
				
				
				
				
	}}