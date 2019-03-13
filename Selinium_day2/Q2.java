package Selinium_day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Q2 {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "/home/anita/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
        WebElement webElement = driver.findElement(By.xpath("//select[@size='10']"));
        Select select = new Select(webElement);
        select.selectByIndex(2);
        //select.selectByValue("New York");
        if (select.isMultiple()) {
            System.out.println("it has multiple dropdown");
        }
        System.out.println(webElement.getText());
        select.selectByValue("New Jersey");
        select.selectByValue("New York");
        select.selectByValue("Texas");
        List<WebElement> lst=select.getAllSelectedOptions();
        System.out.println("all the selected options are");
        for (WebElement s:lst){
            System.out.println(s.getText());
        }
        WebElement s=select.getFirstSelectedOption();
        System.out.println("the first selected option is "+s.getText());
         select.deselectAll(); 

    }
}
