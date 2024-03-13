package Projects.BmiCalculator;

import java.util.Scanner;

// Main class for the BMI calculator
public class BMICalculator {
    // Constants for BMI categories
    private static final String UNDERWEIGHT = "Underweight";
    private static final String NORMAL_WEIGHT = "Normal weight";
    private static final String OVERWEIGHT = "Overweight";
    private static final String OBESE = "Obese";

    // Method to calculate BMI
    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    // Method to determine BMI category
    public static String getBMICategory(double bmi) {
        if (bmi < 18.5) {
            return UNDERWEIGHT;
        } else if (bmi < 25) {
            return NORMAL_WEIGHT;
        } else if (bmi < 30) {
            return OVERWEIGHT;
        } else {
            return OBESE;
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Player 1 details:");
        System.out.print("Weight in kg: ");
        double weight1 = scanner.nextDouble();
        System.out.print("Height in meters: ");
        double height1 = scanner.nextDouble();
        double bmi1 = calculateBMI(weight1, height1);
        String bmiCategory1 = getBMICategory(bmi1);
        System.out.printf("Player 1 BMI: %.2f, Category: %s\n", bmi1, bmiCategory1);

        System.out.println("Enter Player 2 details:");
        System.out.print("Weight in kg: ");
        double weight2 = scanner.nextDouble();
        System.out.print("Height in meters: ");
        double height2 = scanner.nextDouble();
        double bmi2 = calculateBMI(weight2, height2);
        String bmiCategory2 = getBMICategory(bmi2);
        System.out.printf("Player 2 BMI: %.2f, Category: %s\n", bmi2, bmiCategory2);

        if (bmiCategory1.equals(OVERWEIGHT) || bmiCategory1.equals(OBESE) ||
                bmiCategory2.equals(OVERWEIGHT) || bmiCategory2.equals(OBESE)) {
            System.out.println("Both players are not eligible to fight due to overweight or obese.");
        } else {
            System.out.println("Both players are eligible to fight.");
        }

        scanner.close();
    }
}

//
//
//import java.util.Scanner;
//class CalcualteBMI{
//    private double weight;
//    private double height;
//    public double bmi;
//    public String name;
//    public String getName(){
//        this.name=name;
//        return name;
//    }
//    public void calculate(){
//        Scanner scanner =new Scanner(System.in);
//        System.out.println(" Enter ur name:");
//        name= scanner.nextLine();
//        System.out.println(getName()+" Enter your weight(in kg):");
//        weight=scanner.nextDouble();
//        System.out.println(getName()+" Enter your height(in inches):");
//        height=scanner.nextDouble();
//        bmi = 703*(weight/(height*height));
//        System.out.println(getName()+" your BMI is:"+bmi);
//
//    }
//
//    public void bmiStatus(){
//        this.bmi = bmi;
//        this.name = name;
//
//        if (bmi < 18.5){
//            System.out.println(getName()+" You are underweight");
//        }
//        else if (bmi >=18.5 && bmi< 24.9) {
//            System.out.println(getName() +" You have a normal weight");
//        }
//        else if (bmi >=25 && bmi< 29.9) {
//            System.out.println(getName() +" You are overweight");
//        }
//        else {
//            System.out.println(getName()+" You are obesity");
//        }
//    }
//
//}
//public class BMICalculator {
//    public static void main(String args[]) {
//        CalcualteBMI info = new CalcualteBMI();
//        info.calculate();
//        info.bmiStatus();
//    }
//}