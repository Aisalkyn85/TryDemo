package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DragAndDrop4 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.automationtesting.in/Static.html");
        driver.manage().window().maximize();
        WebElement draggable = driver.findElement(By.id("node"));
        WebElement draggable2 = driver.findElement(By.id("mongo"));
        WebElement draggable3 = driver.findElement(By.id("angular"));
        WebElement droppable = driver.findElement(By.id("droparea"));
        Actions action = new Actions(driver);
       // action.clickAndHold(draggable).moveToElement(droppable).release(draggable).build().perform();
        action.dragAndDrop(draggable,droppable).build().perform();
        action.dragAndDrop(draggable2,droppable).build().perform();
        action.dragAndDrop(draggable3,droppable).build().perform();


    }
}
