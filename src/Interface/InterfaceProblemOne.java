package Interface;
interface A
{
    void myMethod();
}

class B
{
    public void myMethod()
    {
        System.out.println("My Method");
    }
}

class C extends B implements A
{

}


public class InterfaceProblemOne {
    public static void main(String[] args)
    {
        A a = new C();

        a.myMethod();
    }
}
