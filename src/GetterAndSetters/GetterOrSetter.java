package GetterAndSetters;

class Employee{
    private int eId;
    private String name = "Bhumi";
//getter
    void setEmp(int eId, String name){
         if (eId == 3){
             this.eId = eId;
         }
         if(name == "Gungun")
            this.name =name;
     }
     public int geteId(){
         return eId ;
     }
     public String getName(){
         return name;
     }
}
public class GetterOrSetter {
    public static void main(String[] args) {
        Employee obj = new Employee();
//        obj.setEmp(1, "kajal");
        obj.setEmp(2, "Bhumi");
        obj.setEmp(3, "Gungun");
        obj.setEmp(4, "Prerna");
        int res = obj.geteId();
        System.out.println(res);
        System.out.println(obj.getName());
//        String name = obj.getName();
//        System.out.println(name);

    }
}
