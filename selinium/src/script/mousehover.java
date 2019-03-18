package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class mousehover {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver", "/home/anita/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/?ie=UTF8&tag=googinabkkenshoo-21&ascsubtag=_k_EAIaIQobChMIlICUqJr84AIVzg0rCh2HhAZSEAAYASAAEgI2IfD_BwE_k_&gclid=EAIaIQobChMIlICUqJr84AIVzg0rCh2HhAZSEAAYASAAEgI2IfD_BwE");
       //WebElement webElement=driver.findElement(By.xpath("//span[text()='Prime']"));

        WebElement webElement=driver.findElement(By.id("multiasins-img-link"));
//        Actions action1=new Actions(driver);
//        action1.click(webElement).perform();






    }
}
