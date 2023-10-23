package lr3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int firstInt = in.nextInt();
        System.out.println("Введите второе число:");
        int secondInt = in.nextInt();
        SortWithArray(firstInt, secondInt);
        SortAndPrintInts(firstInt, secondInt);
        in.close();
    }

    static void SortAndPrintInts(int first, int second){
        if (first > second)
            System.out.println(second + " " + first);
        else System.out.println(first + " " + second);
    }

    static void SortWithArray(int first, int second){
        int[] arrayInts = {first, second};
        Arrays.sort(arrayInts);
        for (int i : arrayInts) {
            System.out.printf(i + " ");
        }
        System.out.println();
    }
}
