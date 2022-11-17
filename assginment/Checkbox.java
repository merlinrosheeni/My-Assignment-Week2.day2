package week2.day2.assginment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {


		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
			driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
			System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
			System.out.println(driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isSelected());
			System.out.println(driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected());
			System.out.println(driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input[1]")).isEnabled());
			System.out.println(driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input[3]")).isSelected());
			System.out.println(driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input[5]")).isDisplayed());
			System.out.println(driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input[6]")).isSelected());
			driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
			driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
			driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
			driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
			driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();
			driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).click();
			driver.findElement(By.xpath("(//input[@type='checkbox'])[14]")).click();
	
		}
		}

			
			