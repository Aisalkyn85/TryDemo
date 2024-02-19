package mouseHandler;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
    public static void main(String[] args) {
        try {
            String filepath = "C:/Users/syezd/IdeaProjects/Selenium/src/main/resources/dataInExcel copy.xlsx";
            FileInputStream fileInputStream = new FileInputStream(filepath);

            // Open the Excel workbook
            Workbook workbook = new XSSFWorkbook(fileInputStream);

            // Assuming the data should be written to the first sheet and cell A1
            Sheet sheet = workbook.getSheetAt(1);
            Row row = sheet.createRow(0); // Create a new row
            Cell cell = row.createCell(0); // Create a new cell in the first column (index 0)

            // Set the cell value to "Germany"
            cell.setCellValue("Germany");
            cell.setCellValue("Atlanta");

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
