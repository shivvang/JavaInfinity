package CoreJava;

// Java: Pure OOP (Object-Oriented Programming)

// Everything in Java revolves around classes and objects.

// No code exists outside a class.
// Even the main function must be inside a class.

// Java strictly follows 4 OOP principles:
// 1) Encapsulation
// 2)Inheritance
// 3)Polymorphism
// 4)Abstraction

// Java is Platform-Independent!

// Platform Independence means that Java programs can run on any operating system without modification.

// How?
// Java code is compiled into bytecode (.class files) using the Java Compiler (javac).
// This bytecode is then executed by the Java Virtual Machine (JVM), which is available on different platforms (Windows, macOS, Linux, etc.).
// The JVM takes care of running the bytecode on any machine, making the program platform-independent.

// 🎯 Key Takeaway:
 
// Write once, run anywhere (WORA).
// The Java bytecode works across all platforms that have a JVM.


// Java SDK (Software Development Kit)
// 📦 What is it?

// Java SDK (JDK) is a toolkit used to develop, compile, and run Java programs.
// It includes:
// 1) JRE (Java Runtime Environment): Runs Java applications.
// 2) Java Compiler (javac): Converts .java files into .class bytecode files.
// 3) Java Debugger (jdb): Debugging tool for Java programs.
// 4) Java Libraries & APIs: Pre-written code for common tasks.

// 1. Java File Naming Conventions

// Rule: The filename must match the public class name inside the file, followed by .java.

// Example:

// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello");
//     }
// }


// The file should be named Main.java.
// Why?

// Java is case-sensitive.
// The Java compiler (javac) requires the filename to match the public class name to identify the entry point of the program.
// During compilation, the class is converted to a .class file (e.g., Main.class).

// 🔑 Key Takeaway: Always name your file the same as your public class.




// 2. Structure of main Method

// a method is a block of code that performs a specific task.
//  It is a self-contained piece of code that can be called multiple times from different parts of a program, allowing for code reuse and modularity.
//  Methods are also known as functions or procedures.


// public static void main(String[] args) {
//     System.out.println("hello young lord");
// }


// 1️⃣ public

// Access Modifier: Allows the method to be accessed from anywhere (outside or inside the class).
// Why? The Java Virtual Machine (JVM) needs access to this method to start your program.

// 2️⃣ static

// static means: The main method belongs to the class itself, not to any specific object of the class.
// Why this is important:
// The JVM can directly call main using the class name (Main.main()) without creating an object.
// If it weren’t static, the JVM would need to create an object of the class to access main, which would add unnecessary complexity.

// 3️⃣ void

// Return Type: Method does not return anything.
// Why? main is not meant to return any value; it’s just the entry point.

// 4️⃣ main

// Method Name: The entry point of the Java program.
// Why? It’s a convention set by the Java designers. JVM looks for this exact method signature to run the program.


// 5️⃣ String[] args

// Parameter: An array of strings to accept command-line arguments.
// Why? Useful for passing arguments like filenames, configurations, etc., when starting the program.
// Example: java Main arg1 arg2

// 6️⃣ Method Body ({ ... })

// Contains the code to be executed.

//how java runs

// the Java compiler converts code into bytecode (.class), which the JVM runs within the JRE, where all libraries and runtime tools exist.

public class Main {
    public static void main(String[] args){
        System.out.println("hello young lord");
    }
}
