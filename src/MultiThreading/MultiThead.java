package MultiThreading;

public class MultiThead extends Thread{
    @Override
    public void run() {
        for (int i = 10; i>=1; i--) {
            System.out.println("Thread Two :) "+i);
        }
    }
}
