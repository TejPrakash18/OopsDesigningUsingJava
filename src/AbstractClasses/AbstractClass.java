package AbstractClasses;

abstract class LanguageOne{
     static void method1(){
        System.out.println("I'm non- abstract method");
    }
      abstract void method2();
}
class Createobj extends LanguageOne  {
    @Override
    void method2() {
        System.out.println("Hello I'm abstract methode");
    }
}
class Problem{
    public static void hello(){
        System.out.println("Hello, Annie :) ");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        System.out.println("Hello");
        Problem.hello();


//        LanguageOne obj = new LanguageOne(){
//            @Override
//            void method2() {
//                System.out.println("Hello11");
//            }
//        };
//        obj.method1();
//        obj.method2();
//        AbstractClass obj = new AbstractClass();
//        obj.method1();
//        Createobj obj = new Createobj();
//        obj.method1();
//        obj.method2();
        LanguageOne.method1();
    }
}
