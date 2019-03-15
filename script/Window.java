package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Window {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver", "/home/anita/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/windows");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();
        driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
        Set<String> sessions=driver.getWindowHandles();

        Iterator<String> iterator=sessions.iterator();
        String parent=iterator.next();
        System.out.println(parent);
        String child1=iterator.next();
        System.out.println(child1);
        driver.switchTo().window(child1);
        String child2=iterator.next();
       
       driver.switchTo().window(child2);
        System.out.println(child2);
        System.out.println("the current url is "+driver.getCurrentUrl());
        driver.close();
    }
}
