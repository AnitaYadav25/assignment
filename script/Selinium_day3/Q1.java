package script.Selinium_day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class Q1 {


    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "/home/anita/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ultimateqa.com/simple-html-elements-for-automation/");
        int rows = driver.findElements(By.xpath("//h2[text()='HTML Table with no id']//following-sibling::table//tr")).size();
        System.out.println("Row Count: " + rows);
        int columns=driver.findElements(By.xpath("//h2[text()='HTML Table with no id']//following-sibling::table//th")).size();
        System.out.println("Column Count: " + columns);

        for (int i = 2; i <= rows; i++) {
            List<WebElement> td = driver.findElements(By.xpath("//h2[text()='HTML Table with no id']//following-sibling::table//tr[" + i + "]//td"));
//            System.out.println(td.get(0).getText());
            if (td.get(0).getText().equals("Quality Assurance Engineer"))
                System.out.println("Salary of Quality Assurance Engineer: "+ td.get(2).getText());
        }
        driver.close();


    }
}

