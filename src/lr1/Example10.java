package lr1;

import java.util.Scanner;
import java.time.LocalDate;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Your year of birth:");
        int birthYear = in.nextInt();
        int date = LocalDate.now().getYear();
        int userAge = date - birthYear;
        System.out.println("You're " + userAge + " years old.");
        in.close();
    }
}
