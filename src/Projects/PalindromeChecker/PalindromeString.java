package Projects.PalindromeChecker;

import java.util.Scanner;

class HasPalindromeString{
    private String str;

//    public HasPalindromeString(String str){
//        this.str = str;
//    }

    public boolean isPalindrome(){
        boolean hasPalindrome = true;
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine().toLowerCase();
        int start = 0;
        int end = str.length()-1;

        while (start<=end){
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }
            else {
                return false;
            }
        }
        return hasPalindrome;
    }
}
public class PalindromeString {
    public static void main(String[] args) {
        System.out.println("Check Palindrome String)");
        HasPalindromeString obj = new HasPalindromeString();
        boolean ans = obj.isPalindrome();
        if (ans== true){
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }
    }
}




//Problem Statement : Palindrome checker
//    Write a program that checks if a given String is a palindrome (reads the same forwards and backwards)
//    using command line interface

//Requirements  :
//    Provide a feedback true or false.
//    cmd line Application
//    end of the application when return true or false,
//


//Input format:  String Type

//Solution
//    class ->