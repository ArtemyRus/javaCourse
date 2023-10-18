package lr2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        int userInt = in.nextInt();
        System.out.println((userInt / 1000) + " thousands in number");
        in.close();
    }
}
