package de.lubowiecki.libs;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.util.Map;
import java.util.TreeMap;

public class ExcelExportTest {

    public static void main(String[] args) {

        Map<String, Object[]> data = new TreeMap<>();
        data.put("1", new Object[]{"Nr", "Vorname", "Nachname"});
        data.put("2", new Object[]{"1", "Bruce", "Banner"});
        data.put("3", new Object[]{"2", "Natasha", "Romanov"});
        data.put("4", new Object[]{"3", "Tony", "Stark"});
        data.put("5", new Object[]{"4", "Carol", "Danvers"});

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Personal");


        int i = 0;
        for(Map.Entry<String, Object[]> entry : data.entrySet()) {

            Row row = sheet.createRow(i++);
            int j = 0;
            for (Object o : entry.getValue()) {
                Cell cell = row.createCell(j++);
                cell.setCellValue((String) o);
            }
        }

        try(FileOutputStream out = new FileOutputStream("personal_22022024.xlsx")) {
            workbook.write(out); // Workbook wird gespeichert
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
