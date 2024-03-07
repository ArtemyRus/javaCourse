package lr12.example7;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String str = "Напишите функцию, которая принимает на вход список строк и " +
                "возвращает новый список, содержащий только те строки, которые имеют " +
                "длину больше заданного значения.\n";
        List<String> list = List.of(str.split(" "));
        for (String s : list){
            System.out.println(s);
        }
        int length = 9;
        List<String> resultList = filterList(list, length);
        System.out.println("resultList:");
        for (String s : resultList)
            System.out.println(s);
    }

    public static List<String> filterList(List<String> list, int l){
        return list.stream()
                .filter(s -> s.length() > l)
                .collect(Collectors.toList());
    }
}
