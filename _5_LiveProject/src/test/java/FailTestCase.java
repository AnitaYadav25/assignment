import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FailTestCase {
    @AfterClass
    public void FlightBooking() throws IOException {
        System.setProperty("webdriver.chrome.driver", "/home/anita/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Properties properties=new Properties();
        File file=new File("/home/anita/IdeaProjects/_5_LiveProject/prop1.properties");
        FileInputStream fileInputStream=new FileInputStream(file);
        properties.load(fileInputStream);
        driver.get("http://newtours.demoaut.com/index.php");
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(properties.getProperty("UserName"));
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(properties.getProperty("Password"));
        driver.findElement(By.xpath("//input[@name='login']")).click();

//       Set<String> sessions=driver.getWindowHandles();
//       Iterator<String> iterator=sessions.iterator();
//       String parent=iterator.next();
//       System.out.println(parent);
//       String child1=iterator.next();
//       System.out.println(child1);
//       driver.switchTo().window(child1);
//       System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
        driver.findElement(By.xpath("//input[@name='login']")).click();

//       driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(properties.getProperty("UserName"));
//       driver.findElement(By.xpath("//input[@name='password']")).sendKeys(properties.getProperty("Password"));
//       driver.findElement(By.xpath("//input[@name='login']")).click();
        // System.out.println(driver.getCurrentUrl());

        if(driver.findElement(By.xpath("//*[@value='roundtrip']")).getAttribute("value").equals(properties.getProperty("trip")))
            driver.findElement(By.xpath("//*[@value='roundtrip']"));
        else if(driver.findElement(By.xpath("//*[@value='oneway']")).getAttribute("value").equals(properties.getProperty("trip")))
            driver.findElement(By.xpath("[//*[@value='oneway']"));

        WebElement dropelement=driver.findElement(By.name("passCount"));
        Select select=new Select(dropelement);

        select.selectByVisibleText(properties.getProperty("value"));
        WebElement dropelement1=driver.findElement(By.name("fromPort"));
        Select select1=new Select(dropelement1);

        select1.selectByVisibleText(properties.getProperty("city1"));

        WebElement dropelement2=driver.findElement(By.name("fromMonth"));

        Select select2=new Select(dropelement2);

        select2.selectByVisibleText(properties.getProperty("month"));
        WebElement dropelement3=driver.findElement(By.name("fromDay"));
        Select select3=new Select(dropelement3);

        select3.selectByVisibleText(properties.getProperty("day1"));

        WebElement dropelement4=driver.findElement(By.name("toMonth"));
        Select select4=new Select(dropelement4);

        select4.selectByVisibleText(properties.getProperty("tomonth"));
        WebElement dropelement5=driver.findElement(By.name("toDay"));
        Select select5=new Select(dropelement5);

        select5.selectByVisibleText(properties.getProperty("to_day"));




        if(driver.findElement(By.xpath("//*[@value='First']")).getAttribute("value").equals(properties.getProperty("service")))
            driver.findElement(By.xpath("//*[@value='First']")).click();
        else if(driver.findElement(By.xpath("//*[@value='Business']")).getAttribute("value").equals(properties.getProperty("service")))
            driver.findElement(By.id("checkbox2")).click();
        else if(driver.findElement(By.xpath("//*[@value='Coach']")).getAttribute("value").equals(properties.getProperty("service")))
            driver.findElement(By.xpath("//*[@value='Business']")).click();
        WebElement dropelement6=driver.findElement(By.xpath("//select[@name='airline']"));
        Select select6=new Select(dropelement6);

        select6.selectByVisibleText(properties.getProperty("Pref"));
        driver.findElement(By.xpath("//input[@name='findFlights']")).click();
        driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
        driver.findElement(By.xpath("//input[@name='passFirst0']")).sendKeys(" ");
        driver.findElement(By.xpath("//input[@name='passLast0']")).sendKeys(" ");
        WebElement dropelement7=driver.findElement(By.xpath("//select[@size='1']"));
        Select select7=new Select(dropelement7);
        select7.selectByVisibleText(properties.getProperty("Meal"));
        WebElement dropelement8=driver.findElement(By.xpath("//select[@name='creditCard']"));
        Select select8=new Select(dropelement8);
        select8.selectByVisibleText(properties.getProperty("card"));
        WebElement dropelement9=driver.findElement(By.xpath("//select[@name='cc_exp_dt_mn']"));
        Select select9=new Select(dropelement9);
        driver.findElement(By.xpath("//*[@name='creditnumber']")).sendKeys(properties.getProperty("cardno"));


        select9.selectByVisibleText(properties.getProperty("cardmonth"));
        select8.selectByVisibleText(properties.getProperty("card"));
//
        WebElement dropelement10=driver.findElement(By.xpath("//select[@name='cc_exp_dt_yr']"));
        Select select10=new Select(dropelement10);
        select10.selectByVisibleText(properties.getProperty("cardyear"));

        driver.findElement(By.xpath("//input[@name='cc_frst_name']")).sendKeys(properties.getProperty("FirstName"));
        driver.findElement(By.xpath("//input[@name='cc_last_name']")).sendKeys(properties.getProperty("Lastname"));
//       driver.findElement(By.xpath("//input[@name='billAddress1']")).sendKeys(properties.getProperty("bill"));
//       driver.findElement(By.xpath("//input[@name='billCity']")).sendKeys(properties.getProperty("billcity"));
//       driver.findElement(By.xpath("//input[@name='delState']")).sendKeys(properties.getProperty("delcity"));
//       driver.findElement(By.xpath("//input[@name='delZip']")).sendKeys(properties.getProperty("zip"));
        //name="delCountry"
//       WebElement dropelement11=driver.findElement(By.xpath("//select[@name='delCountry']"));
//       Select select11=new Select(dropelement11);
//       select11.selectByVisibleText(properties.getProperty("country"));
        //buyFlights
        driver.findElement(By.xpath("//*[@name='buyFlights']")).click();


        String actual = "http://newtours.demoaut.com/mercurypurchase2.php";
        String expected = driver.getCurrentUrl();
        Assert.assertEquals(actual,expected);
//       driver.findElement(By.xpath("//input[@name='creditnumber']")).sendKeys(properties.getProperty("cardno"));
//       driver.findElement(By.xpath("//input[@name='cc_mid_name']")).sendKeys(properties.getProperty("card"));
//       driver.findElement(By.xpath("////select[@size='1']")).sendKeys(properties.getProperty("Meal"));
//       driver.findElement(By.xpath("////select[@size='1']")).sendKeys(properties.getProperty("Meal"));
//       driver.findElement(By.xpath("////select[@size='1']")).sendKeys(properties.getProperty("Meal"));


    }
}
