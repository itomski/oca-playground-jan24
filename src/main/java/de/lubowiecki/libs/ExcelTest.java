package de.lubowiecki.libs;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.util.Iterator;

public class ExcelTest {

    public static void main(String[] args) {

        try(FileInputStream file = new FileInputStream("data.xlsx")) {

            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);

            Iterator<Row> rows = sheet.iterator();
            while(rows.hasNext()) {

                Row row = rows.next(); // Nächste Zeile abfragen

                Iterator<Cell> cells = row.iterator();
                while(cells.hasNext()) {

                    Cell cell = cells.next();

                    if(cell.getCellType() == CellType.NUMERIC) {
                        System.out.printf(" %10f ", cell.getNumericCellValue());
                    }
                    else {
                        System.out.printf(" %15s ", cell.getStringCellValue());
                    }
                }
                System.out.println();
            }
        }
        catch(Exception e) {
            e.printStackTrace();
        }

    }
}
