package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Windowshandle {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();


        //capture id's for browser window
        Set<String> windowIDs = driver.getWindowHandles();

        List<String> windossList = new ArrayList<>(windowIDs);

        String parentWindowID = windossList.get(0);
        String childWindowID = windossList.get(1);

        //Swithc to child window
        driver.switchTo().window(childWindowID);


    }
}
