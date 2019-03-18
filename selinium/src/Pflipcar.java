import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Pflipcar {
    public static void main(String args[]) {
        System.setProperty("webdriver.chrome.driver", "/home/anita/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        List<WebElement> webElements = driver.findElements(By.xpath("//*[@class='_232NW7 dImZt_']"));
        System.out.println(webElements.size());
        for(int i=0;i<webElements.size();i++) {
            String image = driver.findElement(By.xpath("//*[@class='_232NW7 dImZt_']")).getText();
            System.out.println(image);
        }

        //<img class="_232NW7 dImZt_" alt="14-03-2019-slot-5" src="https://rukminim1.flixcart.com/flap/3376/560/image/f8f00d1181f809c2.jpg?q=50" data-tkid="M_5a961311-e1bf-42c9-bd16-d16be541846a_1.U4L9XWBNHDGX">

        //<div class="_3ZUwcz"><a class="_3MPlks" target="" href="/mobiles/~redmi-note-7-series/pr?sid=tyy%2C4io&amp;sort=price_asc&amp;param=30&amp;otracker=hp_bannerads_3_deskt-homep-3bcff_14-03-2019-slot-5_U4L9XWBNHDGX"><div class="_2tnqd0 _1_l8MX" style="width: 100%; height: 280px;"><img class="_232NW7 dImZt_" alt="14-03-2019-slot-5" src="https://rukminim1.flixcart.com/flap/3376/560/image/f8f00d1181f809c2.jpg?q=50" data-tkid="M_5a961311-e1bf-42c9-bd16-d16be541846a_1.U4L9XWBNHDGX"><img class="_2VeolH _3I5S6S" src="https://rukminim1.flixcart.com/flap/50/50/image/f8f00d1181f809c2.jpg?q=50" alt="14-03-2019-slot-5"></div></a></div>
    }
}
