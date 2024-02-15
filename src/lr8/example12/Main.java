package lr8.example12;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Введите название файла:");
            String fileName = br.readLine();
            System.out.println("Введите записываемый текст:");
            String line = br.readLine();
            String[] text = line.split("\\.");
            File file = new File(fileName);
            if(file.exists()){
                try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
                    for (String s : text) {
                        bw.write(s + ".");
                        bw.newLine();
                    }
                    System.out.println("Данные записаны в файл " + file.getAbsolutePath());
                    System.out.println("Количество символов: " + line.length());
                } catch (IOException ex){
                    System.out.println(ex.getMessage());
                }
            }
            else{
                System.out.println("Файл не найден");
            }
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
