package Inheritence;

import com.sun.security.jgss.GSSUtil;

class Animal{
    int legs = 4;
    int eyes = 2;

    int ears = 2;

    void eat(){
        System.out.println("I like bread");
    }
    void sleep(){
        System.out.println("I'm go to sleep");
    }
}

class Dog extends Animal{

    void bark(){
        System.out.println("Barking....");
    }

    void walk(){
        System.out.println("this time I'm going to walking");
    }
}

class BabyDog extends Dog{
    void weep(){
        System.out.println("weeping.....");
    }
    void drink(){
        System.out.println("I wanna milk....");
    }

//    void walk(){
//        System.out.println("morning time my sleeping time");
//    }

}
public class MulilableInheritense {
    public static void main(String[] args) {
        BabyDog obj = new BabyDog();
        System.out.println("I have "+obj.eyes+" eyes");
        System.out.println("I have "+obj.ears+" ears");
        System.out.println("I have "+obj.legs+" legs");
        obj.weep();
        obj.drink();
        obj.sleep();
        obj.eat();
        obj.walk();
        obj.bark();

    }
}
