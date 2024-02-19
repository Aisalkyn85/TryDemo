package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        WebElement alert = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
        alert.click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();

    }
}
