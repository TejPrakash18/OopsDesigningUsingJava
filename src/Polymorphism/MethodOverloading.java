package Polymorphism;

class Addition{
    void add(int a, int b){
        int res = a+b;
        System.out.println(res);
    }
    void add(int a,double b){
        System.out.println(a+b);
    }
    void add(double a, double b){

        System.out.println(a+b);
//        add(2.3, 3.3);
    }
    void hello() {
        String h = "Hello";//key
        if (h == "Hello") {
            System.out.println("hello...");
        }

    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Addition obj = new Addition();
        obj.add(2, 4);
        obj.add(2,2.3 );
        obj.add(2.3, 2.2);
        obj.hello();
    }
}
