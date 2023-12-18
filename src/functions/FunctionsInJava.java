package functions;

public class FunctionsInJava {
    static void sum(int a, int b){
        System.out.println(a+b);
    }
    static int add(int num1, int num2){
        return num1+num2;
    }
    void sub(int a, int b){
        System.out.println(a-b);
    }
    public static void main(String[] args) {
        sum(2,3);
        System.out.println(add(4,5));
        new FunctionsInJava().sub(5,2);
    }
}

