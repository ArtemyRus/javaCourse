package lr10.example5;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> library;
    public Library(){}

    public Library(List<Book> library){
        this.library = library;
    }

    public List<Book> getLibrary(){
        return library;
    }

    public void setLibrary(List<Book> library) {
        this.library = library;
    }

    @Override
    public String toString() {
        return "Library{" + '\n' +
                "library=" + library + '\n' +
                '}';
    }

    public void findAndPrintBook(String author){
        List<Book> books = new ArrayList<>();
        for (Book book : library){
            if(book.getAuthor().equalsIgnoreCase(author)){
                books.add(book);
                System.out.println(book.getTitle());
            }
        }
        if (books.isEmpty()){
            System.out.println("Книга не найдена");
        }
    }

    public void findAndPrintBook(int year){
        List<Book> books = new ArrayList<>();
        for (Book book : library){
            if(book.getYear() == year){
                books.add(book);
                System.out.println(book.getTitle());
            }
        }
        if (books.isEmpty()){
            System.out.println("Книга не найдена");
        }
    }
}
