package lr12.example5;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String str = "Напишите функцию, которая принимает на вход список строк и " +
                "возвращает новый список, содержащий только те строки, которые содержат " +
                "заданную подстроку.\n";
        List<String> list = List.of(str.split(" "));
        for (String s : list){
            System.out.println(s);
        }
        System.out.println("resultList:");
        List<String> resultList = filterList(list);
        for (String s : resultList)
            System.out.println(s);
    }

    public static List<String> filterList(List<String> list){
        return list.stream()
                .filter(s -> s.contains("строк"))
                .collect(Collectors.toList());
    }
}
