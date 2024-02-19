package iframe;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Checkbox1 {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_checkbox");
        driver.manage().window().maximize();
        driver.switchTo().frame("iframeResult");
        List<WebElement> element = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(WebElement items:element){
            items.click();
            if(items.isSelected()){
              items.click();
            }
        }
       WebElement car =  driver.findElement(By.id("vehicle2"));
        if(car.isSelected()){
            car.click();
        }
        ///Users/syezd/IdeaProjects/Selenium/src/main/java/screenshot
        System.out.println("hi");

        File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File Dest= new File("Users/syezd/IdeaProjects/Selenium/src/main/java/screenshot/test2.png");
        FileUtils.copyFile(f,Dest);
        driver.quit();




       // driver.findElement(By.xpath("//input[@value='Submit']")).click();
      //  driver.switchTo().defaultContent();
       // driver.findElement()
    }
}
