package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Month name:");
        String monthName = in.nextLine();
        System.out.println("Days in a month:");
        int monthDays = in.nextInt();
        System.out.println(monthName + " contains " + monthDays + " days.");
        in.close();
    }
}
