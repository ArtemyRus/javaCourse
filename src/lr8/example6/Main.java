package lr8.example6;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String inputFileName = "src/lr8/example6/input.txt";
        String outputFileName = "src/lr8/example6/output.txt";

        try (BufferedReader br =
                     new BufferedReader(new InputStreamReader(System.in));
             FileWriter fw =
                     new FileWriter(inputFileName)){
            fw.write(br.readLine());
            System.out.println("Данные записаны в файл: " + inputFileName);
        } catch (IOException e){
            System.out.println("Ошибка чтения/записи данных: " + e.getMessage());
        }

        try (BufferedReader bufferedReader =
                new BufferedReader(new FileReader(inputFileName));
             PrintWriter printWriter =
                new PrintWriter(outputFileName, "UTF-8")){
            String line;
            while ((line = bufferedReader.readLine()) != null){
                printWriter.println(line.toUpperCase());
            }
            System.out.println("Данные записаны в файл: " + outputFileName);
        } catch (IOException e){
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }
    }
}
