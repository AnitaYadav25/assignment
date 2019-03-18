package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "/home/anita/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.londonfreelance.org/courses/frames/index.html");
driver.switchTo().frame("main");
        driver.findElement(By.xpath("//*[@background='top.gif']//h2"));
        System.out.println(driver.findElement(By.xpath("//*[@background='top.gif']//h2")).getText());
        driver.switchTo().defaultContent();//this will move the frame out of the parent frame
        driver.switchTo().frame("bot");
        driver.findElement(By.xpath("//*[@background='bot.gif']//h2"));
        System.out.println( driver.findElement(By.xpath("//*[@background='bot.gif']//h2")).getText());
    }
}
