package lr1;
import java.text.MessageFormat;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Your surname:");
        String surname = in.nextLine();
        System.out.println("Your name:");
        String name = in.nextLine();
        System.out.println("Your middle-name:");
        String middleName = in.nextLine();
        System.out.println(MessageFormat.format("Hello, {0} {1} {2}", surname, name, middleName));
        in.close();
    }
}
