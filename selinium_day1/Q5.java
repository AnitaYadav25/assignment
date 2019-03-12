package selinium_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "/home/anita/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tothenew.com/");
        driver.findElement(By.id("h-contact-us")).click();
        System.out.println("the title of the page is");
        System.out.println(driver.getTitle());
        driver.close();
        }
    }
