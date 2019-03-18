package Selinium_day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q4 {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver", "/home/anita/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Frames.html");
        driver.switchTo().frame("SingleFrame");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Anita");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("anita");
        driver.close();
    }
}
