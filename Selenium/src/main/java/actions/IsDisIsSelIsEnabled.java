package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class IsDisIsSelIsEnabled {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_click");
        driver.manage().window().maximize();
        driver.switchTo().frame("iframeResult");
      /*  WebElement element = driver.findElement(By.xpath("//p[contains(text(),'If you click on me')]"));
        WebElement element1 = driver.findElement(By.xpath("//p[text()='Click me too!']"));
        WebElement element2 = driver.findElement(By.xpath("//p[text()='Click me away!']"));*/

       /* if (element.isDisplayed()) {
            element.click();

        } else {
            System.out.println("Element is not present");
        }
        if (element1.isDisplayed()) {
            element1.click();

        } else {
            System.out.println("Element1  is not present");
        }
        if (element2.isDisplayed()) {
            element2.click();
        }*/
        List<WebElement> body = driver.findElements(By.xpath("//body/p"));
        for(WebElement bodies:body){
            if(bodies.isDisplayed()){
                bodies.click();
            }

        }
    }
}
