package lr13.example2;

public class MyThread implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i < 11; i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println("Thread has been interrupted");
            }
        }
    }
}
