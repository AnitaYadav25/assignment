package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Alert {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver","/home/anita/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();


        driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//*['text()=Simple Alert']")).click();
        driver.switchTo().alert().getText();
    }
}
