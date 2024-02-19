package keyboardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class KeyboardAction2 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://text-compare.com/");

        driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("WELCOME TO AUTOMATION");

        Actions act=new Actions(driver);


        //ctrl +a

        act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();


        //ctrl +c
        act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();


        //tab
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
        //act.sendKeys(Keys.TAB).perform(); // only if want to press single key then prefer this

        //ctrl+v
        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();

    }
}
