package LambdaExpression;

interface MyInterface{
    void myMethod();
}
interface Addable{
    int add(int a,int b);
}
public class LambdaExpression {
    public static void main(String[] args) {
        MyInterface my =()-> System.out.println("My method");
        System.out.println(my);
        my.myMethod();
        Addable add =(a,b)->(a+b); // methode overriding
        System.out.println(add.add(10,20));

    }
}
