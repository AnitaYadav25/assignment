package selinium_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {
    public static void main(String args[]){

        System.setProperty("webdriver.chrome.driver","/home/anita/Desktop/chromedriver");
        WebDriver dr = new ChromeDriver();
                dr.get("https://www.google.com/");
                dr.findElement(By.name("q")).sendKeys("To The New");
                dr.findElement(By.name("btnK")).submit();

               dr.close();
            }
        }

