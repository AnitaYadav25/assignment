package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Table {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "/home/anita/Desktop/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/web-table-element.php");
        List<WebElement>lst =driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
        System.out.println(lst.size());
        List<WebElement>lst1=driver.findElements(By.xpath("//table[@class='dataTable']//th"));
        System.out.println("no of column is"+lst1.size());
       // List<WebElement>lst2=driver.findElements(By.xpath("//table[@class='dataTable']//tr"));
       for(int i=1;i<=lst.size();i++){
           List<WebElement>td=driver.findElements(By.xpath("//table[@class='dataTable']//tr["+i+"]//td"));
           for(int j=1;j<=td.size();j++){
               String tabledata=driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+j+"]")).getText();
               System.out.println(tabledata);

           }
           System.out.println(" ");

       }
//driver.close();
    }
}