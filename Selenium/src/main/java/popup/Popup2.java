package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Iterator;
import java.util.Set;

public class Popup2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://nxtgenaiacademy.com/multiplewindows/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println(title);
        WebElement element =  driver.findElement(By.id("button1"));
        element.click();

        Set<String> tabs = driver.getWindowHandles();
        Iterator<String> iterator = tabs.iterator();
        String firstTab = iterator.next();
        String secondTab = iterator.next();
        driver.switchTo().window(secondTab);
        WebElement text =  driver.findElement(By.xpath("(//h2[@class='elementor-heading-title elementor-size-default'])[2]"));
        String newText = text.getText();
        if(newText.equalsIgnoreCase("Vinoth Rathinam")){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }
    }
}



