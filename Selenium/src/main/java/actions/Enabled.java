package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import javax.lang.model.element.Element;

public class Enabled {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_pushbutton_disabled2");
        driver.manage().window().maximize();
        driver.switchTo().frame("iframeResult");
        WebElement enabled = driver.findElement(By.id("myBtn"));
       WebElement element =  driver.findElement(By.xpath("//button[text()='Try it']"));
       element.click();
       if(element.isEnabled()){
           element.click();
       }
       if(enabled.isEnabled()){
           System.out.println("first button present");
       }else {
           System.out.println("Button is disabled");
       }
    }
}
