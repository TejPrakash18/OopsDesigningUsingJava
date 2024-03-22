package BasicJavaQuestion;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Name "+name);
        String name1 = input.next();
        System.out.println("\n");
        System.out.println("Name1 "+name1);
        int age = input.nextInt();
        System.out.println("Age "+ age);
//        System.out.println("\n");
        String name2 = input.nextLine();
        System.out.println("Name2 "+name2);
        String name3 = input.next();
        System.out.println("Name3 "+name3);


//        System.out.println("Enter your name");
//        String name = input.nextLine();
//        System.out.println(name);
//        System.out.println("Enter your age");
//        int age = input.nextInt();
//        System.out.println("your input is here "+age);
//        String name1 = input.next();
//        System.out.println(name1);
//        int number = input.nextInt();
//        System.out.println(number);
//        String name2 = input.next();
//        System.out.println(name2);
//        double data = input.nextDouble();
//        System.out.println(data);

//        String name = input.next(); // gungun
//        String name1 = input.nextLine(); //kajal
//        System.out.println( name1);

    }
}

