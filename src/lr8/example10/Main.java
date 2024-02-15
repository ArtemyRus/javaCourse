package lr8.example10;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Введите название файла:");
            String fileName = br.readLine();
            File file = new File(fileName);
            if(file.exists()){
                System.out.println("Размер файла " + file.getAbsolutePath() + ": " + file.length() + " байт");
            }
            else{
                System.out.println("Файл не найден");
            }
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
