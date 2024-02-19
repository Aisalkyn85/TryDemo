package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class RightClick {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/context_menu");
        driver.manage().window().maximize();
         WebElement element = driver.findElement(By.id("hot-spot"));
        Actions action = new Actions(driver);
        action.contextClick(element).build().perform();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();



    }
}
