package ro.ulbs.paradigme.lab8;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileOutputStream;
import java.util.Map;
import java.util.TreeMap;

public class ExcelGenerator {

    public static void main(String[] args) {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Rezultate");

        // Structura de date
        Map<String, Object[]> data = new TreeMap<>();
        data.put("1", new Object[] {"Prenume", "Nume", "Nota1", "Nota2", "Nota3", "Nota4","MAX","AVERAGE"});
        data.put("2", new Object[] {"Amit", "Shukla", 9, 8, 7, 5});
        data.put("3", new Object[] {"Lokesh", "Gupta", 8, 9, 6, 7});
        data.put("4", new Object[] {"John", "Adwards", 8, 8, 7, 6});
        data.put("5", new Object[] {"Brian", "Schultz", 7, 6, 8, 9});

        // Stiluri celule
        XSSFFont boldFont = workbook.createFont();
        boldFont.setBold(true);

        XSSFFont italicFont = workbook.createFont();
        italicFont.setItalic(true);

        CellStyle headerStyle = workbook.createCellStyle();
        headerStyle.setFont(boldFont);

        CellStyle italicStyle = workbook.createCellStyle();
        italicStyle.setFont(italicFont);


        headerStyle.setFillForegroundColor(IndexedColors.LIGHT_GREEN.getIndex());
        headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        CellStyle yellowStyle = workbook.createCellStyle();
        yellowStyle.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
        yellowStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        yellowStyle.setFont(italicFont);
        int rownum = 0;
        for (String key : data.keySet()) {
            Row row = sheet.createRow(rownum);
            Object[] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr) {
                Cell cell = row.createCell(cellnum++);
                if (obj instanceof String)
                    cell.setCellValue((String) obj);
                else if (obj instanceof Integer)
                    cell.setCellValue((Integer) obj);

                // Stil header
                if (rownum == 0)
                    cell.setCellStyle(headerStyle);
            }

            // Coloana G: =MAX(Di:Fi)
            if (rownum != 0) {
                Cell maxCell = row.createCell(6); // G
                String formula = "MAX(C" + (rownum + 1) + ":F" + (rownum + 1) + ")";
                maxCell.setCellFormula(formula);
                maxCell.setCellStyle(yellowStyle);

                // Coloana H: =AVERAGE(Di:Fi)
                Cell avgCell = row.createCell(7); // H
                formula = "AVERAGE(C" + (rownum + 1) + ":F" + (rownum + 1) + ")";
                avgCell.setCellFormula(formula);
                avgCell.setCellStyle(yellowStyle);
            }

            rownum++;
        }

        try (FileOutputStream out = new FileOutputStream("output8.xlsx")) {
            workbook.write(out);
            workbook.close();
            System.out.println("Fișierul a fost generat cu succes!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
