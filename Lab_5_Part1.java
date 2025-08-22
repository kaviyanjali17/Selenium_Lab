package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab_5_Part1 {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?");
		System.out.println("Page Title: " + driver.getTitle());
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		WebElement heading = driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));
		System.out.println("Heading: " + heading.getText());
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		WebElement warning = driver.findElement(By.xpath("//*[@id=\"account-register\"]/div[1]"));
		System.out.println("Warning Message: " + warning.getText());
		
	}
}
