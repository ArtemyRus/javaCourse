package lr10.example4;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ReadExcelFileExample {
    public static void main(String[] args) {
        String filePath = "src/lr10/example4/example.xlsx";
        try(FileInputStream inputStream = new FileInputStream(filePath)) {
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheet("Товары");
            for (Row row : sheet){
                for (Cell cell : row){
                    System.out.print(cell.toString() + '\t');
                }
                System.out.println();
            }
            workbook.close();

        } catch (Exception e){
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}
