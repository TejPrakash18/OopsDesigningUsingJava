package aboutOfAbstraction;

import org.w3c.dom.ls.LSOutput;

public abstract class abstraction {
    String color;

    public abstraction()
    {
        this.color = "Blue";
        System.out.println("Inside the class");
    }

    public abstract int area();
}

class Squre extends abstraction{
    int side;
    public Squre(){
        super();
        System.out.println("inside the abstract class");
        side =4;
    }
    @Override
    public int area(){
        return side*side;
    }
}

