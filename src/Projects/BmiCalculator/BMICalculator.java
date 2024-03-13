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
