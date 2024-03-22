package BasicJavaQuestion;

import java.util.Scanner;

public class GCD {
    public static int gcd(int first,int sec){
        if (first == 0){
            return sec;
        }
        return gcd(sec%first, first);
    }
    public static void main(String[] args) {
        int ans = gcd(78, 66);
        System.out.println(ans);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two the number!");
        int first = input.nextInt();
        int sec = input.nextInt();

        int hcf = 1;
        if (sec > first){
            int temp = sec;
            sec = first;
            first = temp;
        }

        for (int i = 1; i <=sec ; i++) {
            if(first%i==0 && sec%i==0){
                hcf = i;
            }
        }
        System.out.println(hcf);


    }
}
