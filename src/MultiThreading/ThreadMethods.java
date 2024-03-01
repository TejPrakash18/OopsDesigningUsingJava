package MultiThreading;

class MyThreadMethod implements Runnable{
    @Override
    public void run() {
        System.out.println("This is my Thread...:)");

        Thread t1 = Thread.currentThread();
        String tnamet=t1.getName();
        System.out.println(tnamet);

        t1.setName("MyThreadSetName :) ");
        System.out.println(t1.getName());

        try{
            Thread.sleep(2000);
        }
        catch (Exception e){
            System.out.println(e);
        };

        System.out.println(t1.getId());
    }

}

class ThreadInfo {

    void info(){
        Thread t3 = Thread.currentThread();
        String tnamet=t3.getName();
        System.out.println(tnamet);

        t3.setName("MyThreadName :) ");
        System.out.println(t3.getName());

        try{
            Thread.sleep(2000);
        }
        catch (Exception e){
            System.out.println(e);
        };

        System.out.println(t3.getId());

    }


}
public class ThreadMethods {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        String tname=t.getName();
        System.out.println(tname);

        t.setName("MyMain");
        System.out.println(t.getName());

        try{
            Thread.sleep(2000);
        }
        catch (Exception e){
            System.out.println(e);
        };

        System.out.println(t.getId());

        System.out.println("Program ended......:)");


        //
        System.out.println();
//        System.out.println("This is MyThreadMethod Information :) ");
//        MyThreadMethod t2 = new MyThreadMethod();
//        Thread th = new Thread(t2);
//        th.start();


        System.out.println();
        System.out.println("Thread Info");
        ThreadInfo ti = new ThreadInfo();
        ti.info();

    }
}
