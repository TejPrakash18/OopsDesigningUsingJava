package encapsulation;

public class WriteOnly {
    public static void main(String[] args) {
        WriteOnlyClass obj = new WriteOnlyClass();
        obj.setAmount(1000);
        System.out.println("set the amount");

    }
}

class WriteOnlyClass{
    private int amount;

    public void setAmount(int amount){
        this.amount = amount;
    }
}