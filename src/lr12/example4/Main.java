package lr12.example4;

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

        List<Integer> resultList = squareList(list);
        for (int i : resultList){
            System.out.println(i);
        }
    }

    public static List<Integer> squareList(List<Integer> list){
        return list.stream().map(x -> x * x).collect(Collectors.toList());
    }
}
