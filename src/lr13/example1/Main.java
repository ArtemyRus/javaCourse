package lr13.example1;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        MyThread t1 = new MyThread("Поток-1");
        MyThread t2 = new MyThread("Поток-2");
        t1.t.join();
        t2.t.join();
    }
}
