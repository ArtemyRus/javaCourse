package lr13.example3;

public class FirstThread implements Runnable{
    public static final Object lock = new Object();

    @Override
    public void run() {
        synchronized (lock){
            for (int i = 1; i < 11; i++){
                if(i % 2 == 0)
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                else{
                    try{
                        Thread.sleep(1000);
                        lock.wait();
                    } catch (InterruptedException e){
                        System.out.println("Thread has been interrupted");
                    }
                }
                lock.notifyAll();
            }
        }
    }
}
