package Polymorphism;
class WaterForm {
    // Method to convert water into gas
    public void gas() {
        System.out.println("Water is converting into gas.");
    }
    // Method overloading to convert solid and liquid states of water into gas
    public void gas(String state) {
        if (state.equalsIgnoreCase("solid")) {
            System.out.println("Solid water (ice) is converting into gas.");
        } else if (state.equalsIgnoreCase("liquid")) {
            System.out.println("Liquid water is converting into gas.");
        } else {
            System.out.println("Invalid state. Cannot convert.");
        }
    }
}
public class Water {
    public static void main(String[] args) {
        WaterForm obj = new WaterForm();
        obj.gas();
        obj.gas("solid");
        obj.gas("liquid");
        obj.gas("water");
    }
}
