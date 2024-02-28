package lr10.example2;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class JsonParser {
    public static void main(String[] args) {
        try{
            JSONParser parser = new JSONParser();
            JSONObject jsonObj = (JSONObject) parser.parse(new FileReader("src/lr10/example2/example-json.json"));
            System.out.println("Корневой элемент: " + jsonObj.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObj.get("books");

            for (Object o : jsonArray){
                JSONObject book = (JSONObject) o;
                System.out.println("\nТекущий элемент: book");
                System.out.println("Название книги: " + book.get("title"));
                System.out.println("Автор: " + book.get("author"));
                System.out.println("Год издания: " + book.get("year"));
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
