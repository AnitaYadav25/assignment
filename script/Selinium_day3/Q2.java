package script.Selinium_day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class Q2 {


    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "/home/anita/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///home/anita/Downloads/Registration.html");
        Properties prop=new Properties();
        File file=new File("/home/anita/IdeaProjects/selinium/selinium/src/script/prop.properties");
        FileInputStream fileInputStream=new FileInputStream(file);
        prop.load(fileInputStream);
        driver.findElement(By.xpath("//*[@ng-model='FirstName']")).sendKeys(prop.getProperty("FirstName"));
        driver.findElement(By.xpath("//*[@ng-model='LastName']")).sendKeys(prop.getProperty("LastName"));
        driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys(prop.getProperty("Adress"));
        List<WebElement> elements= driver.findElements(By.xpath("//*[@ng-model='radiovalue']"));
        for (int i=0;i<elements.size();i++) {
            if(elements.get(i).getAttribute("value").equals(prop.getProperty("Gender")))
                driver.findElements(By.xpath("//*[@ng-model='radiovalue']")).get(i).click();
        }
        if(driver.findElement(By.id("checkbox1")).getAttribute("value").equals(prop.getProperty("Hobby")))
            driver.findElement(By.id("checkbox1")).click();
        else if(driver.findElement(By.id("checkbox2")).getAttribute("value").equals(prop.getProperty("Hobby")))
            driver.findElement(By.id("checkbox2")).click();
        else if(driver.findElement(By.id("checkbox3")).getAttribute("value").equals(prop.getProperty("Hobby")))
            driver.findElement(By.id("checkbox3")).click();

        driver.findElement(By.xpath("//*[@ng-model='EmailAdress']")).sendKeys(prop.getProperty("EmailAdress"));
        driver.findElement(By.xpath("//*[@ng-model='Password']")).sendKeys(prop.getProperty("Password"));
        driver.findElement(By.xpath("//*[@ng-model='CPassword']")).sendKeys(prop.getProperty("CPassword"));
        driver.findElement(By.xpath("//*[@ng-model='Phone']")).sendKeys(prop.getProperty("Phone"));
       // driver.close();

    }
}
