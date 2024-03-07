package lr12.example3;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String str = "Напишите функцию, которая принимает на вход список строк и " +
                "возвращает новый список, содержащий только те строки, которые " +
                "начинаются с большой буквы.";
        List<String> list = List.of(str.split(" "));
        for (String s : list){
            System.out.println(s);
        }
        List<String> resultList = filterList(list);
        for (String s : resultList)
            System.out.println(s);
    }

    public static List<String> filterList(List<String> list){
        return list.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }
}
