package lr8.example5;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String inputFileName = "src/lr8/example5/input.txt";
        String data = "";
        try (FileWriter writer = new FileWriter(inputFileName);
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            data = br.readLine();
            writer.write(data);
            System.out.println("Данные: " + data + " записаны в файл: " + inputFileName);
        } catch (IOException e){
            System.out.println("Ошибка чтения/записи данных: " + e.getMessage());
        }
        String outputFileName = "src/lr8/example5/output.txt";
        try (InputStream inputStream = new FileInputStream(inputFileName);
             InputStreamReader inputStreamReader =
                     new InputStreamReader(inputStream,"UTF-8");
             BufferedReader bufferedReader =
                     new BufferedReader(inputStreamReader);
             OutputStream outputStream =
                     new FileOutputStream(outputFileName);
             OutputStreamWriter outputStreamWriter =
                     new OutputStreamWriter(outputStream, "UTF-8");
             BufferedWriter bufferedWriter =
                     new BufferedWriter(outputStreamWriter)){
            String line;
            while ((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line.toUpperCase());
                bufferedWriter.newLine();
            }
            System.out.println("Данные записаны в файл: " + outputFileName);
        } catch (IOException e){
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }
    }
}
