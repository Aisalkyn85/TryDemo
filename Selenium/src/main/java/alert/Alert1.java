package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class Alert1 {
    public static void main(String[] args) throws InterruptedException {

            WebDriver driver = new EdgeDriver();
            driver.get("https://testautomationpractice.blogspot.com/");
            driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            WebElement alert = driver.findElement(By.xpath("//button[text()='Alert']"));
            alert.click();
           Alert a =  driver.switchTo().alert();
           String text = a.getText();
        System.out.println(text);
        Thread.sleep(2000);
        a.accept();


    }
}
