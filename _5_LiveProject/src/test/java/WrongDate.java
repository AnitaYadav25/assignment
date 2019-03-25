import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class WrongDate extends BaseClass {
    @Test(priority = 3)
    public void WrongDate() throws IOException {
Driver();
        Properties properties = new Properties();
        File file = new File("/home/anita/IdeaProjects/_5_LiveProject/prop.properties");
        FileInputStream fileInputStream = new FileInputStream(file);
        properties.load(fileInputStream);
        Login();
        //Trip Type
        if (driver.findElement(By.xpath("//*[@value='roundtrip']")).getAttribute("value").equals(properties.getProperty("trip")))
            driver.findElement(By.xpath("//*[@value='roundtrip']"));
        else if (driver.findElement(By.xpath("//*[@value='oneway']")).getAttribute("value").equals(properties.getProperty("trip")))
            driver.findElement(By.xpath("[//*[@value='oneway']"));


//Passengers
        WebElement passengers = driver.findElement(By.name("passCount"));
        Select selectpassenger = new Select(passengers);
        selectpassenger.selectByVisibleText("1");

//Departing

        WebElement depart = driver.findElement(By.name("fromPort"));
        Select departdrop = new Select(depart);

        departdrop.selectByVisibleText("Acapulco");

//departing(date)
        WebElement month = driver.findElement(By.name("fromMonth"));
        WebElement day = driver.findElement(By.name("fromDay"));
        new Select(month).selectByVisibleText("May");
        new Select(day).selectByVisibleText("4");


// ARRIVING IN
        WebElement arrive = driver.findElement(By.name("toPort"));
        new Select(arrive).selectByVisibleText("London");

//Returning date
        WebElement month1 = driver.findElement(By.name("toMonth"));
        WebElement day1 = driver.findElement(By.name("toDay"));
        new Select(month1).selectByVisibleText("May");
        new Select(day1).selectByVisibleText("2");

//Service class

        if (driver.findElement(By.xpath("//*[@value='First']")).getAttribute("value").equals(properties.getProperty("service")))
            driver.findElement(By.xpath("//*[@value='First']")).click();
        else if (driver.findElement(By.xpath("//*[@value='Business']")).getAttribute("value").equals(properties.getProperty("service")))
            driver.findElement(By.xpath("//*[@value='Business']")).click();
        else if (driver.findElement(By.xpath("//*[@value='Coach']")).getAttribute("value").equals(properties.getProperty("service")))
            driver.findElement(By.xpath("//*[@value='Business']")).click();

//Airline
        WebElement prefrence = driver.findElement(By.name("airline"));
        new Select(prefrence).selectByVisibleText("Unified Airlines");


//continue button
        driver.findElement(By.name("findFlights")).submit();

//Depart to
        driver.findElements(By.name("outFlight")).get(2).click();
//Arrive to
        driver.findElements(By.name("outFlight")).get(2).click();

//continue button clicked
        driver.findElement(By.name("reserveFlights")).submit();


// Book a flight


            driver.findElement(By.name("buyFlights")).click();

        String expected_result = driver.getCurrentUrl();

        String actual_result = "http://newtours.demoaut.com/mercurypurchase.php";


        Assert.assertEquals(actual_result, expected_result);

    }
}
