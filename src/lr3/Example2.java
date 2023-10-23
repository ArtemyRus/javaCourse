package lr3;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите день недели:");
        String dayOfWeek = in.nextLine();
        dayOfWeek = dayOfWeek.toLowerCase();

        switch (dayOfWeek) {
            case "понедельник":
                System.out.println("1-й день недели");
                break;
            case "вторник":
                System.out.println("2-й день недели");
                break;
            case "среда":
                System.out.println("3-й день недели");
                break;
            case "четверг":
                System.out.println("4-й день недели");
                break;
            case "пятница":
                System.out.println("5-й день недели");
                break;
            case "суббота":
                System.out.println("6-й день недели");
                break;
            case "воскресенье":
                System.out.println("7-й день недели");
                break;
            default:
                System.out.println("Некорректное значение");
                break;
        }
        in.close();
    }
}
