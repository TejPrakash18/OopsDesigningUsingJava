package accessModifiers;


//When you create more than public class show the error (compile time error)
// there is ambiguity error, that means compiler is confused which class are same as
// file name.
public class PublicClass {
    public static void main(String[] args) {
        System.out.println("Hello public keyword....!");
    }
}
//public class Human{
//
//}
//type of access modifiers <= access modifiers means are accessbilty of class
//                              or state, behaviour, that scope of variable or
//                               behaviour, state etc.... access modifier are two type
// access modifiers or non-access modifiers



//access modifiers
// 1.public keyword <= access anywhere
// 2. private  <= access only class
// 3. protected <= access only within package
// 4. default <=  acces only inside the package and outside package with the help child class


//non-access modifiers
//static, abstract, native, volatile, transient, synchronized