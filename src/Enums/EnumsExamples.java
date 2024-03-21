package Enums;

enum Day{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,THURSDAY, FRIDAY, SATURDAY
}
enum Size{
    SMALL, MEDIUM, LARGE
}

 enum Months{
    JAN, FEB, MARCH
}
public class EnumsExamples {
    public static void main(String[] args) {
        Day today = Day.THURSDAY;
        if (today == Day.FRIDAY) {
            System.out.println("it's thursday");
        }
        else {
            System.out.println("today is "+ today);
        }
        System.out.println(Size.MEDIUM);

        System.out.println(Months.JAN);

    }
}
