package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Iterator;
import java.util.Set;

public class Popup1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println(title);
        WebElement element =  driver.findElement(By.xpath("//a[text()='Click Here']"));
        element.click();

        Set<String> tabs = driver.getWindowHandles();
        Iterator<String> iterator = tabs.iterator();
        String firstTab = iterator.next();
        String secondTab = iterator.next();
        driver.switchTo().window(secondTab);
        WebElement text =  driver.findElement(By.xpath("//h3[text()='New Window']"));
        String newText = text.getText();
        if(newText.equalsIgnoreCase("New Window")){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }
    }
}
