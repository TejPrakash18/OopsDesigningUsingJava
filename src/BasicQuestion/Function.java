package BasicQuestion;

import java.util.Scanner;

public class Function {
    static String TimeConvert(int num){
        int hours = num/60;
        int minutes = num%60;

        return hours + ":" + minutes;
    }
    public static void main (String[] args){
        Scanner  s = new Scanner(System.in);
        System.out.print(TimeConvert(s.nextInt()));
    }

}
