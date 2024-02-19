package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class Checkbox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.onlyfullstack.com/demo-website-to-practice-selenium-for-beginners/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,1500)","");
        List<WebElement> element  = driver.findElements(By.xpath("//input[@type='checkbox']"));
       // js.executeScript("arguments[0].scrollIntoView(true);", element);
        for(WebElement items:element){
            items.click();
        }
    }
}
