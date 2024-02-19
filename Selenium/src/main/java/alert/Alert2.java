package alert;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class Alert2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        WebElement alert = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        alert.click();
        Alert a =  driver.switchTo().alert();
        Thread.sleep(2000);
        a.sendKeys("Hello Greg");
        a.accept();
        WebElement element = driver.findElement(By.id("result"));
        String text = element.getText();
        System.out.println(text);



    }
}
