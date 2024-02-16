package Polymorphism;

class Animal{
    void sound(){
        System.out.println("Animal make a sound...");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
class Cat extends Animal{
    @Override
    void sound() {
        System.out.println("cat meows...");
    }
}
class CatBaby extends Animal{
    @Override
    void sound() {
        super.sound();
        System.out.println("hey I'm baby cat");
    }
}
class BabyDog{
    void hello(){
        System.out.println("I'm Baby Dog");
    }
    void hey(){
        System.out.println("hey");
        hello();
    }

}
public class MethodOverring {
    public static void main(String[] args) {
        Dog objD = new Dog();
        objD.sound();
        Cat objC = new Cat();
        objC.sound();

        CatBaby objCB = new CatBaby();
        objCB.sound();

        BabyDog objBD = new BabyDog();
        objBD.hello();
        objBD.hey();
    }
}
