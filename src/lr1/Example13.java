package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstInt = in.nextInt();
        System.out.println("Enter second number:");
        int secondInt = in.nextInt();
        System.out.println("Sum is " + (firstInt + secondInt));
        in.close();
    }
}
