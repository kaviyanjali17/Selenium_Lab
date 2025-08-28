package pac1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Lab_8_Webdriver_TestNG {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?");
        System.out.println("Opened TutorialNinja demo site.");
    }

    @Test
    public void testLab4Flow() throws InterruptedException {

    	String title = driver.getTitle();
        System.out.println("Page Title: " + title);

        driver.findElement(By.linkText("Desktops")).click();
        driver.findElement(By.linkText("Mac (1)")).click();
        System.out.println("Clicked on Mac under Desktops.");

        WebElement macHeading = driver.findElement(By.xpath("/html/body/div[2]/div/div/h2"));
        Assert.assertTrue(macHeading.isDisplayed(), "Mac heading is not displayed!");
        System.out.println("Verified Mac heading is displayed.");

        Select sort = new Select(driver.findElement(By.id("input-sort")));
        sort.selectByVisibleText("Name (A - Z)");
        System.out.println("Selected Sort By: Name (A-Z)");

        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[2]/div[2]/button[1]/i")).click();
        System.out.println("Clicked on Add to Cart for first product.");

        WebElement searchBox = driver.findElement(By.name("search"));
        searchBox.clear();
        searchBox.sendKeys("Mobile");
        driver.findElement(By.xpath("/html/body/header/div/div/div[2]/div/span/button")).click();
        System.out.println("Searched for 'Mobile'.");

        WebElement searchCriteria = driver.findElement(By.name("search"));
        searchCriteria.clear();
        System.out.println("Cleared Search criteria.");

        driver.findElement(By.name("description")).click();
        driver.findElement(By.id("button-search")).click();
        System.out.println("Clicked Search with 'Search in product descriptions' checked.");

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
        System.out.println("Browser closed.");
    }
}
