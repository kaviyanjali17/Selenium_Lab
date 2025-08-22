package pac1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Lab_5_full {
	public static void main(String[] args) {
		//part1 without warnings
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?");
		System.out.println("Page Title: " + driver.getTitle());
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		WebElement heading = driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));
		System.out.println("Heading: " + heading.getText());
		
		//part2 without warnings
		String first = "Kaviya";
		WebElement firstname = driver.findElement(By.id("input-firstname"));
		firstname.sendKeys(first);
		System.out.println("First Name:"+first);
		String last = "M";
		WebElement lastname = driver.findElement(By.id("input-lastname"));
		lastname.sendKeys(last);
		System.out.println("Last Name:"+last);
		String emailid = "anjali@gmail.com";
		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys(emailid);
		System.out.println("Email:"+emailid);
		WebElement telephone = driver.findElement(By.id("input-telephone"));
		telephone.sendKeys("12345678910");
		System.out.println("Telephone: 12345678910");
		
		//part4
		String password = "Kaviya@123";
		WebElement pass = driver.findElement(By.id("input-password"));
		pass.sendKeys(password);
		System.out.println("Password:"+password);
		String passconfirm = "Kaviya@123";
		WebElement confirm = driver.findElement(By.id("input-confirm"));
		confirm.sendKeys(passconfirm);
		System.out.println("Password Confirm:"+passconfirm);
		
		//part 5
		driver.findElement(By.xpath("//input[@name='newsletter' and @value='1']")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/h1")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul[2]/li[1]/a")).click();
	}
}
