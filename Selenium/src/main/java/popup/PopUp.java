package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Iterator;
import java.util.Set;

public class PopUp {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println(title);
       WebElement element =  driver.findElement(By.xpath("//a[@target='_blank']"));
       element.click();
       Set<String> tabs = driver.getWindowHandles();
        Iterator<String> iterator = tabs.iterator();
        String firstTab = iterator.next();
        String secondTab = iterator.next();
        driver.switchTo().window(secondTab);
        WebElement text = driver.findElement(By.xpath("//h1[text()='Make sure your code lands']"));
        String newText = text.getText();
        if(newText.equalsIgnoreCase("Make sure your code lands")){
            System.out.println("test passed");
        }else{
            System.out.println("test failed");
        }
        driver.close();
        driver.switchTo().window(firstTab);





    }
}
