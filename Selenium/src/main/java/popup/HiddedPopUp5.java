package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.util.Iterator;
import java.util.Set;


public class HiddedPopUp5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://chercher.tech/practice/hidden-division-popup");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println(title);
        WebElement element = driver.findElement(By.xpath("//a[text()='View Pop-up']"));
        element.click();
        Thread.sleep(2000);
        /*Set<String> tabs = driver.getWindowHandles();
        Iterator<String> iterator = tabs.iterator();
        String firstTab = iterator.next();
        String secondTab = iterator.next();
        driver.switchTo().window(secondTab);*/
        WebElement text = driver.findElement(By.xpath("//input[@type='text']"));
        text.sendKeys("PopUp");
       Thread.sleep(2000);
       WebElement file = driver.findElement(By.xpath("//input[@type='file']"));
        File uploadFile = new File("/private/var/folders/_r/w84dk_j17r56tmc69_s35_k00000gn/T/net.whatsapp.WhatsApp/documents/HI.docx");
        file.sendKeys(uploadFile.getAbsolutePath());


    }
}
