package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
        WebElement draggable  = driver.findElement(By.xpath("//div[@id='draggable']"));
        Actions action = new Actions(driver);
        action.dragAndDropBy(draggable,150,50).build().perform();
        Thread.sleep(2000);
    }
}
