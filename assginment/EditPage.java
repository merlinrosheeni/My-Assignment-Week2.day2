package week2.day2.assginment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPage {
public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("merlin.roshini@gmail.com");
	
	driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("texting");
	
	String Text = driver.findElement(By.xpath("//input[@name='username']")).getAttribute("value");
	System.out.println("Default Text " + Text);

	driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();

	WebElement findElement = driver.findElement(By.xpath("//input[@disabled='true']"));
		
		if(findElement.isEnabled()){
		System.out.println("The Edit field is disabled");
		}
		else {
			
		System.out.println("The Edit field is enabled");
		}
		driver.close();
	}

	
}



