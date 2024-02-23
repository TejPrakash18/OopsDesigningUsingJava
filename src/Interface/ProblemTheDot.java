package Interface;
interface Shapes {
    void square(double side);
}
interface RectangleShape{
    void rectangle(double length,double breadth);
}

class Answer implements Shapes{
    double area;
    @Override
    public void square(double side) {
        area=side*side;
        System.out.println(area);
    }
}
class AnswerRectangle implements RectangleShape{
    double area;

    @Override
    public void rectangle(double length, double breadth) {
        area= length*breadth;
        System.out.println(area);

    }
}
public class ProblemTheDot {
    public static void main(String args[]) {
        Shapes obj = new Answer();
        obj.square(5);

        RectangleShape obj1 = new AnswerRectangle();
        obj1.rectangle(4, 5);




    }
}

