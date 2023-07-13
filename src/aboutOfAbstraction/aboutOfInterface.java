package aboutOfAbstraction;

import java.util.Scanner;

public class aboutOfInterface {
    public static void main(String[] args) {
        ShapeArea obj = new ShapeArea();
        obj.squre();
        obj.circle();
    }
}
interface Area{
    public void squre();
    public void circle();
}

class ShapeArea implements Area{
    @Override
    public void squre() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a*b);
    }
    @Override
    public void circle(){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int ans = (int) (2*3.15*r);
        System.out.println(ans);
    }
}
