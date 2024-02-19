package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class ChoseFilePopUP {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println(title);

        WebElement text = driver.findElement(By.xpath("//input[@class='input-file']"));

        Thread.sleep(2000);

        File uploadFile = new File("/private/var/folders/_r/w84dk_j17r56tmc69_s35_k00000gn/T/net.whatsapp.WhatsApp/documents/HI.docx");
        text.sendKeys(uploadFile.getAbsolutePath());


    }
}



