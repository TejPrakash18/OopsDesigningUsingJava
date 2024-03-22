package BasicJavaQuestion;

public class SwapTwoVariables {
    public static void main(String[] args) {
        int a = 5 , b= 7;
        System.out.println("before "+ a + " "+ b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After "+ a + " " +b );
        b= a+b-(a=b);
        System.out.println("Prerna "+ a +" " + b);
    }
}
