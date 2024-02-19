package keyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHOverOVer {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.id("name"));
        element.sendKeys("Apple");
        Actions actions = new Actions(driver);

    }
}
