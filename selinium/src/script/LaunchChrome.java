package script;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LaunchChrome {
    public static void main(String args[]) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","/home/anita/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///home/anita/Downloads/DemoPage.html");
//            Thread.sleep(1000);
//        driver.manage().window().maximize();
//        driver.findElement(By.id("male"));
//        driver.findElement(By.name("rd"));
//        //driver.findElement(By.id("FName")).sendKeys("Anita");
//        driver.findElement(By.id("FName")).sendKeys("Anita");
//        System.out.println(driver.findElement(By.name("rd")));
//        System.out.println(driver.findElement(By.id("FName")).getAttribute("value"));
//
//        List <WebElement> lst= driver.findElements(By.xpath("//a['text()=Great Place to Learn- w3schools']"));
//        System.out.println("size of the list is"+lst.size());
//        for(WebElement str:lst){
//
//            System.out.println(str);
//        }
        driver.get("file:///home/anita/Downloads/DemoPage%20(1).html");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.MINUTES);
//        WebDriverWait wait=new WebDriverWait(driver,10);
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("combine"))));
//       WebElement webElement=driver.findElement(By.name("country"));
//        Select select=new Select(webElement);
//        System.out.println(select);
//        select.selectByIndex(2);
      //  System.out.println(webElement.getText());
        WebElement webElement= driver.findElement(By.xpath("//select[@size='4']"));
        System.out.println( driver.findElement(By.xpath("//select[@size='4']")));
        Select select=new Select(webElement);
        select.selectByIndex(2);
        select.selectByValue("Delhi");
        if(select.isMultiple()){
            System.out.println("it has multiple dropdown");

        }
        System.out.println(webElement.getText());
       // select.deselectAll();
        List<WebElement> lst=select.getAllSelectedOptions();

//      List<WebElement> lst=select.getOptions();
   System.out.println("selected elements are");
      for(WebElement s:lst){
          System.out.println(s.getText());
      }
      // driver.close();
    }
}
