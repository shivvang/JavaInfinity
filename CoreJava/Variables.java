// Java Editions:
// JSE (Java Standard Edition) -> Core Java (JVM, collections, multithreading, etc.)
// JEE (Java Enterprise Edition) -> JSE + Web APIs (Servlets, JSP, JPA, Transactions)
// JME (Java Micro Edition) -> APIs for mobile & embedded systems

// Rules for Java Classes:
// - Java file name must match the public class name.
// - A Java file can have multiple classes but only one public class.

// Why only one public class per file?
// - The main method must be in a public class for JVM access.
// - Multiple classes can have main methods, so restricting one public class avoids ambiguity.

// Java Characteristics:
// - Statically typed -> Type must be declared.
// - Strongly typed -> Type safety is enforced strictly.

// Variables:
// - Container that holds a value.
// - Syntax: DataType variableName = value;

// Naming Conventions:
// - Case-sensitive, can contain letters, digits, '_', '$'.
// - Cannot use reserved keywords (e.g., new, class, while, for, etc.).
// - Single-word variables: lowercase (e.g., age, name).
// - Multi-word variables: camelCase (e.g., firstName, lastName).
// - Constants: UPPER_CASE (e.g., MAX_VALUE, PI).

// Types of Variables:
// - Primitive (char, byte, short, int, long, float, double, boolean)
// - Non-Primitive (Class, Interface, Array, String)

// Primitive Data Types:
// char    -> 2 bytes (0 to 65535), default: '\u0000'
// byte    -> 1 byte (-128 to 127), default: 0
// short   -> 2 bytes (-32,768 to 32,767), default: 0
// int     -> 4 bytes (-2^31 to 2^31 - 1), default: 0
// long    -> 8 bytes (-2^63 to 2^63 - 1), default: 0 (use 'L' suffix)
// float   -> 4 bytes (IEEE 754), default: 0.0f (use 'f' suffix)
// double  -> 8 bytes (IEEE 754), default: 0.0d (use 'd' suffix)
// boolean -> 1 bit (true/false), default: false

// Type Conversion:
// - Widening (Automatic) -> Smaller to larger type (byte -> int -> long -> float -> double)
// - Narrowing (Explicit)  -> Larger to smaller type (requires casting)
// Example: int num = 128; byte smallNum = (byte) num;

// Variable Types:
// - Local Variables -> Declared inside methods or blocks.
// - Instance Variables -> Declared in a class, outside methods.
// - Static/Class Variables -> Declared with 'static' keyword, shared among all objects.

public class Variables {
    int instanceVariable; // Instance variable
    static int staticVariable = 100; // Static variable

    public static void main(String[] args) {
        // Local Variables
        char var = 'a';
        short thing;

        // Type casting (automatic)
        byte idk = 10;
        int something = idk; // byte -> int (widening)

        long varr = 100L;
        float umm = 63.20f;
        double varrr = 63.20d;

        // Integer promotion in arithmetic
        byte a = 127;
        byte b = 1;
        int sum = a + b; // Promoted to int

        int l = 10;
        double la = 20.0;
        double sumDouble = l + la; // Promoted to double

        int explicitSum = l + (int) la; // Explicit conversion

        System.out.println(sum);
    }
}

/* Summary:
1. Java has three editions: JSE (Core), JEE (Enterprise), JME (Mobile).
2. A Java file can have multiple classes but only one public class.
3. Java is statically and strongly typed.
4. Variable types: Primitive (char, int, float, etc.) and Non-Primitive (String, Array, etc.).
5. Widening conversions happen automatically; narrowing conversions require explicit casting.
6. Three types of variables: Local, Instance, Static.
*/
