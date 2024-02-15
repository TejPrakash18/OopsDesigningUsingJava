package Inheritence;

class Vehicle{
    int tier = 2;
    int gear = 4;
    void start(){
        System.out.println("Start......");
    }

    void run(){
        System.out.println("Running...."); //100cc
    }


}
class Bike extends Vehicle{
    String name ="bullet";

    void run(){
        System.out.println("flying......");//220cc
    }
}
class Bike1 extends Vehicle{
    String name ="Splender";
    void color(){
        System.out.println("Blue.....");
    }
}
public class HierarchicalInheritence {
    public static void main(String[] args) {
        Bike1 obj = new Bike1();
        System.out.println(obj.name);
        obj.run();
        obj.color();

        Bike objB = new Bike();
        System.out.println(objB.name);
        objB.run();

    }
}
