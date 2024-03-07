package lr13.example4;

public class MyThread implements Runnable{
    Thread t;
    MyThread(){
        try {
            t = new Thread(this);
            t.start();
            t.join();
        } catch (InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
    }

    @Override
    public void run() {
        System.out.println(t.getName() + ": " + t.getId());
    }
}
