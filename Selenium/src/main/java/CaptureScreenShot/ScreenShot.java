package CaptureScreenShot;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ScreenShot {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //Capture full page screenshot - selenium 3 & 4
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("/Users/syezd/IdeaProjects/Selenium/src/main/java/CaptureScreenShot/test2.png");
		FileUtils.copyFile(src, trg);*/


        // capture screenshot of specific area from webpage -- selenium 4+

		WebElement featuredproducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));

		File src=featuredproducts.getScreenshotAs(OutputType.FILE);
		File trg=new File("/Users/syezd/IdeaProjects/Selenium/src/main/java/CaptureScreenShot/test2.png");
		FileUtils.copyFile(src, trg);


        // capture screenshot of specific Web element -- selenium 4+

       /* WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));

        File src1=logo.getScreenshotAs(OutputType.FILE);
        File trg1=new File("/Users/syezd/IdeaProjects/Selenium/src/main/java/CaptureScreenShot/test2.png");
        FileUtils.copyFile(src1, trg1);*/



    }
}
