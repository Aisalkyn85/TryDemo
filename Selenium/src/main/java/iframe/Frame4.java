package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Frame4 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://chercher.tech/practice/frames");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//h1[text()='Frames Examples']"));
        String text = element.getText();
        System.out.println(text);

    }
}
