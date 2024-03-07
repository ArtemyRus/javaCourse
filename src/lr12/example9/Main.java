package lr12.example9;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String str = "one1two one two2 one1 12 two 2two.\n";
        List<String> list = List.of(str.split(" "));
        for (String s : list){
            System.out.println(s);
        }
        List<String> resultList = filterList(list);
        System.out.println("resultList:");
        for (String s : resultList)
            System.out.println(s);
    }

    public static List<String> filterList(List<String> list){
        return list.stream()
                .filter(s -> s.matches("[a-zA-Z]+"))
                .collect(Collectors.toList());
    }
}
