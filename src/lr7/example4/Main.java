package lr7.example4;

public class Main {
    public static void main(String[] args) {
        First first = new First('b');
        First copyFirst = new First(first);
        System.out.println(first.toString());
        System.out.println(copyFirst.toString());

        Second second = new Second('&', "second");
        copyFirst = second;
        System.out.println(second.toString());
        System.out.println(copyFirst.toString());

        Third third = new Third('!', "third", 3);
        Second second2 = third;
        System.out.println(third.toString());
        System.out.println(second2.toString());
    }
}
