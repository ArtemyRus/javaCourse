package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Your name:");
        String nameUser = in.nextLine();
        System.out.println("Your year of birth:");
        int birthYear = in.nextInt();
        int date = LocalDate.now().getYear();
        int userAge = date - birthYear;
        System.out.println(nameUser + " is " + userAge + " years old.");
        in.close();
    }
}
