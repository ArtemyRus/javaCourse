package lr1;

import java.time.LocalDate;
import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How old are you?");
        int userAge = in.nextInt();
        int birthYear = LocalDate.now().getYear() - userAge;
        System.out.println("Your year of birth is " + birthYear);
        in.close();
    }
}
