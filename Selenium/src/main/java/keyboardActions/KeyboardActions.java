package keyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class KeyboardActions {
    public static void main(String[] args) throws InterruptedException {



        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement e1= driver.findElement(By.name("q"));
        Actions actions = new Actions(driver);
        actions.click(e1).build().perform();
        Thread.sleep(1000);
        actions.keyDown(Keys.SHIFT).build().perform();
        actions.sendKeys("book").build().perform();
        Thread.sleep(1000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        actions.keyUp(Keys.SHIFT).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        System.out.println("done");



    }
}
