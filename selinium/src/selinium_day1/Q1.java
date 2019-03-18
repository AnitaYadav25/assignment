package script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q1 {
    public static void main(String args[]) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","/home/anita/Desktop/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("file:///home/anita/Downloads/DemoPage.html");
        driver.close();
    }
}