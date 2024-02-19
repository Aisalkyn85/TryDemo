package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class Frame5 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();












        driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
        driver.manage().window().maximize();
       WebElement element =  driver.findElement(By.xpath("//iframe[@name='globalSqa']"));
       driver.switchTo().frame(element);
       driver.findElement(By.id("current_filter")).click();
       List<WebElement> element3 = driver.findElements(By.xpath("//span[@id='current_filter']//following-sibling::ul//li"));

       for(WebElement option:element3){
           if(option.getText().equalsIgnoreCase("Automation")){
               option.click();
               break;
           }
       }


    }
}
