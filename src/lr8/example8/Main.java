package lr8.example8;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String fileName = "src/lr8/example8/input.txt";
        File file = new File(fileName);
        int count = 0;
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = br.readLine()) != null){
                count++;
            }
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Количество строк в файле: " + count);
    }
}
