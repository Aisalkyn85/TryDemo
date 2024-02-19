package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class CheckBoxClass {


            /*Day-24
        -------
        Check boxes
        Dropdowns
        ----------
        1) Drop down having select tag in DOM.
        2) DropDown not having select tag in DOM ( input/div) - Bootstrap dropdown
        3) Auto Suggest drop down ( Dynamic)

        Select class


        Assignment
        -------
        1) Handle dropdown without using Select Class*/


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        List<WebElement> box = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
            for(int i=0;i<box.size();i++){
                 box.get(i).click();
             }

             for(WebElement checkb:box){
                 checkb.click();
             }
           for(int i=2;i<box.size();i++){
                box.get(i).click();
            }
           for(int i=0;i<2;i++){
                box.get(i).click();
            }
           for(int i=0;i<box.size();i++){
                if(i<1)
                box.get(i).click();
            }
            for(int i=0;i<box.size();i++){
                box.get(i).click();
            }
        Thread.sleep(4000);
        for (int i = 0; i < box.size(); i++) {
            box.get(i).click();
        }
        Thread.sleep(5000);
        for (int i = 0; i < box.size(); i++) {
            if (box.get(i).isSelected()) {
                box.get(i).click();
            }
        }

    }

}
