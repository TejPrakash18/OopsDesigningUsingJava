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
        System.out.println(area);
    }
}

public class Area{
    public static void main(String args[]){
        Square obj1= new Square(){
            @Override
            void calculateArea() {

            }
        };
        Rectangle obj2=new Rectangle(){
            @Override
            void calculateArea() {

            }
        };
        obj2.calculateArea(4,5);

        Triangle obj3= new Triangle(){
            @Override
            void calculateArea() {

            }
        };
        Circle obj4= new Circle(){
            @Override
            void calculateArea() {

            }
        };
        obj1.calculateArea(3);
        obj2.calculateArea(4,5);
        obj3.calculateArea(7,8);
        obj4.calculateArea(6);
    }
}
