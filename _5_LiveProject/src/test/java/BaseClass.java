import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    WebDriver driver;
    Properties properties;
    File file;
    @BeforeSuite
    public void Driver() {
        System.setProperty("webdriver.chrome.driver", "/home/anita/Desktop/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

    }
    public void Login() throws IOException {

        driver.get("http://newtours.demoaut.com/index.php");
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
        driver.findElement(By.xpath("//input[@name='login']")).click();
    }
}
