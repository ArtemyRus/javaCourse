package lr13.example3;

public class SecondThread implements Runnable{
    @Override
    public void run() {
        synchronized (FirstThread.lock){
            for (int i = 1; i < 11; i++){
                if(i % 2 != 0)
                    System.out.println(Thread.currentThread().getName() + ": " + i);
                else{
                    try{
                        Thread.sleep(1000);
                        FirstThread.lock.wait();
                    } catch (InterruptedException e){
                        System.out.println("Thread has been interrupted");
                    }
                }
                FirstThread.lock.notifyAll();
            }
        }
    }
}
