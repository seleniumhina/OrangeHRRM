package PackHRM;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TesttstNG {
    private WebDriver driver;

    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        System.out.println("Setting up the WebDriver");
        System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("Admin");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("admin123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
        Thread.sleep(5000);
    }

    @Test
    public void Test1() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
    }

    @AfterMethod
    public void afterMethod() {
        if (driver != null) {
            System.out.println("Closing the WebDriver");
            driver.quit();
        }
    }
}
