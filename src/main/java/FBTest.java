import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBTest{
    public static void main(String[] args) {


        WebDriver driver;WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://google.com");
        WebElement search = driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]//input"));
        search.sendKeys("Facebook");
        search.sendKeys(Keys.ENTER);
//        WebElement.sendKeys(Keys.ENTER);


    }
}