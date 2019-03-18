package Selinium_day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Q6 {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "/home/anita/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");

        driver.findElement(By.xpath("//button[text()='New Browser Tab']")).click();
        Set<String> sessions=driver.getWindowHandles();
        Iterator<String> iterator=sessions.iterator();
        String parent=iterator.next();
        System.out.println(parent);

        String child1=iterator.next();
        driver.switchTo().window(child1);
        System.out.println(child1);
        driver.findElement(By.xpath("//span[text()='Blogs']")).click();
        System.out.println("the current url is "+driver.getCurrentUrl());
        driver.close();
    }
}
