package lr8.example3;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "src/lr8/example3/example_file.txt";
        String data = "";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            data = br.readLine();
        } catch (IOException e){
            System.out.println("Ошибка чтения данных: " + e.getMessage());
        }
        //String data = "Это данные для записи в файл";
        try(FileWriter writer = new FileWriter(fileName)){
            writer.write(data);
            System.out.println("Данные записаны в файл: " + fileName);
        } catch (IOException e){
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        try(FileReader reader = new FileReader(fileName)){
            char[] buffer = new char[1024];
            int charRead = reader.read(buffer);
            String readData = new String(buffer, 0, charRead);
            System.out.println("Прочитанные данные: " + readData);
        } catch (IOException e){
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        if(new File(fileName).delete()){
            System.out.println("Файл удален: " + fileName);
        } else {
            System.out.println("Не удалось удалить файл: " + fileName);
        }
    }
}
