package lr10.example3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.net.ConnectException;
import java.util.List;

public class NewsParser {
    public static void main(String[] args) {
        String fileName = "src/lr10/example3/news.txt";
        try(FileWriter fileWriter = new FileWriter(fileName)){
            Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();
            Elements newsParents = doc
                    .select("body > table > tbody > tr > td > div > table > " +
                            "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                            "tr > td:nth-child(1)");
            for (int i = 3; i < 20; i++){
                if(!(i % 2 == 0)){
                    List<Node> nodes = newsParents.get(0).childNodes();
                    fileWriter.write("Тема : " +
                            ((Element) nodes.get(i))
                                    .getElementsByClass("blocktitle")
                                    .get(0).childNodes().get(0));
                    fileWriter.append("\n");
                    fileWriter.write("Дата : " +
                            ((Element) nodes.get(i))
                                    .getElementsByClass("blockdate")
                                    .get(0).childNodes().get(0) + "\n");
                    fileWriter.append("\n");
                }
            }

        } catch (ConnectException ex){
            System.out.println("Connection error: " + ex.getMessage());
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
