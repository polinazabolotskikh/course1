package Threads;

public class CThread extends Thread{
    Counter1 counter;

    public CThread(Counter1 counter){
        this.counter=counter;
    }
    public synchronized void run(){

        for (int i=0; i<1000;i++){
            counter.increment();
        }

    }
}
