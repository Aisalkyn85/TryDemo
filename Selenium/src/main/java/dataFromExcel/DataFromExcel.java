package dataFromExcel;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataFromExcel {
    public static void main(String[] args) {
        try {
            String filepath = "/Users/syezd/IdeaProjects/Selenium/src/main/resources/dataInExcel copy.xlsx";
            FileInputStream fileInputStream = new FileInputStream(filepath);

            // Open the Excel workbook
            Workbook workbook = new XSSFWorkbook(fileInputStream);

            // Assuming the data is in the first sheet
            Sheet sheet = workbook.getSheetAt(0);

            // Iterate through rows and columns
            for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
                Row row = sheet.getRow(i);

                // Iterate through cells in the row
                for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                    Cell cell = row.getCell(j);

                    // Print the cell value to the console
                    System.out.print(cellToString(cell) + "\t");

                }
                System.out.println();
            }
                // Close the workbook
                workbook.close();


            } catch(IOException e){
                throw new RuntimeException(e);
            }
        }
        private static String cellToString(Cell cell) {
                if (cell == null) {
                    return "";
                }

                switch (cell.getCellType()) {
                    case STRING:
                        return cell.getStringCellValue();
                    case NUMERIC:
                        if (DateUtil.isCellDateFormatted(cell)) {
                            return cell.getDateCellValue().toString();
                        } else {
                            return String.valueOf(cell.getNumericCellValue());
                        }
                    case BOOLEAN:
                        return String.valueOf(cell.getBooleanCellValue());
                    case FORMULA:
                        return cell.getCellFormula();
                    default:
                        return "";
                }
        }
    }



