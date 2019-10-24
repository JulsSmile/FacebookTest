import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class FBTest {

    public static void main(String[] args) {
        String BaseURL = "https://google.com";
        String searchWord = "Facebook";
        String email = "emailforfecebook.moc";
        String password = "bdgdgdgr";

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get(BaseURL);
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys(searchWord);
        search.sendKeys(Keys.ENTER);
        WebElement logIn = driver.findElement(By.xpath("//*[@id='rso']//a"));
        logIn.click();

        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://uk-ua.facebook.com/");

        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();

        String errorMessage = driver.findElement(By.xpath("//*[@id='error_box']/div[2]")).getText();
        Assert.assertEquals(errorMessage, "Ви робите спроби занадто часто. Будь ласка, спробуйте пізніше.");
        driver.quit();
    }
}