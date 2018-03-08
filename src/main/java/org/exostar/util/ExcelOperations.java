package org.exostar.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {

    private static final String FILE_NAME = System.getProperty("user.dir") + "\\Credential.xlsx";
    public static String userPass = null;
    public static String readFromExcel(String sheet) {
        try {

        		System.out.println("The Excel file Path is --:" +FILE_NAME);
            FileInputStream excelFile = new FileInputStream(new File(FILE_NAME));
            @SuppressWarnings("resource")
			Workbook workbook = new XSSFWorkbook(excelFile);
            Sheet datatypeSheet = workbook.getSheet(sheet);
            // Iterator<Row> iterator = datatypeSheet.iterator();

            /*
             * while (iterator.hasNext()) {
             *
             * Row currentRow = iterator.next(); Iterator<Cell> cellIterator =
             * currentRow.iterator();
             *
             * while (cellIterator.hasNext()) { Cell currentCell = cellIterator.next();
             * username = currentCell.get
             *
             * } System.out.println();
             *
             * }
             */
            userPass = datatypeSheet.getRow(0).getCell(0).getStringCellValue() + " " + datatypeSheet.getRow(0).getCell(1).getStringCellValue();
            System.out.println("UserPass in read Exal -- "+userPass);
            return userPass;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userPass;

    }

    public static void writeFromExcel() {

    }
}