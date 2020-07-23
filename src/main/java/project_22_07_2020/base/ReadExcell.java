package project_22_07_2020.base;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.*;

import java.io.File;

public class ReadExcell {
    public static String[][] readExcelInto2DArry(String excelFilePath, String sheetName, int totalCols) {
        File file = new File(excelFilePath);
        String[][] tabArry = null;
        try {
            OPCPackage opcPackage = OPCPackage.open(file.getAbsolutePath());
            Workbook wb = WorkbookFactory.create(opcPackage);
            Sheet sheet = wb.getSheet(sheetName);
            int totalRows = sheet.getLastRowNum()+1;
            tabArry = new String[totalRows][totalCols];
            for (int i = 0; i < totalRows; i++) {
                Row row = sheet.getRow(i);
                String data = null;
                for (int j = 0; j < totalCols; j++) {
                    Cell cell = row.getCell(j);
                    if (cell == null) {
                        continue;
                    }
                    data = cell.getStringCellValue();
                    tabArry[i][j] = data;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return tabArry;
    }
}
