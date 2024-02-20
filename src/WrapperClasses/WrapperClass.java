package WrapperClasses;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class WrapperClass {
    public static void main(String[] args) {
        Integer myNum = 5;
        Character myChar = 'A';
        Float myFloat = 4.5F;

        System.out.println(myNum.intValue());
        System.out.println(myChar);
        System.out.println(myFloat);

        Integer myInt = 100;
        System.out.println(myInt);
        String myString = myInt.toString();
        System.out.println(myString.length());



        LocalDateTime obj = LocalDateTime.now();
        System.out.println(obj);


    }
}
