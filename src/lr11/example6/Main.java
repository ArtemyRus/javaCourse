package lr11.example6;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> library = new HashMap<>();
        try(FileReader fr = new FileReader("src/lr11/example6/books.txt");
            Scanner scan = new Scanner(fr)) {
            for (int i = 1; i <= 10; i++) {
                library.put(i, scan.nextLine());
            }
        } catch (IOException ex){
            System.out.println();
        }

        int value = 1;
        for (Map.Entry<Integer, String> book : library.entrySet()){
            if(book.getKey() > 5)
                System.out.println(book.getValue());
            if(book.getValue().length() > 5)
                value *= book.getKey();
        }
        System.out.println(value);
    }
}
