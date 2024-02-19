package javascriptActions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AddTextWithJavaScript {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();










        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement address = driver.findElement(By.id("textarea"));
        JavascriptExecutor excutor=(JavascriptExecutor)driver;
        excutor.executeScript("arguments[0].value='5645 S California ave';", address);
        WebElement phone = driver.findElement(By.id("phone"));
        JavascriptExecutor executor=(JavascriptExecutor)driver;
        excutor.executeScript("arguments[0].value='87966454453';", phone);
        WebElement email = driver.findElement(By.id("email"));
        JavascriptExecutor executor1=(JavascriptExecutor)driver;
        excutor.executeScript("arguments[0].value='aisalkynaidarova8@gmail.com';", email);






    }
}
