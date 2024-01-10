package lr7.example2;

public class Main {
    public static void main(String[] args) {
        SuperClass superVar = new SuperClass();
        SubClass subVar = new SubClass();

        superVar.setValue("superclass");
        subVar.setValue("subclass");

        System.out.println(subVar.getStringLength());
        System.out.println(superVar.getStringLength());
    }
}
