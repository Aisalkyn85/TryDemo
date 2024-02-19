package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//div[@class='nav-line-1-container']"));
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();

    }
}
