package classAndObject;

public class AboutClassAndObject {
    public static void main(String[] args) {
        // create an object and calling parameterize  constructor
        Human obj = new Human(21, 48.7F, (float) 5.3F,"Tej");

        // creating another object calling  no argument constructor
        Human ob = new Human();

        //function calling via an object
        obj.sleep();
        obj.eat();

        // data member calling via an objects
        String name = obj.name;
        System.out.println(name);
        int age = obj.age;
        System.out.println(age);
        float height = obj.height;
        System.out.println(height);
        float weight = obj.weight;
        System.out.println(weight);
        System.out.println("count object "+Human.cnt);
        //System.out.println("static method "+Human.update());
    }
}

class Human{
    //properties
    int age;
    float weight;
    float height;
    String name;
    static int cnt=0;
    //Behaviour
    void sleep(){
        System.out.println("Tej is Sleeping");
    }
    void eat(){
        System.out.println("Tej is eating");
    }

    // parameterize constructor
    Human(int age, float weight, float height, String name){
        cnt++;
        this.age=age;
        this.weight=weight;
        this.height=height;
        this.name=name;
    }
    // no argument contractor
    Human(){
        cnt++;
        System.out.println("No argument constractor :) ");
    }

    static void update(){
        cnt++;
    }
}
