package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Disabled {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://only-testing-blog.blogspot.com/2013/09/testing.html?");
        driver.manage().window().maximize();
       WebElement usa  =  driver.findElement(By.xpath("//option[text()='USA']"));
        WebElement russia  =  driver.findElement(By.xpath("//option[text()='Russia']"));
        WebElement submit = driver.findElement(By.id("submitButton"));
        for(int i=0;i<2;i++){
            usa.click();
            if(submit.isEnabled()){
                Thread.sleep(5000);
                submit.click();
            }else{
                System.out.println("Submit button is not present");
            }
        }

    }
}
