package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class launchfb {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver","/home/anita/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        WebElement webElement=driver.findElement(By.xpath("//select[@id='day']"));
        Select select=new Select(webElement);
        select.selectByValue("30");
       WebElement webElement1= driver.findElement(By.xpath("//label[text()='Female']"));
        driver.findElement(By.id("u_0_11")).click();
        //driver.close();
    }
}
