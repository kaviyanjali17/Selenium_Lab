package pac1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Lab_6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		String emailid = "kaviyanjali17@gmail.com";
		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys(emailid);
		System.out.println("Email:"+emailid);
		String password = "Kaviya@123";
		WebElement pass = driver.findElement(By.id("input-password"));
		pass.sendKeys(password);
		System.out.println("Password:"+password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[3]/a")).click();
		driver.findElement(By.linkText("Monitors (2)")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[4]/div/select")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[4]/div/select/option[2]")).click();
		System.out.println("Selected 25 items");
		driver.findElement(By.linkText("Apple Cinema 30\"")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[1]/ul[2]/li[2]/a")).click();
		
		WebElement spec = driver.findElement(By.id("tab-specification"));
		if (spec.isDisplayed()) {
		    System.out.println("Specification tab details are present");
		}
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/div[1]/button[1]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]"));
        System.out.println("Wish List Message appears");
        driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/input")).sendKeys("Mobile");
        driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/span/button")).click();
        driver.findElement(By.id("description")).click();
        driver.findElement(By.id("button-search")).click();
        driver.findElement(By.linkText("HTC Touch HD")).click();
        WebElement qty = driver.findElement(By.id("input-quantity"));
        qty.clear();
        qty.sendKeys("3");
        driver.findElement(By.id("button-cart")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]"));
        System.out.println("Succesfully added message appears");
        driver.findElement(By.id("cart-total")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("/html/body/header/div/div/div[3]/div/ul/li[2]/div/p/a[1]/strong")).click();
        WebElement cartItem = driver.findElement(By.linkText("HTC Touch HD"));
        System.out.println("Cart contains: " + cartItem.getText());
        driver.findElement(By.linkText("Checkout")).click();
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("Logout")).click();
        WebElement logoutHeading = driver.findElement(By.tagName("h1"));
        System.out.println("Logout Heading: " + logoutHeading.getText());
        driver.findElement(By.linkText("Continue")).click();
	}
}
