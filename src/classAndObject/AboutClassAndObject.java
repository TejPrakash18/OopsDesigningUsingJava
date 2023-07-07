package classAndObject;

public class AboutClassAndObject {
    public static void main(String[] args) {
        Human obj = new Human(21, 48.7F, (float) 5.3F,"Tej");
        obj.sleep();
        obj.eat();
        String name = obj.name;
        System.out.println(name);
        int age = obj.age;
        System.out.println(age);
    }
}

class Human{
    //properties
    int age;
    float weight;
    float height;
    String name;
    //Behaviour
    void sleep(){
        System.out.println("Tej is Sleeping");
    }
    void eat(){
        System.out.println("Tej is eating");
    }
    Human(int age, float weight, float height, String name){
        this.age=age;
        this.weight=weight;
        this.height=height;
        this.name=name;
    }
}
