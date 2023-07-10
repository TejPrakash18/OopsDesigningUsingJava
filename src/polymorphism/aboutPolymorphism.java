package polymorphism;

public class aboutPolymorphism {
    public static void main(String[] args) {
        //object of compile time polymorphism
        CompileTimePolymorphism  obj = new CompileTimePolymorphism();
        obj.show();
        obj.show(9,1);

        //object of run time polymorphism
        OverRiding obj1 = new OverRiding();
        obj1.run();

        //object creation
        OverRide obj2 = new OverRide();
        obj2.run();



    }
}
class CompileTimePolymorphism{
    public void show(){
        System.out.println("Polymorphism , withOut overloaded");
    }
    public void show(int a, int b){
        System.out.println("method overloaded");
        System.out.println("Add two number using method overloaded "+ (a+b));

    }
}


// runtime polymorphism
class RunTimePolymorphism{
    public void run(){
        System.out.println("Running ");
    }

}
class OverRiding extends RunTimePolymorphism{
     public void run(){
         System.out.println("Override Method.....");
     }
}
class OverRide extends OverRiding{
    public void run(){
        System.out.println("Again override method......");
    }
}