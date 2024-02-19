package javascriptActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class TabKeyboard {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.id("name"));
        element.sendKeys("Apple");
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.TAB).build().perform();
        Thread.sleep(2000);
        actions.keyUp(Keys.SHIFT).build().perform();
        WebElement alert = driver.findElement(By.xpath("//button[text() = 'Alert']"));
        actions.click(alert).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(2000);


    }
}
