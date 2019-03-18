package Selinium_day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q5 {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "/home/anita/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.londonfreelance.org/courses/frames/index.html");
        System.out.println(driver.findElements(By.tagName("frame")).size());

        driver.switchTo().frame("navbar");
        driver.findElement(By.xpath("//a[text()='Sample content']")).click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame("content");
        String s=driver.findElement(By.xpath("//h2")).getText();
        if("Acid-free paper for the digital age".equals(s))
        System.out.println("the string is correct what we want and the string is");
        System.out.println(s);
        driver.close();
    }
}
