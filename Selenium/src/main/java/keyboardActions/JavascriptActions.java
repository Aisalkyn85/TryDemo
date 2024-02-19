package keyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JavascriptActions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement gender = driver.findElement(By.id("male"));
        JavascriptExecutor excutor=(JavascriptExecutor)driver;

        excutor.executeScript("arguments[0].click();", gender );
        System.out.println(gender.getText());
    }
}
