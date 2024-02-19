package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class frame3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://chercher.tech/practice/frames");
        driver.manage().window().maximize();
        WebElement element=driver.findElement(By.id("frame2"));
        driver.switchTo().frame(element);
        List<WebElement> elementOfFrame=driver.findElements(By.xpath("//select[@id='animals']/option"));
        //Select select = new Select(elementOfFrame);
       // select.selectByVisibleText("Baby Cat");
        for(WebElement Option : elementOfFrame){
            Thread.sleep(2000);
            if(Option.getText().equalsIgnoreCase("Avatar")){
                Option.click();

            }

        }

    }
}
