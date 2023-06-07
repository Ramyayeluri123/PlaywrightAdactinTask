package com.DataManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class    ReadDataFromExcel {

     
        public static String ExcelReading(int row, int column) throws IOException {
            File file1 = new File("C:\\Users\\Ramya Yelluri\\OneDrive - Motivity Labs\\Desktop\\Selenium Java\\JsonProjectAdactin\\src\\main\\java\\Excel\\JsonDataFile.xlsx");
            //File file = new File(System.getProperty("user.dir") + "/Excel/JsonDataFile.xlsx");
            FileInputStream fileInputStream = new FileInputStream(file1);
            XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
             XSSFSheet sheet = workbook.getSheet("Sheet1");
            String cellValue1 = sheet.getRow(row).getCell(column).toString();
            return cellValue1;
        }
}