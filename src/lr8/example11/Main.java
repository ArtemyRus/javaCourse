package lr8.example11;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Введите название файла:");
            String fileName = br.readLine();
            System.out.println("Введите искомое слово:");
            String keyWord = br.readLine();
            File file = new File(fileName);
            if(file.exists()){
                try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
                    String line;
                    while((line = bufferedReader.readLine()) != null){
                        if (line.contains(keyWord))
                            System.out.println(line);
                    }
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
