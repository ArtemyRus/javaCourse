package lr1;

import java.text.MessageFormat;
import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Current day of the week, month, date:");
        String input = in.nextLine();
        String[] date = input.split(" ");
        System.out.println(MessageFormat.format("Today is {0}, {1} {2}", date[0], date[1], date[2]));
        in.close();
    }
}
