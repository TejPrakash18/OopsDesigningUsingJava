package accessModifiers;

public class GetterAndSetter {
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.seteId(101);
        obj.seteName("Tej");
        System.out.println(obj.geteId());
        System.out.println(obj.geteName());

    }
}

class Employee{
    private int eId;
    private String eName;


   public void seteId(int eld){
        this.eId = eld;
    }
    int geteId(){
        return eId;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }
    String geteName(){
       return eName;
    }
}