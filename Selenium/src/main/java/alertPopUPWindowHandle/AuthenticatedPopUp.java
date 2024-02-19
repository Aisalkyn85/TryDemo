package alertPopUPWindowHandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AuthenticatedPopUp {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();

        //http://the-internet.herokuapp.com/basic_auth
        //http://admin:admin@the-internet.herokuapp.com/basic_auth


        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");

        String text=driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]")).getText();

        if(text.contains("Congratulations"))
        {
            System.out.println("successful login");
        }
        else
        {
            System.out.println("login failed");
        }
    }
    }

