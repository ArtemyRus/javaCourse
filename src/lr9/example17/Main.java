package lr9.example17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] input = in.nextLine().split(" ");
        byte[] byteArray = new byte[input.length];
        int sum = 0;
        for (int i = 0; i < byteArray.length; i++) {
            try {
                byteArray[i] = Byte.parseByte(input[i]);
                sum += byteArray[i];
                System.out.print(byteArray[i] + " ");
            } catch (NumberFormatException ex) {
                sum = 0;
                System.out.println("\nВвод строки вместо числа, либо число находится вне диапазона типа");
            }
        }
        System.out.println("\nСумма элементов: " + sum);
    }
}
