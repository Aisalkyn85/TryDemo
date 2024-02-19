package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Frame8 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.automationtesting.in/Frames.html");
        WebElement element = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
        driver.switchTo().frame(element);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Apple");
    }
}
