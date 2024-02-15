package lr8.example2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "src/lr8/example2/example_file.txt";
        String data = "";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            data = br.readLine();
        } catch (IOException e){
            System.out.println("Ошибка чтения данных: " + e.getMessage());
        }
        //String data = "Это данные для записи в файл";
        try (FileOutputStream outputStream = new FileOutputStream(fileName)){
            outputStream.write(data.getBytes());
            System.out.println("Данные записаны в файл: " + fileName);
        } catch (IOException ex) {
            System.out.println("Ошибка при записи в файл: " + ex.getMessage());
        }

        try(FileInputStream inputStream = new FileInputStream(fileName)){
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);
            String readData = new String(buffer,0, bytesRead);
            System.out.println("Прочитанные данные: " + readData);
        } catch (IOException ex){
            System.out.println("Ошибка при чтении файла: " + ex.getMessage());
        }

        if(new File(fileName).delete()){
            System.out.println("Файл удален: " + fileName);
        } else {
            System.out.println("Не удалось удалить файл: " + fileName);
        }
    }
}
