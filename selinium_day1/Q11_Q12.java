package selinium_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Q11_Q12 {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "/home/anita/Desktop/chromedriver");
        WebDriver dr = new ChromeDriver();
        dr.get("file:///home/anita/Downloads/Registration.html");
        List<WebElement> wb = dr.findElements(By.name("Demo"));
        wb.get(0).sendKeys("Anita");
        wb.get(1).sendKeys("yadav");
        dr.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Rkgit Ghaziabad");
        wb.get(2).sendKeys("anita.yadav@tothenew.com");
        dr.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9876543210");
        dr.findElements(By.name("radiooptions")).get(0).click();
        dr.findElement(By.id("checkbox1")).click();
        dr.findElement(By.id("checkbox3")).click();
        dr.findElement(By.id("firstpassword")).sendKeys("password123");
        dr.findElement(By.id("secondpassword")).sendKeys("password123");

        System.out.println(dr.findElement(By.id("Button1")).isEnabled());
        System.out.println(dr.findElements(By.name("radiooptions")).get(0).isSelected());
        System.out.println(dr.findElement(By.xpath("//h1[contains(text(),'Automation Demo Site')]")).isDisplayed());
        System.out.println(dr.getTitle());
        dr.close();
    }
}