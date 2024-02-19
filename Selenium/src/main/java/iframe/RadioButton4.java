package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class RadioButton4 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://artoftesting.com/samplesiteforselenium");
        driver.manage().window().maximize();
        List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println(checkbox.size());

        List<WebElement>radiobutton = driver.findElements(By.xpath("//form/input[@type='radio']"));
        System.out.println(radiobutton.size());
       WebElement male =  driver.findElement(By.id("male"));
       WebElement female =  driver.findElement(By.id("female"));
       if(male.isSelected()){
           female.click();
       }else{
           male.click();
       }
       /* for(int i=0; i<checkbox.size();i++){
            if(radiobutton.get(i).isSelected()){
                System.out.println("If radiobutton is selected, do not select it");
            }else{
                System.out.println("radiobutton is not selected");
                break;
            }
            radiobutton.get(i).click();
            checkbox.get(i).click();
        }*/


        }


    }

