package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class MouseHover1 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");
        driver.manage().window().maximize();
        List<WebElement> element = driver.findElements(By.xpath("//div[@class='figure']"));
        Actions action = new Actions(driver);

        for(WebElement text:element){

        action.moveToElement(text).perform();
        text.click();
        }

    }

}
