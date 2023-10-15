package lr1;

import java.text.MessageFormat;
import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        int userInt = in.nextInt();
        double userIntPow = Math.pow(userInt * 3, 2);
        System.out.println(
                MessageFormat.format("{0} \t {1} \t {2} \t {3}",userInt - 1, userInt, userInt + 1, userIntPow));
        in.close();
    }
}
