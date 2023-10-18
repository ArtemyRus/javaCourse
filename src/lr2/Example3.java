package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        int userInt = in.nextInt();
        if (userInt % 4 == 0 && userInt >= 10)
            System.out.println("Number satisfies the requirements");
        else System.out.println("Number does not satisfy the requirements");
        in.close();
    }
}
