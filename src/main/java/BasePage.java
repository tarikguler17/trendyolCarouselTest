import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePage {
    WebDriver driver;
    BasePage(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\atari\\Desktop\\Projects\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }
}
