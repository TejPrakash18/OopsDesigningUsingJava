package ExceptionHandling;

public class DivideByZero {
    static void CheckAge(int age){
        if (age < 18) {
            throw new ArithmeticException("Access denied 😢");
        }
        else {
            System.out.println("Access granted :) ");
        }
    }
    public static void main(String[] args) {
        CheckAge(15);
        int num = 10;
        int num1 = 0;

//        int res = num/num1;
//        System.out.println(res);

        try
        {
            int res = num/num1;
            System.out.println(res);
        }catch (ArithmeticException e){
            System.out.println("can not divide by zero "+e);
        }
        finally {
            System.out.println("Rest of the code :) ");
        }

        try{
            int[] nums = {10,20,30};
            System.out.println(nums[2]);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
