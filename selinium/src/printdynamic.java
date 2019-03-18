import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class printdynamic {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "/home/anita/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/search?client=ubuntu&hs=va1&ei=3OqJXJWxMsXhvgSSpJeQCQ&q=how+to+print+image+on+terminal+of+intelliji++&oq=how+to+print+image+on+terminal+of+intelliji++&gs_l=psy-ab.3..33i10i160.5544.6946..7400...0.0..1.268.1180.2-5......0....1..gws-wiz.......0i71j33i10.62HWfc3zlNk");
       // List<WebElement> webElements = driver.findElements(By.xpath("//*[@class='_232NW7 dImZt_']"));
        List<WebElement>lst=driver.findElements(By.id("center_col"));
        System.out.println(lst.size());
        System.out.println(driver.findElement(By.id("center_col")).getText());
    }
}
