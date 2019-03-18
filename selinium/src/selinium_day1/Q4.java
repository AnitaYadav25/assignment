package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver","/home/anita/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tothenew.com/");
      driver.findElement(By.id("h-contact-us")).click();
     //  driver.findElement(By.xpath("//a['text()=Contact Us']")).click();
        driver.close();
    }
}
