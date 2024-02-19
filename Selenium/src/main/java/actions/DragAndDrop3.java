package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
        driver.manage().window().maximize();
       WebElement element =  driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
       driver.switchTo().frame(element);
        WebElement droppable = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
       WebElement droppable2 =  driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
        WebElement droppable3 =  driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
        WebElement draggable = driver.findElement(By.id("trash"));



        Actions actions = new Actions(driver);
        actions.dragAndDrop(droppable,draggable).build().perform();
        actions.dragAndDrop(droppable2,draggable).build().perform();
        actions.dragAndDrop(droppable3,draggable).build().perform();



    }
}
