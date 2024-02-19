package screenshot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;

public class Screenshot {
    public static void main(String[] args) throws IOException {
        WebDriver driver =new EdgeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        WebElement textbox=driver.findElement(By.id("APjFqb"));
        JavascriptExecutor excutor=(JavascriptExecutor)driver;
        excutor.executeScript("arguments[0].value='Selenium';", textbox);
        WebElement click=  driver.findElement(By.name("btnK"));
        excutor.executeScript("arguments[0].click();", click);
        System.out.println("test pass");

        File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File Dest= new File("/Users/syezd/IdeaProjects/Selenium/src/main/java/screenshot/test1.png");
        FileUtils.copyFile(f,Dest);
        System.out.println("Absolute Path"+ Dest.getAbsolutePath());
        driver.quit();
    }
}
