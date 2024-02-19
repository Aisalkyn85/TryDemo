package javascriptActions;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Date {
    public static void main(String[] args) throws InterruptedException {
        String datevalue="13/12/2023";
        String Month="Dec 2023";

        WebDriver driver=new EdgeDriver();
        driver.get("https://www.easemytrip.com/");
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
        Thread.sleep(1000);
        WebElement date=driver.findElement(By.xpath("//*[contains(text(),'Book a round trip')]"));
        date.click();
        Thread.sleep(1000);
        WebElement month=driver.findElement(By.xpath("(//div[@id='dvprevious']//following::div)[1]"));
        String monthtext=month.getText();
        if(!monthtext.equalsIgnoreCase(Month) ){
            driver.findElement(By.xpath("//img[@id='img2Nex']")).click();
        }
            Thread.sleep(1000);
            List<WebElement> dateElements=driver.findElements(By.xpath("//li[contains(@id,'_')]//span"));
            for (WebElement element : dateElements) {
                if (element.getAttribute("id").equals(datevalue)) {
                    element.click();
                    System.out.println("Date selected: " + datevalue);
                    break;
                }
            }

            System.out.println("test pass");
            driver.quit();
        }

    public static class Excel {
        public static void main(String[] args) {
            try {
                String filepath = "/Users/syezd/IdeaProjects/Selenium/src/main/resources/dataInExcel copy.xlsx";
                FileInputStream fileInputStream = new FileInputStream(filepath);

                // Open the Excel workbook
                Workbook workbook = new XSSFWorkbook(fileInputStream);

                // Assuming the data should be written to the first sheet and a new row
                Sheet sheet = workbook.getSheetAt(0);
                int rowNum = sheet.getPhysicalNumberOfRows(); // Get the next available row number
                Row row = sheet.createRow(rowNum); // Create a new row

                // Set cell values for different columns using a list of values
                List<String> countryValues = Arrays.asList("Germany", "India", "USA" /* Add more countries */);
                for (int i = 0; i < countryValues.size(); i++) {
                    Cell cell = row.createCell(i); // Create a new cell in the i-th column
                    cell.setCellValue(countryValues.get(i));
                }

                // Save the changes back to the Excel file
                try (FileOutputStream fileOutputStream = new FileOutputStream(filepath)) {
                    workbook.write(fileOutputStream);
                    System.out.println("Data written to Excel successfully.");
                }

                // Close the workbook
                workbook.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

