package classAndObject;

public class Animal {
        int legs = 4;
        int ears = 2;
        void sleep (){
            System.out.println("Dog is sleep");
        }

    public static void main(String[] args){
        Animal Tom = new Animal();
        System.out.println(Tom.legs);
        System.out.println(Tom.ears);
        Tom.sleep();

    }
}
