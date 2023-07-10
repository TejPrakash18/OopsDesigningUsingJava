package encapsulation;

public class aboutOfEncapsulation {
    public static void main(String[] args) {
        DataPrivacy obj = new DataPrivacy();
        //not accessible blc of private data member
        //if you want to access create getter and setter
        //obj.age =10;

        //when create getter and setter
        obj.setter(10);
        System.out.println(obj.getter());



    }
}

class DataPrivacy{
    private int age;

    public void setter(int age){
        this.age=age;
    }
    public int getter(){
        return age;
    }


}