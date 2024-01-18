package Threads;

public class CThread extends Thread{
    private final Object lock;
    Counter1 counter;

    public CThread(Object lock, Counter1 counter){
        this.counter=counter;
        this.lock=lock;
    }
    public void run(){
        synchronized (lock) {
            try{
            for (int i = 0; i < 1000; i++) {
                counter.increment();
                lock.notify();
            }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
