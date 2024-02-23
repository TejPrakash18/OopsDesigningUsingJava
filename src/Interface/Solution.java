package Interface;

interface Language{
    void version();
     void getType();
}
class JAVA implements Language{
    @Override
    public void version() {
        System.out.println(1.90);
    }

    @Override
    public void getType() {
        System.out.println("Programing language");
    }
}
public class Solution {
    public static void main(String[] args) {

        JAVA obj = new JAVA();
        obj.getType();
        obj.version();
    }
}
