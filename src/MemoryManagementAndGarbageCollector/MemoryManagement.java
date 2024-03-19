package MemoryManagementAndGarbageCollector;

class Person{
    String name =  "Trishika";
    int age = 20;

    public void loveWords(){

        System.out.println(name +   " name is very peacefully and like as holy and her age : "+age );
    }
}
public class MemoryManagement {
    public static void main(String[] args) {
        int primitiveVariable = 10;
        Person obj = new Person();
//        obj1 = null
        obj.loveWords();
        String stringLiterals = "24";
        MemoryManagement memoryManagement = new MemoryManagement();
        memoryManagement.memoryManagementTest(obj);
    }

    public void memoryManagementTest(Person person){
        Person person1 = person;
        String stringLiterals =  "24";
        String stringLiterals1 = new String("24");

    }
}
