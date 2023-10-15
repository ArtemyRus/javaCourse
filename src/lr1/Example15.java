package lr1;

import java.text.MessageFormat;
import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstInt = in.nextInt();
        System.out.println("Enter second number:");
        int secondInt = in.nextInt();
        System.out.println(MessageFormat.format("Sum of {0} and {1} is {2}",
                firstInt,
                secondInt,
                firstInt + secondInt));
        System.out.println(MessageFormat.format("Difference of {0} and {1} is {2}",
                firstInt,
                secondInt,
                firstInt - secondInt));
        in.close();
    }
}
