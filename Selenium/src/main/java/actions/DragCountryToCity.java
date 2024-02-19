package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragCountryToCity {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();

        WebElement OsloDraggable =  driver.findElement(By.id("box1"));
        WebElement stokholmDraggable = driver.findElement(By.id("box2"));
        WebElement WashingtonDraggable =  driver.findElement(By.id("box3"));
        WebElement CopenhagenDraggable =  driver.findElement(By.id("box4"));
        WebElement SeoulDraggable =  driver.findElement(By.id("box5"));
        WebElement RomeDraggable =  driver.findElement(By.id("box6"));
        WebElement MadridDraggable =  driver.findElement(By.id("box7"));

        WebElement ItalyDroppable = driver.findElement(By.id("box106"));
        WebElement NorwayDroppable = driver.findElement(By.id("box101"));
        WebElement SKoreaDroppable = driver.findElement(By.id("box105"));
        WebElement USADroppable = driver.findElement(By.id("box103"));
        WebElement SwedenDroppable = driver.findElement(By.id("box102"));
        WebElement DenmarkDroppable = driver.findElement(By.id("box104"));
        WebElement SpainDroppable = driver.findElement(By.id("box107"));




        Actions actions = new Actions(driver);
        actions.dragAndDrop(stokholmDraggable,NorwayDroppable ).build().perform();
        actions.dragAndDrop(SeoulDraggable,SKoreaDroppable).build().perform();
        actions.dragAndDrop(RomeDraggable,ItalyDroppable).build().perform();
        actions.dragAndDrop(WashingtonDraggable,USADroppable  ).build().perform();
        actions.dragAndDrop(CopenhagenDraggable,SwedenDroppable).build().perform();
        actions.dragAndDrop(MadridDraggable,SpainDroppable).build().perform();
        actions.dragAndDrop(OsloDraggable,DenmarkDroppable).build().perform();

    }
}
