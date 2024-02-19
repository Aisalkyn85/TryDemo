package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
        WebElement draggable  = driver.findElement(By.xpath("//div[@id='draggable']"));
        Actions action = new Actions(driver);
        action.clickAndHold(draggable).moveToElement(droppable).release(draggable).build().perform();
        Thread.sleep(2000);
        driver.quit();
    }
}
