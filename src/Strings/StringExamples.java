package Strings;

import java.util.Scanner;

public class StringExamples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= 5;
//
//        char[] names = new char[n];
//        for (int i = 0; i < n; i++) {
//            names[i] = input.next().charAt(i);
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.println(names[i]);
//        }
//
        String[] nameArray = new String[n];
        nameArray[0] = "Gungun";


//        for (int i = 0; i < nameArray.length; i++) {
//            nameArray[i] = input.nextLine();
//        }
//        for (int i = 0; i < nameArray.length; i++) {
//            System.out.println(nameArray[i]);
//        }
        String nan = new String("Hello");
        System.out.println(nan.substring(3,5));


        StringBuffer str = new StringBuffer("Hello ");
        str.append(" Gungun ");
        str.insert(1, " hey ");
        System.out.println(str);


//        for (int i=0;  i<=str.length(); i++){
//            str.append(i);
//        }

        String name = new String("Hey I'm string ");
        System.out.println(name);


//        [] == Array
    }
}
