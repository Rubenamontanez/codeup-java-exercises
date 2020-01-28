import java.util.jar.JarOutputStream;
import java.util.Scanner;


public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("Hello, World!");
        System.out.print("\n");
        System.out.print("Hello, World!");
        System.out.print("\n");
//      TODO    1.  Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 2;
        System.out.print(myFavoriteNumber);
        System.out.print("\n");
//      TODO 2.  Create a String variable named myString and assign a string value to it, then print the variable out to the console.

//      TODO 3.  Change your code to assign a character value to myString. What do you notice?
//       This is the code that came out when attempting to change to char Error:(13, 25)
//       java: incompatible types: java.lang.String cannot be converted to char

//       TODO 4. Change your code to assign the value 3.14159 to myString. What happens
        String myString = "Some words";
        System.out.println(myString);
//        TODO. 5. Declare an long variable named myNumber, but do not assign anything to it.
//        Next try to print out myNumber to the console. What happens?
//        THis is the output given when the code attempts to execute
//        Error:(23, 28) java: variable myNumber might not have been initialized

//        TODO 6. Change your code to assign the value 3.14 to myNumber. What do you notice?
//        THis is the output given when the code attempts to execute
//        Error:(26, 25) java: incompatible types: possible lossy conversion from double to long

//       TODO 7.  Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.

//        stating that L is the long version creating a long and putting it in a long box
//       TODO 8.  Change your code to assign the value 123 to myNumber
//        Why does assigning the value 3.14 to a variable declared as a long not compile,
//        but assigning an integer value does?

//       3.14 is interpeted to be  a literal double doesnt fit into a long. int fits in a long location
//       TODO 9. Change your code to declare myNumber as a float. Assign the value 3.14 to it.
//       What happens?
//        answer1: declared as a float gives it a decimal point logging 123.0
//        What are two ways we could fix this?
//        answer2: declare it byte or short
            short myNumber = 123;
            System.out.println(myNumber);
//       TODO 10. Copy and paste the following code blocks one at a time and execute them

//        int x = 5;
//        System.out.println(x++); /*  produces the number 5*/
//        System.out.println(x);   /*  produces the number 6*/

//        int x = 5;
//        System.out.println(++x);   /*  produces the number 6*/
//        System.out.println(x);     /*  produces the number 6*/

//       TODO 11. Try to create a variable named class. What happens?
//        Error:(52, 14) java: <identifier> expected
//        Error:(55, 2) java: reached end of file while parsing
//        class;

//       TODO 12.  Object is the most generic type in Java. You can assign any value to a variable of type Object.
//       What do you think will happen when the following code is run?

//        Exception in thread "main" java.lang.ClassCastException: class java.lang.
//        String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
//        at HelloWorld.main(HelloWorld.java:59)
//        Error:(62, 27) java: incompatible types: java.lang.String cannot be converted to int
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three";
//        System.out.println(three);
//       13. Rewrite the following expressions using the relevant shorthand assignment operators:
        int w = 4;
//        x = x + 5;
        System.out.println(++w);

//        int x = 3;
//        int y = 4;
//        y = y * x;
//        System.out.println(y *= );

        int x = 10;
        int y = 2;
//        x = x / y;
//        y = y - x;
        System.out.println(x /= y);
        System.out.println(y -= x);

//        14. What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold?
//        What happens if you increment a numeric variable past the type's capacity?
//              If you try to store a value bigger than a variable of a given type can store then you will either be
//               warned at compile time or when you run the program. You can opt to reduce the range or precision of a value so
//              that it will fit into the variable using a cast - more of which later.
//
//              In practice the amount of memory a single variable takes up isn't an issue but when you are allocating lots of
//              variable of the same type, in particular when you create an array (see the next chapter) this can become an issue.

//              What happens if you increment a numeric variable past the type's capacity?
//              that holds the maximum value for the int type.
//              It will wrap the integer value
//               Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later)

//              int x = 2147483647;
//               x++;
//              if you now print out x, it will have the value -2147483648.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
//        String userInput = scanner.next();
        String userInput = scanner.nextLine();

        System.out.println("You entered: --> \"" + userInput + "\" <--");


    }
}


//complete the assignment re ran code


//public class HelloWorld {
//    public static void main(String[] args) {
//        System.out.print("Hello, World!");
//    }
//}
