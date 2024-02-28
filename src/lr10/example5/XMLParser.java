package lr10.example5;

import org.w3c.dom.*;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XMLParser {
    public static Library parse() {
        Library library = new Library();
        List<Book> bookList;
        String fileName = "src/lr10/example5/library.xml";

        Document doc = null;
        try {
            doc = buildDocument(fileName);
        } catch (Exception ex) {
            System.out.println("Parsing error " + ex.getMessage());
            return library;
        }

        Scanner in = new Scanner(System.in);
        boolean flag = true;
        do{
            System.out.println("Добавить новую книгу в библиотеку? y/n");
            switch (in.nextLine()){
                case "y":
                    try{
                        System.out.println("Введите название: ");
                        String title = in.nextLine();
                        System.out.println("Введите автора: ");
                        String author = in.nextLine();
                        System.out.println("Введите год издания: ");
                        int year = Integer.parseInt(in.nextLine());
                        addBook(title, author, year, doc, fileName);
                    } catch (Exception ex){
                        System.out.println("Ошибка ввода " + ex.getMessage());
                    }
                    break;
                case "n":
                    flag = false;
                    break;
                default:
                    System.out.println("Ошибка ввода");
                    break;
            }
        }
        while (flag);

        bookList = parseLib(doc);
        library.setLibrary(bookList);

        System.out.println("Введите автора или год издания книги:");
        String input = in.nextLine();
        if(isNumeric(input))
            library.findAndPrintBook(Integer.parseInt(input));
        else
            library.findAndPrintBook(input);

        System.out.println("Введите название книги, которую хотите удалить:");
        String title = in.nextLine();
        try{
            removeBook(title,doc,fileName);
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return library;
    }

    private static Document buildDocument(String fileName) throws Exception {
        File file = new File(fileName);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        return factory.newDocumentBuilder().parse(file);
    }

    private static List<Book> parseLib(Document doc) {
        List<Book> books = new ArrayList<>();
        Node rootNode = doc.getDocumentElement();
        NodeList childNodes = rootNode.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node node = childNodes.item(i);
            if (node.getNodeType() != Node.ELEMENT_NODE)
                continue;
            Element element = (Element) node;
            String title = element.getElementsByTagName("title").item(0).getTextContent();
            String author = element.getElementsByTagName("author").item(0).getTextContent();
            int year = Integer.parseInt(element.getElementsByTagName("year").item(0).getTextContent());
            Book book = new Book(title, author, year);
            books.add(book);
        }
        return books;
    }

    private static void addBook(String titleVal, String authorVal, int yearVal, Document doc, String fileName) throws Exception{
        Element rootElement = doc.getDocumentElement();

        Element book = doc.createElement("book");
        rootElement.appendChild(book);

        Element title = doc.createElement("title");
        title.appendChild(doc.createTextNode(titleVal));
        book.appendChild(title);

        Element author = doc.createElement("author");
        author.appendChild(doc.createTextNode(authorVal));
        book.appendChild(author);

        Element year = doc.createElement("year");
        year.appendChild(doc.createTextNode(Integer.toString(yearVal)));
        book.appendChild(year);

        doc.getDocumentElement().normalize();
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(fileName));
        transformer.transform(source, result);

        System.out.println("Книга добавлена");
    }

    private static void removeBook(String title, Document doc, String fileName)throws Exception{
        NodeList nodeList = doc.getElementsByTagName("book");
        for (int i = 0; i < nodeList.getLength(); i++){
            Node node = nodeList.item(i);
            Element bookElement = (Element) node;
            if(bookElement.getElementsByTagName("title").item(0).getTextContent().equalsIgnoreCase(title)){
                Node parentNode = bookElement.getParentNode();
                parentNode.removeChild(bookElement);
                System.out.println("Книга удалена");

                TransformerFactory tf = TransformerFactory.newInstance();
                Transformer transformer = tf.newTransformer();
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(new File(fileName));
                transformer.transform(source, result);
                return;
            }
        }
        System.out.println("Книга не найдена");
    }

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
