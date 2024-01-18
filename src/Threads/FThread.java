package Threads;

public class FThread extends Thread{
    private Object lock;

    public FThread(Object object) {
        this.lock = object;
    }
    public  void run(){
        while (true) {
            synchronized (lock) {
                try {
                    //for(;;){
                    System.out.println(""+Thread.currentThread().getName());
                    lock.notify();
                    lock.wait();//}
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

