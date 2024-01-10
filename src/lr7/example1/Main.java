package lr7.example1;

public class Main {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass("в конструкторе суперкласса");
        System.out.println(superClass.toString());

        SubClass sub = new SubClass("в конструкторе подкласса", "с двумя параметрами");
        System.out.println(sub.toString());
    }
}
