package week2.day2.assginment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio {

	public static void main(String[] args) {
	
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://testleaf.herokuapp.com/pages/radio.html");
			driver.findElement(By.id("yes")).click();
			
			
			WebElement unchecked = driver.findElement(By.xpath("//input[@name='news']"));
			WebElement checked = driver.findElement(By.xpath("(//input[@name='news'])[2]"));
			if (unchecked.isSelected()) {
				System.out.println("Unchecked Radio button is selected ");
			} 
			else if (checked.isSelected()) {
				System.out.println("Checked Radio button is selected");
			}
			
			WebElement ageGroup = driver.findElement(By.xpath("(//input[@name='age'])[2]"));
			if (!ageGroup.isSelected()) {
				driver.findElement(By.xpath("(//input[@name='age'])[2]")).click();
			}
				driver.close();
				
	}
	}

