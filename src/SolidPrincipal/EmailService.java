//package SolidPrincipal;
//
//// Without SRP
//class User {
//    private String name;
//    private String email;
//
//    public void createUser(String name, String email) {
//        // Code to create a user
//    }
//
//    public void sendEmail(String message) {
//        // Code to send an email
//    }
//}
//
//// With SRP
//class User {
//    private String name;
//    private String email;
//
//    public void createUser(String name, String email) {
//        // Code to create a user
//    }
//}
//
//class EmailService {
//    public void sendEmail(String email, String message) {
//        // Code to send an email
//    }
//}

//Single Responsibility Principle (SRP): A class should have only one reason to change,
// meaning it should have only one responsibility.
// Without SRP
//class UserService {
//    public void createUser(String name, String email) {
//        // Code to create a user
//    }
//
//    public void sendEmail(String email, String message) {
//        // Code to send an email
//    }
//}

//// With SRP
//class User {
//    private String name;
//    private String email;
//
//    public void createUser(String name, String email) {
//        // Code to create a user
//    }
//}
//
//class EmailService {
//    public void sendEmail(String email, String message) {
//        // Code to send an email
//    }
//}




//Open/Closed Principle (OCP): Software entities (classes, modules, functions, etc.) should be open
//    for extension but closed for modification.

//// Without OCP
//class Shape {
//    public void draw() {
//        // Drawing logic
//    }
//}
//
//class Circle extends Shape {
//    @Override
//    public void draw() {
//        // Drawing logic for a circle
//    }
//}

//with OCP

//interface Shape {
//    void draw();
//}
//
//class Circle implements Shape {
//    @Override
//    public void draw() {
//        // Drawing logic for a circle
//    }
//}
//
//class Rectangle implements Shape {
//    @Override
//    public void draw() {
//        // Drawing logic for a rectangle
//    }
//}


//Liskov Substitution Principle (LSP): Objects of a superclass should be replaceable with
//objects of its subclasses without affecting the correctness of the program.
//
// Example:

//class Bird {
//    public void fly() {
//        // Flying logic
//    }
//}
//
//class Duck extends Bird {
//    @Override
//    public void fly() {
//        // Ducks cannot fly, violates LSP
//    }
//}


    //Interface Segregation Principle (ISP): Clients should not be forced to depend on interfaces
    //they do not use.
    //
    //Example:

// Without ISP
//interface Worker {
//    void work();
//    void eat();
//}
//
//class Robot implements Worker {
//    @Override
//    public void work() {
//        // Working logic for a robot
//    }
//
//    @Override
//    public void eat() {
//        // Robots do not eat, violates ISP
//    }
//}

//interface Worker {
//    void work();
//}
//
//interface Eater {
//    void eat();
//}
//
//class Robot implements Worker {
//    @Override
//    public void work() {
//        // Working logic for a robot
//    }
//}

//Dependency Inversion Principle (DIP): High-level modules should not depend on low-level
//modules. Both should depend on abstractions. Abstractions should not depend on details.
//Details should depend on abstractions.
//
//        Example:

// Without DIP
//class LightBulb {
//    public void turnOn() {
//        // Turn on the light bulb
//    }
//
//    public void turnOff() {
//        // Turn off the light bulb
//    }
//}


//class LightSwitch {
//    private LightBulb bulb;
//
//    public LightSwitch() {
//        this.bulb = new LightBulb(); // Violates DIP
//    }
//
//    public void flip() {
//        if (bulb.isOn()) {
//            bulb.turnOff();
//        } else {
//            bulb.turnOn();
//        }
//    }
//}



