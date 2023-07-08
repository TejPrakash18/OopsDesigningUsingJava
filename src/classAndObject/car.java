package classAndObject;

public class car {
    public static int tirecount;

    public void setdata(int tirecount){
        this.tirecount = tirecount;
    }
    public int getdata(){
        return tirecount;
    }

    public void display() {
        System.out.println("I am a car");
        System.out.println("I  have " + tirecount + " tires");
    }
}
//protected class Bike{
//
//}
//private class Racecar{
//
//
//}
