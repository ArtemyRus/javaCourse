package lr7.example3;

public class Main {
    public static void main(String[] args) {
        FirstClass first = new FirstClass(10);
        SecondClass second = new SecondClass(20, '#');
        ThirdClass third = new ThirdClass(30, '@', "third");

        System.out.println(first.toString());
        System.out.println(second.toString());
        System.out.println(third.toString());
    }
}
