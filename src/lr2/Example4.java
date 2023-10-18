package lr2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        int userInt = in.nextInt();
        if (userInt > 4  && userInt < 11)
            System.out.println("Number belongs [5;10]");
        else System.out.println("Number doesn't belong [5;10]");
        in.close();
    }
}
