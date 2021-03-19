import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage {
    String url = "https://www.trendyol.com/butik/liste/erkek";

    void goToPage(){driver.get(url); }

    public void itemClick(int item){
        String path;
        path = "//div[@data-index=" + item+"]";
        WebElement elm = driver.findElement(By.xpath(path));
        Point a = elm.getLocation();
        Actions action = new Actions(driver);
        action.moveByOffset(a.getX(),a.getY()).click().perform();
    }
    public boolean isTitleContains(String header){
        String currentHeader = driver.getTitle();
        return currentHeader.contains(header);
    }
    void tearDown(){driver.quit();}
}
