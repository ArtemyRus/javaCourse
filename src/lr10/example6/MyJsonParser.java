package lr10.example6;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;

public class MyJsonParser {
    private JSONParser parser;
    private JSONObject jsonObj;
    private JSONArray jsonArray;

    MyJsonParser(){
        try{
            parser = new JSONParser();
            jsonObj = (JSONObject) parser.parse(new FileReader("src/lr10/example6/library.json"));
            jsonArray = (JSONArray) jsonObj.get("books");
        } catch (Exception e){
            System.out.println("Parsing error: " + e.getMessage());
        }
    }

    public void printBooks(){
        for (Object o : jsonArray){
            JSONObject book = (JSONObject) o;
            System.out.println("\nНазвание книги: " + book.get("title"));
            System.out.println("Автор: " + book.get("author"));
            System.out.println("Год издания: " + book.get("year"));
        }
    }

    public void findBook(String author){
        boolean flag = true;
        System.out.println("Автор: " + author);
        for (Object o : jsonArray){
            JSONObject book = (JSONObject) o;
            if(book.get("author").equals(author)){
                System.out.println("Название книги: " + book.get("title"));
                flag = false;
            }
        }
        if(flag) System.out.println("Книга не найдена");
    }

    public void addBook(String title, String author, int year){
        JSONObject newBook = new JSONObject();
        newBook.put("title", title);
        newBook.put("author", author);
        newBook.put("year", year);
        jsonArray.add(newBook);

        try(FileWriter fileWriter = new FileWriter("src/lr10/example6/library.json")){
            fileWriter.write(jsonObj.toJSONString());
            System.out.println("Книга добавлена");
        } catch (Exception e){
            System.out.println("Ошибка записи: " + e.getMessage());
        }
    }

    public void deleteBook(String title){
        Iterator iterator = jsonArray.iterator();
        while (iterator.hasNext()) {
            JSONObject book = (JSONObject) iterator.next();
            if (title.equals(book.get("title"))) {
                iterator.remove();
            }
        }

        try(FileWriter fileWriter = new FileWriter("src/lr10/example6/library.json")){
            fileWriter.write(jsonObj.toJSONString());
            System.out.println("Книга удалена");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
