package lr9.example15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите последовательность целочисленных значений:");
        String input = in.nextLine();
        try {
            AveragePositiveInts a = new AveragePositiveInts(input);
            System.out.println(a.getAverage());
        } catch (NumberFormatException ex1){
            System.out.println("Введено не целое число");
        } catch (Exception ex2){
            System.out.println("Массив отрицательных чисел");
        }
    }
}
