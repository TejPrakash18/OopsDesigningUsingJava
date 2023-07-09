package inhertance;

public class aboutInheritance {
    public static void main(String[] args) {
        BMW obj =  new BMW();
        obj.start();
        obj.run();
    }
}

class Car{
    public void start(){
        System.out.println("I'm ready to start");
    }
}
class BMW extends Car{
    public void run(){
        System.out.println("I'm on running mode");
    }
}