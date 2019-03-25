import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Register extends BaseClass {
    @Test(priority = 0)
    public void demo() throws IOException {

        Driver();
        driver.get("http://newtours.demoaut.com/index.php");
        driver.findElement(By.xpath("//a[text()='REGISTER']")).click();

     properties = new Properties();
         file = new File("/home/anita/IdeaProjects/_5_LiveProject/prop.properties");
        FileInputStream fileInputStream = new FileInputStream(file);
        properties.load(fileInputStream);
        //File file=new File("/home/anita/IdeaProjects/selinium/selinium/src/script/prop.properties");
        //        FileInputStream fileInputStream=new FileInputStream(file);
        //        prop.load(fileInputStream);
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(properties.getProperty("FirstName"));
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(properties.getProperty("Lastname"));
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(properties.getProperty("Phone"));
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(properties.getProperty("Phone"));
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys(properties.getProperty("Email"));
        driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(properties.getProperty("address"));
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys(properties.getProperty("city"));
        driver.findElement(By.xpath("//input[@name='state']")).sendKeys(properties.getProperty("state"));
        driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(properties.getProperty("postal"));
        WebElement dropelement = driver.findElement(By.name("country"));
        Select select = new Select(dropelement);

        select.selectByVisibleText(properties.getProperty("Country"));
        // select.selectByValue(properties.getProperty("Country"));
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(properties.getProperty("UserName"));
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(properties.getProperty("Password"));
        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(properties.getProperty("CPassword"));
        driver.findElement(By.xpath("//input[@name='register']")).click();
        String actualname = "Dear" + " " + properties.getProperty("FirstName") + " " + properties.getProperty("Lastname") + ",";
        String expectedname = driver.findElement(By.xpath("//b")).getText();
        Assert.assertEquals(actualname, expectedname);
        // driver.close();
    }
}