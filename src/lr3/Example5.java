package lr3;

import java.util.Scanner;

public class Example5 {
    static void First(int count){
        int sum = 0;
        int number = 1;
        while (count > 0){
            if (number % 5 == 2 || number % 3 == 1){
                sum += number;
                System.out.printf(number + " ");
                count--;
            }
            number++;
        }
        System.out.println();
        System.out.println(sum);
    }

    static void Second(int count){
        int sum = 0;
        for (int i = 0, number = 1; i < count; number++){
            if (number % 5 == 2 || number % 3 == 1) {
                sum += number;
                System.out.printf(number + " ");
                i++;
            }
        }
        System.out.println();
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел:");
        int count = in.nextInt();
        First(count);
        Second(count);
        in.close();
    }
}
