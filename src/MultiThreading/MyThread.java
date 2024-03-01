package MultiThreading;

class TThread implements Runnable
{
    public void run(){
        for (int i=1; i<=10;i++){
            System.out.println("Thread One "+i);
        }
    }
}

class NewThread implements Runnable{
    @Override
    public void run() {
        for(int i=1; i<=5;i++){
            System.out.println("Hello, I'm new Thread");
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
public class MyThread {
    public static void main(String[] args) {
        // create a thread by using runnable Interface
        TThread t = new TThread();
        Thread th = new Thread(t);

        NewThread t2 = new NewThread();
        Thread th2 = new Thread(t2);

        //multi Thread and creating a thread by Thread class
        MultiThead t1 = new MultiThead();


        th.start();
        t1.start();
        th2.start();
    }
}
