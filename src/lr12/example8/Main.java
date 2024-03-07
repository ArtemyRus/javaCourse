package lr12.example8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов");
        final int N = in.nextInt();
        List<Integer> list = new ArrayList<>(N);
        Random random = new Random();
        for (int i = 0; i < N; i++){
            list.add(random.nextInt(100));
            System.out.println(list.get(i));
        }

        int number = 50;
        List<Integer> resultList = filterList(list, number);
        System.out.println("\nresultList:");
        for (int i : resultList){
            System.out.println(i);
        }
    }

    public static List<Integer> filterList(List<Integer> list, int num){
        return list.stream()
                .filter(x -> x > num)
                .collect(Collectors.toList());
    }
}
