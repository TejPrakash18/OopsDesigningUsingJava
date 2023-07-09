package polymorphism;

public class aboutPolymorphism {
    public static void main(String[] args) {
        //object of compile time polymorphism
        CompileTimePolymorphism  obj = new CompileTimePolymorphism();
        obj.show();
        obj.show(9,1);

        //object of run time polymorphism



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

class RunTimePolymorphism{

}