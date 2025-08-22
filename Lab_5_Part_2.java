package pac1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Lab_5_Part_2 {
	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		String first = "abcdefghijklmnopqrstuvwxyzabcdefg";
		WebElement firstname = driver.findElement(By.id("input-firstname"));
		firstname.sendKeys(first);
		System.out.println("First Name:"+first);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		WebElement firstwarn = driver.findElement(By.xpath("//*[@id=\"account\"]/div[2]/div/div"));
		System.out.println("FirstName Warning Message:" +firstwarn.getText());
		String last = "abcdefghijklmnopqrstuvwxyzabcdefg";
		WebElement lastname = driver.findElement(By.id("input-lastname"));
		lastname.sendKeys(last);
		System.out.println("Last Name:"+last);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		WebElement lastwarn = driver.findElement(By.xpath("//*[@id=\"account\"]/div[3]/div/div"));
		System.out.println("LastName Warning Message:" +lastwarn.getText());
		String emailid = "kaviyanjali17@gmail.com";
		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys(emailid);
		System.out.println("Email:"+emailid);
		WebElement telephone = driver.findElement(By.id("input-telephone"));
		telephone.sendKeys("1234567891");
		System.out.println("Telephone: 1234567891");
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}
}
