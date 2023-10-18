package lr2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        int userInt = in.nextInt();
        if (userInt % 5 == 2 && userInt % 7 == 1)
            System.out.println("Number satisfy the requirements");
        else System.out.println("Number does not satisfy the requirements");
        in.close();
    }
}
