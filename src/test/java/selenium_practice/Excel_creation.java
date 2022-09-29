package selenium_practice;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Excel_creation {

    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Sample_Employee");

        XSSFRow row;

        Map<String, Object[]> employee = new TreeMap<String, Object[]>();

        employee.put("1", new Object[]{"EMP ID", "EMP NAME", "DESIGNATION"});
        employee.put("2", new Object[] { "tp01", "Madhu", "S"});
        employee.put("3", new Object[] { "tp02", "Velpuri", "A"});

        Set<String> keyid = employee.keySet();
        int rowid = 0;
        for (String key : keyid) {
            row = sheet.createRow(rowid++);
            Object[] objectArr = employee.get(key);
            int cellid = 0;
            for (Object obj : objectArr) {
                Cell cell = row.createCell(cellid++);
                cell.setCellValue((String) obj);
            }
        }
        // Write the workbook in file system
        FileOutputStream out = new FileOutputStream(new File("Writesheet.xlsx"));
        workbook.write(out);
        out.close();
//        workbook.close();
        System.out.println("Writesheet.xlsx written successfully");


    }




}
