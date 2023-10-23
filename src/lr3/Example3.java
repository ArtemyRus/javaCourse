package lr3;

import java.util.Scanner;

public class Example3 {

    static void FibOne(long count){
        long prev = 1;
        long curr = 1;
        if (count == 0){
            System.out.println(0);
            return;
        }
        if (count == 1){
            System.out.println(1);
            return;
        }
        System.out.printf(curr + " ");
        System.out.printf(curr + " ");
        for (int i = 2; i < count; i++){
            long temp = curr;
            curr += prev;
            prev = temp;
            System.out.printf(curr + " ");
        }
        System.out.println();
    }
    static void FibTwo(int count){
        int prev = 1;
        int curr = 1;
        switch (count){
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
            default:
                System.out.printf(curr + " ");
                System.out.printf(curr + " ");
                int i = 2;
                while (i < count){
                    i++;
                    int temp = curr;
                    curr += prev;
                    prev = temp;
                    System.out.printf(curr + " ");
                }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Количество чисел последовательности Фибоначчи:");
        long userLong = in.nextLong();
        int userInt = (int)userLong;
        FibOne(userLong);
        FibTwo(userInt);
        in.close();
    }
}
