package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello");
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://www.google.com/");
System.out.println("Title is:" +driver.getTitle());
WebElement search = driver.findElement(By.id("APjFqb"));
search.sendKeys("Automation testing tools");
search.submit();

	}

}
