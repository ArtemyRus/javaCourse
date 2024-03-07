package lr13.example3;

public class Main {
    public static void main(String[] args) {
        new Thread(new FirstThread(), "Even Thread").start();
        new Thread(new SecondThread(), "Odd Thread").start();
    }
}
