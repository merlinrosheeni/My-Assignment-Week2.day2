package week2.day2.assginment;

import java.awt.Dimension;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

import io.github.bonigarcia.wdm.WebDriverManager;

;
class Button {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.id("position")).getLocation());
		System.out.println(driver.findElement(By.id("position")).getLocation().getX());
		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		System.out.println(driver.findElement(By.id("size")).getSize());
		System.out.println(driver.findElement(By.id("size")).getText());
		System.out.println(driver.findElement(By.id("size")).getCssValue("background-color"));
		
		
		driver.close();

	}
}