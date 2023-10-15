package lr1;

import java.text.MessageFormat;
import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Your name:");
        String name = in.nextLine();
        System.out.println("Your age:");
        int age = in.nextInt();
        System.out.println(MessageFormat.format("{0} {1} y.o.", name, age));
        in.close();
    }
}
