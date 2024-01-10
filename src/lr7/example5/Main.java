package lr7.example5;

public class Main {
    public static void main(String[] args) {
        SuperClass superVar = new SuperClass("super");
        FirstSubClass first = new FirstSubClass("first", 1);
        SecondSubClass second = new SecondSubClass("second", '2');

        superVar.printClassNameAndFieldValue();
        first.printClassNameAndFieldValue();
        second.printClassNameAndFieldValue();

        superVar = first;
        superVar.printClassNameAndFieldValue();
    }
}
