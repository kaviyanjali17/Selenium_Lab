package pac1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Lab_5_Part_5 {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		WebElement firstname = driver.findElement(By.id("input-firstname"));
		firstname.sendKeys("kaviya");
		WebElement lastname = driver.findElement(By.id("input-lastname"));
		lastname.sendKeys("M");
		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys("kavi@gmail.com");
		WebElement telephone = driver.findElement(By.id("input-telephone"));
		telephone.sendKeys("12345678");
		WebElement pass = driver.findElement(By.id("input-password"));
		pass.sendKeys("password");
		WebElement confirm = driver.findElement(By.id("input-confirm"));
		confirm.sendKeys("password");
		driver.findElement(By.xpath("//input[@name='newsletter' and @value='1']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul[2]/li[1]/a")).click();
	}
}
