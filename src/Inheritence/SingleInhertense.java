package Inheritence;

class Human{
    int leg = 2;
    int eyes = 2;

    void sleep(){
        System.out.println("Sleeping is more imp.");
    }
}

class Male extends Human{
    void run(){
        System.out.println("Morning time is best time to running :)");
    }
}
public class SingleInhertense {
    public static void main(String[] args) {
        Male obj = new Male();
        obj.sleep();
        obj.run();
        System.out.println("I have "+obj.leg+" eyes");

        System.out.println("I have "+ obj.eyes+" legs");

    }
}
