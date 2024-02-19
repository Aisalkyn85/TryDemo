package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class IFrame7 {
    public static void main(String[] args) {


        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
        WebElement element = driver.findElement(By.xpath("//div[@id='Multiple']//iframe"));
        driver.switchTo().frame(element);
        WebElement element2 = driver.findElement(By.xpath("//div[@class='iframe-container']//iframe"));
        driver.switchTo().frame(element2);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Apple");
    }
}