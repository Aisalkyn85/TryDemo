package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Frame2 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://chercher.tech/practice/frames");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(element);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hi frame");
    }
}
