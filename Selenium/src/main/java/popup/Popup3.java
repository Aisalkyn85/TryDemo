package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Iterator;
import java.util.Set;

public class Popup3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://nxtgenaiacademy.com/multiplewindows/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println(title);
        WebElement element = driver.findElement(By.xpath("//button[text()='New Message Window']"));
        element.click();
        Thread.sleep(2000);
        Set<String> tabs = driver.getWindowHandles();
        Iterator<String> iterator = tabs.iterator();
        String firstTab = iterator.next();
        String secondTab = iterator.next();
        driver.switchTo().window(secondTab);
        WebElement text = driver.findElement(By.xpath("//*[contains(text(),'Welcome')]"));
        String newText = text.getText();
        System.out.println(newText);
        if (newText.equalsIgnoreCase("Welcome to Vinoth Rathinam Tutorials. " +
                "Happy LearningWelcome to Vinoth Rathinam Tutorials. Happy LearningWelcome to " +
                "Vinoth Rathinam Tutorials. Happy Learning")) {
            System.out.println("test passed");
        } else {
            System.out.println("test failed");
        }
    }
}