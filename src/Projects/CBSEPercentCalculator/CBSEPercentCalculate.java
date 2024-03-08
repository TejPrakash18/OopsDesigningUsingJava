package Projects.CBSEPercentCalculator;

import java.util.Scanner;

class Student{
    private String name;
    private int[] marks;

    public Student(String name, int[] marks){
        this.marks = marks;
        this.name = name;
    }

    public double calculatePercentage(){
        int totalMarks = 0;
        for (int marks : marks){
            totalMarks+=marks;
        }
        return (double) totalMarks/marks.length;
    }

    public int totalMarks(){
        int totalMarks =0;
        for(int i : marks){
            totalMarks+=i;
        }
        return totalMarks;
    }
    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
public class CBSEPercentCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();


        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();
        int[] marks = new int[numSubjects];

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
        Student student = new Student(name, marks);
        double percentage = student.calculatePercentage();


        //get Marks function;
        int[] studentMarks = student.getMarks();
        System.out.print("Marks obtained: ");
        for (int i = 0; i < studentMarks.length; i++) {
            System.out.print(studentMarks[i]);
            System.out.print("/100 ");
            if (i != studentMarks.length - 1) {
                System.out.print(", ");
            }
        }


        System.out.println();

        System.out.println("Total marks  :) "+ student.totalMarks());

        System.out.println("Percentage for " + student.getName() + ": " + percentage + "%");
        double cgpa = percentage / 9.5;
        System.out.println("CGPA for "+ student.getName()+ ": "+ cgpa);


        //set name
        String newName = scanner.nextLine();
        student.setName("Bhumika");
        System.out.println("Name of student is :" +student.getName());


        scanner.close();
    }

}
