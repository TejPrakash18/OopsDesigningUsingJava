package encapsulation;

public class ReadOnly {
    public static void main(String[] args) {
        ReadonlyClass obj = new ReadonlyClass();
        System.out.println(obj.getName());

    }
}

class ReadonlyClass{
    private String name = "Tej";

    public String getName(){
        return name;
    }
}