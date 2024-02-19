package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Iterator;
import java.util.Set;

public class PopUp4 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://nxtgenaiacademy.com/multiplewindows/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println(title);
        WebElement element = driver.findElement(By.xpath("//button[text()='New Browser Tab']"));
        element.click();
        Thread.sleep(2000);
        Set<String> tabs = driver.getWindowHandles();
        Iterator<String> iterator = tabs.iterator();
        String firstTab = iterator.next();
        String secondTab = iterator.next();
        driver.switchTo().window(secondTab);
        WebElement text = driver.findElement(By.xpath("//*[contains(text(),'Welcome T')]"));
        String newText = text.getText();
        System.out.println(newText);
    }
}
