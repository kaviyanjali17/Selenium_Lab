package pac1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Lab_5_Part_4 {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		String password = "Kaviya@123";
		WebElement pass = driver.findElement(By.id("input-password"));
		pass.sendKeys(password);
		System.out.println("Password:"+password);
		String passconfirm = "Kaviya@123";
		WebElement confirm = driver.findElement(By.id("input-confirm"));
		confirm.sendKeys(passconfirm);
		System.out.println("Password Confirm:"+passconfirm);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}
}
