package classAndObject;

public class accessModifiers {
    public static void main(String[] args) {
        car obj = new car();
        car.tirecount =4;
        obj.display();

    }
}

class car{
    public static int tirecount;
    public void display(){
        System.out.println("I am a car");
        System.out.println("I  have "+ tirecount +" tires");
    }
}

