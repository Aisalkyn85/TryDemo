package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButton1 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_pushbutton_disabled2");
        driver.manage().window().maximize();
        driver.switchTo().frame("iframeResult");
       WebElement e1 =  driver.findElement(By.xpath("//button[text()='Try it']"));
       WebElement e2 = driver.findElement(By.xpath("//button[text()='My Button']"));
       e1.click();
       if(e2.isEnabled()){
           e1.click();
       }else{
           System.out.println("Radio button is not enabled");
       }

    }
}
