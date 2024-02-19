package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class Frame {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        /*frame
        switchTo()
        driver.switchTo().frame(name/id)
        driver.switchTo().frame(WebElement)
        driver.switchTo().frame(index)

        driver.switchTo().defaultContent()
        * */
        driver.get("https://ui.vision/demo/webtest/frames/");


        WebElement frm1 = driver.findElement(By.xpath("//frame[@src = 'frame_1.html']"));
        driver.switchTo().frame(frm1);
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("1111");

        driver.switchTo().defaultContent();

        WebElement frm3 = driver.findElement(By.xpath("//frame[@src = 'frame_3.html']"));
        driver.switchTo().frame(frm3);
        driver.findElement(By.xpath("//input[@name = 'mytext3']")).sendKeys("3333");
        driver.switchTo().frame(0);

        driver.findElement(By.xpath("(//div[@class = 'AB7Lab Id5V1'])[1]")).click();
        driver.switchTo().defaultContent();
    }
}
