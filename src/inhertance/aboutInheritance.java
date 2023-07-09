package inhertance;

public class aboutInheritance {
    public static void main(String[] args) {
        // single inheritance object
        BMW obj =  new BMW();
        obj.start();
        obj.run();

        // multilevel inheritance

        System.out.println("\nMultilevel inheritance exps.");
        Splendor objBike = new Splendor();
        objBike.color ="Black";
        objBike.gear = 4;
        objBike.rating = 9;
        System.out.println("Bike color"+objBike.color);
        System.out.println("Bike gear"+objBike.gear);
        System.out.println("Bike rating"+objBike.rating);

        objBike.intro();
        objBike.runbike();
        objBike.breakbike();


    }
}
//single inheritance
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

//multilevel inheritance

class Bike{
    int gear;
    String color;
    public void runbike(){
        System.out.println("Bike is running on the road");
    }
    public void breakbike(){
        System.out.println("Bike is stop when use break");
    }
}

class Hero extends Bike{
    int rating;
}

class Splendor extends Hero {
    public void intro(){
        System.out.println("This is splendor");
    }
}