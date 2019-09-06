import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;

public class FBTest{
    public static void main(String[] args) {


        WebDriver driver;WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://google.com");
        WebElement search = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]//input"));
        search.sendKeys("Facebook");
        search.sendKeys(Keys.ENTER);
        WebElement logIn = driver.findElement(By.xpath("//*[@id=\"rso\"]//a"));
        logIn.click();
//        Assertion
        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://uk-ua.facebook.com/" );

        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("emailforfecebook.moc");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("bdgdgdgr");
        driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();

        String errorMessage = driver.findElement(By.xpath("//*[@id='error_box']/div[2]")).getText();
        Assert.assertEquals(errorMessage, "Ви робите спроби занадто часто. Будь ласка, спробуйте пізніше.vdf");
    }
}