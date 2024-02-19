package Encapsulation;

class ReadOnly{
    private int amount = 1000;
    int getAmount(){
        return amount;
    }
}

class WriteOnly{
    private String sign = "gunn";
    public void setSign(String sign){
        this.sign = sign;
        System.out.println(sign);
    }
}
public class ReadWriteClass {
    public static void main(String[] args) {

        ReadOnly ObjR = new ReadOnly();
        int res = ObjR.getAmount();
        System.out.println(res);
        WriteOnly objW = new WriteOnly();
        objW.setSign("Gungun");
    }
}
