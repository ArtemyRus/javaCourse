package lr13.example1;

import java.time.LocalTime;

public class MyThread implements Runnable {
    Thread t;

    MyThread(String name){
        t = new Thread(this, name);
        t.start();
    }

    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(Thread.currentThread().getName() +
                    ": " + LocalTime.now());
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Thread has been interrupted");
            }
        }
    }
}
