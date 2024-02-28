package lr10.example3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.FileWriter;
import java.net.ConnectException;

public class LinkParser {
    public static void main(String[] args) {
        String url = "https://itlearn.ru/first-steps";
        String fileName = "src/lr10/example3/links.txt";
        try(FileWriter fileWriter = new FileWriter(fileName)) {
            Document doc = Jsoup.connect(url).get();
            Elements links = doc.select("a[href]");
            for (Element link : links) {
                fileWriter.write(link.attr("abs:href"));
                fileWriter.append("\n");
            }
        }catch (ConnectException ex){
            System.out.println("Connection error: " + ex.getMessage());
        } catch (Exception e){
            System.out.println("Parsing error: " + e.getMessage());
        }
    }
}
