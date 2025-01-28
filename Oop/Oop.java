package Oop;

// ===============================
// OBJECTS AND CLASSES IN JAVA
// ===============================

// OOP (Object-Oriented Programming) consists of four main pillars:
// 1) Data Abstraction
// 2) Encapsulation
// 3) Inheritance
// 4) Polymorphism

// =================================
// WHAT ARE OBJECTS AND CLASSES?
// =================================

// - An object is an instance of a class.
// - Objects have properties (state) and behaviors (methods).
// - A class is a blueprint for creating objects.

// Example: A car is an object because it has:
// Properties: color, type, brand, weight, etc.
// Behaviors: apply brake, drive, increase speed, etc.

// =====================================================
// PILLAR 1: DATA ABSTRACTION (Hiding Implementation)
// =====================================================

// - Abstraction hides the implementation details and only shows the essential functionality.
// - Achieved through abstract classes and interfaces.

// Example: A car’s braking system – we know pressing the brake reduces speed, but we don’t know the internal mechanics.

// CODE EXAMPLE: ABSTRACTION
abstract class Car {
    abstract void applyBrakes(); // Abstract method (implementation hidden)
}

class Tesla extends Car {
    @Override
    void applyBrakes() {
        System.out.println("Tesla uses regenerative braking!");
    }
}

// =====================================
// PILLAR 2: ENCAPSULATION (Data Hiding)
// =====================================

// - Encapsulation bundles data and methods into a single unit (class).
// - Achieved by declaring variables private and providing public getters and setters.

// CODE EXAMPLE: ENCAPSULATION
class BankAccount {
    private double balance; // Private variable (cannot be accessed directly)

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

// ======================================
// PILLAR 3: INHERITANCE (Code Reusability)
// ======================================

// - Inheritance allows a class to inherit fields and methods from another class.
// - Achieved using the `extends` keyword.
// - Types: Single, Multilevel, Hierarchical, Multiple (via interfaces).

// CODE EXAMPLE: SINGLE INHERITANCE
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// CODE EXAMPLE: MULTILEVEL INHERITANCE
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy weeps");
    }
}

// CODE EXAMPLE: MULTIPLE INHERITANCE (Using Interfaces)
interface Engine {
    void start();
}

interface Wheels {
    void rotate();
}

class Vehicle implements Engine, Wheels {
    public void start() {
        System.out.println("Engine starting...");
    }
    public void rotate() {
        System.out.println("Wheels rotating...");
    }
}

// ======================================
// PILLAR 4: POLYMORPHISM (Many Forms)
// ======================================

// - Allows one function to have different behaviors based on context.
// - Two types: Compile-time (Method Overloading) & Runtime (Method Overriding).

// CODE EXAMPLE: COMPILE-TIME POLYMORPHISM (Method Overloading)
class MathOperations {
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
}

// CODE EXAMPLE: RUNTIME POLYMORPHISM (Method Overriding)
class Parent {
    void show() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child class");
    }
}

// =================================================
// OBJECT RELATIONSHIPS IN OOP
// =================================================

// 1) IS-A RELATIONSHIP (Inheritance Example)
// - A Dog IS-A Animal because it inherits from the Animal class.

// 2) HAS-A RELATIONSHIP (Composition & Aggregation Example)
// - A Car HAS-A Engine (Composition: The engine cannot exist without the car)

// CODE EXAMPLE: HAS-A RELATIONSHIP
class EngineComponent {
    void run() {
        System.out.println("Engine is running");
    }
}

class CarWithEngine {
    private EngineComponent engine; // HAS-A relationship

    CarWithEngine() {
        engine = new EngineComponent();
    }
    
    void startCar() {
        engine.run();
        System.out.println("Car is moving");
    }
}

// ===============================
// MAIN METHOD TO TEST ALL CLASSES
// ===============================
public class Oop {
    public static void main(String[] args) {
        // Testing Abstraction
        Car myCar = new Tesla();
        myCar.applyBrakes();

        // Testing Encapsulation
        BankAccount acc = new BankAccount();
        acc.deposit(500);
        System.out.println("Balance: " + acc.getBalance());
        
        // Testing Inheritance
        Dog myDog = new Dog();
        myDog.makeSound();
        myDog.bark();
        
        // Testing Multilevel Inheritance
        Puppy myPuppy = new Puppy();
        myPuppy.weep();
        
        // Testing Multiple Inheritance (Interfaces)
        Vehicle myVehicle = new Vehicle();
        myVehicle.start();
        myVehicle.rotate();
        
        // Testing Compile-time Polymorphism
        MathOperations math = new MathOperations();
        System.out.println("Sum (int): " + math.add(5, 10));
        System.out.println("Sum (double): " + math.add(5.5, 10.5));
        
        // Testing Runtime Polymorphism
        Parent parent = new Child();
        parent.show();
        
        // Testing HAS-A Relationship
        CarWithEngine myCarWithEngine = new CarWithEngine();
        myCarWithEngine.startCar();
    }
}
