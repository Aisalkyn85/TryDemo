package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Iframe9 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_radio");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
        driver.switchTo().frame(element);
        driver.findElement(By.xpath("//input[@id='html']")).click();
        driver.findElement(By.xpath("//input[@id='css']")).click();
        driver.findElement(By.id("javascript")).click();
    }
}
