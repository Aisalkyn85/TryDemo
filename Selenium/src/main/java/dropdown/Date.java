package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Date {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://admin-demo.nopcommerce.com/Admin/Customer/List");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }
}
