package lr10.example6;

public class Main {
    public static void main(String[] args) {
        MyJsonParser parser = new MyJsonParser();
        parser.printBooks();

        System.out.println();
        String author = "Александр Пушкин";
        parser.findBook(author);

        System.out.println();
        author = "Федор Достоевский";
        parser.findBook(author);

        System.out.println();
        parser.addBook("Преступление и наказание", "Федор Достоевский", 1866);

        System.out.println();
        parser.findBook(author);

        System.out.println();
        parser.deleteBook("Преступление и наказание");

        System.out.println();
        parser.findBook(author);
    }
}
