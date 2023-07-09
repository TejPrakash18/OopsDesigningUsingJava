package inhertance;

public class aboutInheritance {
    public static void main(String[] args) {
        Male obj =  new Male();
        obj.eat();
        obj.sleep();
    }
}

class Human{
    public void sleep(){
        System.out.println("I'm eating");
    }
}
class Male extends Human{
    public void eat(){
        System.out.println("I'm sleeping");
    }
}