package hiddenDropDownDate;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;
import java.util.List;

public class HiddenDorpdown {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().window().maximize();

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        //driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("PIM");
        JavascriptExecutor executor = (JavascriptExecutor) driver;
       WebElement pm =  driver.findElement(By.xpath("//span[text()='PIM']"));
       executor.executeScript("arguments[0].click()",pm);
        System.out.println(driver.getTitle());



        //Dropwdown


        driver.findElement(By.xpath("//label[text()='Job Title']/../..//div[text()='-- Select --']")).click();// opens the dropdown

        List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
        System.out.println("list "+options.size());

        for(WebElement option:options)
        {
            //System.out.println(option.getText());
            if(option.getText().equals("Finance Manager"))
            {
                option.click();
                break;
            }
        }

    }
}
