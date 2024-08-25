Snippet 9:  
public class Main { 
    public static void main(String[] args) { 
        int class = 10; 
        System.out.println(class); 
    } 
} 
Error : identifier expected error

Language Rules: The Java language specification explicitly defines reserved keywords and their roles. Because these keywords have specific functions in the language, allowing them to be used as identifiers would create ambiguity and confusion for the compiler.
Syntax Ambiguity: If reserved keywords were allowed as identifiers, the compiler wouldn't be able to distinguish between the intended use of the keyword and its reserved function. For example, if class were allowed as a variable name, the compiler wouldn't know whether it's defining a class or referencing a variable.
================================================================================================================
Snippet 10:  
public class Main { 
    public void display() { 
        System.out.println("No parameters"); 
    } 
    public void display(int num) { 
        System.out.println("With parameter: " + num); 
    } 
    public static void main(String[] args) { 
        display(); 
        display(5); 
    } 
} 
 Error :non-static method display(int) cannot be referenced from a static context
        display(5);
==============================================================
Snippet 12:  
public class Main { 
    public static void main(String[] args) { 
        while (true) { 
            System.out.println("Infinite Loop"); 
        } 
    } 
} 
 What happens when you run this code? How can you avoid infinite loops? 

Will compile successfully but infinite loop will run.
==================================================================
 
Snippet 13:  
public class Main { 
    public static void main(String[] args) { 
        String str = null; 
        System.out.println(str.length()); 
    } 
} 
 What exception is thrown? Why does it occur? 
 
Error:Null Pointer exception.
================================================================
 
Snippet 14:  
public class Main { 
    public static void main(String[] args) { 
        double num = "Hello"; 
        System.out.println(num); 
    } 
} 
 What compilation error occurs? Why does Java enforce data type constraints? 

Error: error: incompatible types: String cannot be converted to double
        double num = "Hello"; 
==========================================================================================
Snippet 15:  
public class Main { 
    public static void main(String[] args) { 
        int num1 = 10; 
        double num2 = 5.5; 
        int result = num1 + num2; 
        System.out.println(result); 
    } 
} 
Error:/tmp/VeeSNLqdbp/Main.java:8: error: incompatible types: possible lossy conversion from double to int
    int result = num1 + num2; 

 What error occurs when compiling this code? How should you handle different data types 
in operations? 
 
 
 ================================================================================================
Snippet 16:  
public class Main { 
    public static void main(String[] args) { 
        int num = 10; 
        double result = num / 4; 
        System.out.println(result); 
    } 
} 
Result:2.0

=== Code Execution Successful ===
============================================================================================================
 What is the result of this operation? Is the output what you expected? 
Snippet 17:  
public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = a ** b; 
        System.out.println(result); 
    } 
} 
 What compilation error occurs? Why is the ** operator not valid in Java? 
 
Snippet 18:  
public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 5; 
        int result = a + b * 2; 
        System.out.println(result); 
    } 
} 
 What is the output of this code? How does operator precedence affect the result? 
 
Snippet 19:  
public class Main { 
    public static void main(String[] args) { 
        int a = 10; 
        int b = 0; 
        int result = a / b; 
        System.out.println(result); 
    } 
} 
 What runtime exception is thrown? Why does division by zero cause an issue in Java? 
 
 
Snippet 20:  
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World") ;
    } 
} 
 What syntax error occurs? How does the missing semicolon affect compilation? 

ErrOR:/tmp/4cJFu7w2Zi/Main.java:5: error: ';' expected
        System.out.println("Hello, World") 
                                          ^
 =============================================================================================
Snippet 21:  
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Hello, World!"); 
    // Missing closing brace here 
} 
 What does the compiler say about mismatched braces? 
===========================================================================================
Snippet 22:  
public class Main { 
    public static void main(String[] args) { 
        static void displayMessage() { 
            System.out.println("Message"); 
        } 
    } 
} 
Error:/tmp/EtjBkc0zYb/Main.java:5: error: illegal start of expression
        static void displayMessage() { 
===============================================================================
 What syntax error occurs? Can a method be declared inside another method? 
Snippet 23:  
public class Confusion { 
    public static void main(String[] args) { 
        int value = 2; 
        switch(value) { 
            case 1: 
                System.out.println("Value is 1"); 
            case 2: 
                System.out.println("Value is 2"); 
            case 3: 
                System.out.println("Value is 3"); 
            default: 
                System.out.println("Default case"); 
        } 
    } 
} 
 Error to Investigate: Why does the default case print after "Value is 2"? How can you prevent 
the program from executing the default case? 
 
 
 error:break statement is not presentnt.
=======================================================================================================
Snippet 24:  
public class MissingBreakCase { 
    public static void main(String[] args) { 
        int level = 1; 
        switch(level) { 
            case 1: 
                System.out.println("Level 1"); 
            case 2: 
                System.out.println("Level 2"); 
            case 3: 
                System.out.println("Level 3"); 
            default: 
                System.out.println("Unknown level"); 
        } 
    } 
} 
 Error to Investigate: When level is 1, why does it print "Level 1", "Level 2", "Level 3", and 
"Unknown level"? What is the role of the break statement in this situation? 
error:break statement is not presentnt.
===========================================================================================================
 
Snippet 25:  
public class Switch { 
    public static void main(String[] args) { 
        double score = 85.0; 
        switch(score) { 
            case 100: 
                System.out.println("Perfect score!"); 
                break; 
            case 85: 
                System.out.println("Great job!"); 
                break; 
            default: 
                System.out.println("Keep trying!"); 
        } 
    } 
} 
 Error to Investigate: Why does this code not compile? What does the error tell you about the 
types allowed in switch expressions? How can you modify the code to make it work?

error:The switch statement in Java only supports certain data types: int, short, char, byte, String, and their corresponding wrapper classes (Integer, Short, Character, Byte), as well as enum types.
Since double is a floating-point type, it cannot be used directly in a switch statement.
=============================================================================