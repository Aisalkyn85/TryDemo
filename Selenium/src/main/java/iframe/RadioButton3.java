package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class RadioButton3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().window().maximize();
       List<WebElement> list =  driver.findElements(By.xpath("//input[@type='checkbox']"));

       for(int i=0; i<2;i++){
           Thread.sleep(2000);
           if(list.get(i).isSelected()){
               System.out.println("this button is already selected");
           }else{
           list.get(i).click();
           }
       }

    }
}
