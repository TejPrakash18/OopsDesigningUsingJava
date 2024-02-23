package AbstractClasses;

abstract class Shapes{
    abstract void calculateArea();
    double area;
}

abstract class Square extends Shapes{
    void calculateArea(int side){
        area=side*side;
        System.out.println(area);
    }
}

abstract class Rectangle extends Shapes{
    void calculateArea(int length, int breadth){
        area= length*breadth;
        System.out.println(area);
    }
}

abstract class Triangle extends Shapes{
    void calculateArea(int base, int height){
        area=base*height / 2.0;
        System.out.println(area);
    }
}

abstract class Circle extends Shapes{
    void calculateArea(int radius){
        area= 3.14*(radius*radius);
        System.out.println(area + " cm");
    }
}
//class GetAnswerCircle extends Circle{
//    @Override
//    void calculateArea(int radius) {
//
//    }
//}

public class Area{
    public static void main(String args[]){
        System.out.println("hello");

        Circle objC = new Circle() {
            @Override
            void calculateArea() {

            }
        };
        objC.calculateArea(4);


    }
}
