package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class DropDown1 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();










        driver.get("https://the-internet.herokuapp.com/tinymce");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(element);
        driver.findElement(By.xpath("//body[@id='tinymce']")).clear();
        driver.findElement(By.xpath("//body[@id='tinymce']")).sendKeys("it is my first text");

    }



    }

