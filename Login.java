package HRMpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login {
	private WebDriver driver;

    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        System.out.println("Setting up the WebDriver");
        System.setProperty("webdriver.chrome.driver", "C:\\Webdriver\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://macroplanfrontend.estonetech.in/app/home");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        driver.findElement(By.name("email")).sendKeys("admin@macroplan-2140.com");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("12345678");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/form/div/button")).click();
        Thread.sleep(5000);
	
	
	
	
	
	
	@Test
	public void Test1()
	{
		
	}
	
	
}
