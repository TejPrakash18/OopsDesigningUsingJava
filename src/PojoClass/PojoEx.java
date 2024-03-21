package PojoClass;

class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class PojoEx {
    public static void main(String[] args) {
        Person obj = new Person("Trishika", 21);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
        obj.setName("Gungun");
        obj.setAge(18);
        System.out.println(obj.getName());
        System.out.println(obj.getAge());

    }
}
