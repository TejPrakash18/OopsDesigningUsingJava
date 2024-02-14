package ClassOrObject;
class Animal{
    int leg = 4;
    int head = 1;

    public void bark(){
        System.out.println("Bark");
    }

    public static void print(){
//        head;
    }
}
class Reference {
    int num ;
}

class MethodeIn{
    int a;//5

    public void setA(int a) {//5
        this.a = a;//5
    }
}
class Constructor{
    int n = 21;
    int n1;
    public Constructor(){
        System.out.println("Hello, I'm constructor");
    }
    public Constructor(int i){
        this();
        this.n1 = i; //n1= 1
    }
    public Constructor(int i,int j){
        this(1);
        this.n=i;
        this.n1=j; //n1-1, n1=8
    }

}

public class Dog {
     static class baby{
       static int num = 9;
    }
    static class baby2{
       static   int leg = 4;
    }
    public static void main(String[] args) {
        Animal ob = new Animal();
        System.out.println(ob.head);
        System.out.println(ob.leg);
        ob.bark();
//        baby obj = new baby();
//        System.out.println(obj.num);
//        baby2 obj1 = new baby2();
//        System.out.println(obj1.leg);
        System.out.println(baby2.leg);
        System.out.println(baby.num);

        Reference objr = new Reference();
        objr.num=4;
        System.out.println(objr.num);

        MethodeIn objm = new MethodeIn();
        objm.setA(5);
        System.out.println(objm.a);

        Constructor objc = new Constructor(12,8);
        Constructor obbc = new Constructor(10);
        System.out.println(obbc.n1);
        System.out.println(objc.n);
        System.out.println(objc.n1);




    }
}
// we are create a class outside the main methode
// and inside the class and outside the class both.
//when you create a class inside side the always
// create static and if you do not create any object,
// always create data member or data function are static