package Regex;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMaching {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("a*b");
        Matcher m = p.matcher("aaab");
        boolean result = m.matches();
        System.out.println(result);


        Pattern pt = Pattern.compile("\\d+");
        Matcher mt = pt.matcher("123456");
        while(mt.find()){
            System.out.println(mt.group());
        }

        String str = Arrays.toString("Apple, Orange, banana".split("O"));
        System.out.println(str);


    }
}
