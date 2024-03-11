// Boilerplate code
// public class JavaBasics {
//     public static void main(String args[]) {

//     }
// }

// Output in java
// public class JavaBasics {
//     public static void main(String args[]) {
//         System.out.println("Hello World");
//         System.out.print("This is a simple print function without linebreak ----- ");
//         System.out.println("This is a println function with a line break");
//         System.out.print("Hello again\n");  // \n is also used for new line
//         System.out.print("Hello Hello Hello");
//     }
// }

// Print the pattern by using output in java
// public class JavaBasics {
//     public static void main(String args[]) {
//         System.out.println("* * * *");
//         System.out.println("* * *");
//         System.out.println("* *");
//         System.out.println("*");
//     }
// }

// Variables are the properties which can take any value, means variables are changable
// Variables in java are the named memory location where we can store any value
// Literals in java are those whose value does not change like:
// Number lirerals       --> 2, 3, 4 etc.
// Character literals    --> 'a', 'b', 'C' etc.
// Character literals    -->  @, *, % etc.       // these are special characters

// Identifiers in java used to identify something by it's name.
// eg: variable name - int a = 10; here a is identifier
//     function name, class name etc are also identifiers

// public class JavaBasics {
//     public static void main(String args[]) {
//         int a = 10;
//         int b = 5;
//         String name = "Rishabh Tyagi";
//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(name);
//         // lets change the value of a 
//         a = 50;
//         System.out.println(a);
//     }
// }

// Data Types in java -- there are basically 2 types of data types in java
// 1. Primitive - which already exist in java means we not need to create them
// 2. Non-Primitive - which we need to create to use in java
//              1       2      3     4    5         6      7          8
// Primitive - char -- byte, short, int, long, -- float, double, -- boolean

//                   1      2       3       4       5
// Non-primitive - Array, String, Class, Object, Interface

// public class JavaBasics {
//     public static void main(String args[]) {
//         byte b = 8;                      // only 256 numbers can be stored in this
//         System.out.println(b);
//         short sh = 240;                  // bigger than byte but shorter than int
//         System.out.println(sh);
//         char ch = 'a';                   // all characters can be stored whether lower or upper
//         System.out.println(ch);
//         boolean val = true;              // stores only two values [true] or [false]
//         System.out.println(val);
//         int number = 26;                 // used to store numbers without decimal values  
//         System.out.println(number);
//         float price = 1.5f;              // used to store numbers with decimal values
//         System.out.println(price);
//         long lg = 24565543444l;          // used to store numbers bigger than int
//         double db = 10.5;                // usde to store decimal numbers bigger than float
//     }
// }
// Imp. Note --> by default the data type for decimal numbers is double and for numbers is int
// eg:   long a = 12344    -- this is by dafault int -- to make it long add 'l' after the number
//       float b = 10.5    -- this is by default double -- to make it float add 'f' after the number

// Comments in java 
// single line comments by ->  //
// multiline comments by   ->  /*   anything between these will be comment out   */

// Input in java -- Scanner class is used to take input in java program

// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         // String name = sc.next();          // next() only captures the single word until space
//         // System.out.println(name);
//         String fullName = sc.nextLine();     // nextLine() captures the whole string paragraph whatever the user enters
//         System.out.println(fullName);
//         // other function of sc object are:
//         float price = sc.nextFloat();
//         int number = sc.nextInt();
//         long num = sc.nextLong();
//         double pr = sc.nextDouble();   // and there are also functions for short, boolean, etc. go through notes.
//         sc.close();
//     }
// }

// Type conversion in java: - widening conversion / implicit conversion 
// conversion happens when:
// a. type compatible
// b. destination type > source type
// byte -> short -> int -> float -> long -> double
// public class JavaBasics {
//     public static void main(String args[]) {
//         int a = 25;
//         float b = a;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }

// Type casting in java: - narrowing conversion / explicit conversion
// public class JavaBasics {
//     public static void main(String args[]) {
//         float a = 25;
//         int b = (int) a;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }

// Type promotion in java
// Java code automatically promotes each byte, short, or char operand to int when evaluating an expression
// If one operand is long, float or double, the whole expression is promoted to long, float or double respectively.