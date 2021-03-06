import java.math.BigInteger;
import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {


    public static void main(String[] args) {
//        System.out.println(addS(2, 3));
//        System.out.println(subS(2,3));
//        System.out.println(mulT(2,3));
//        System.out.println(divI(2,3));
          System.out.print("Enter a number between 1 and 10: ");
        System.out.println("userInput = " + getInteger(1, 10));
//        rollTheDice();
//        multLoop();
    }

//        TODO: 1
//         Basic Arithmetic Create four separate methods. Each will perform an arithmetic operation:
//         Addition Subtraction Multiplication Division
//         Each function needs to take two parameters/arguments so that the operation can be performed.
//         Test your methods and verify the output.Add a modulus method that finds the modulus of two numbers.
//         Food for thought: What happens if we try to divide by zero? What should happen?
//         Bonus: Create your multiplication method without the * operator (Hint: a loop might be helpful).
//            Do the above with recursion.

//        public static long addS(int a, int b){
//        return a + b;
//        }
//        public static long subS(int a, int b){
//            return a - b;
//        }
//        public static long mulT(int a, int b){
//            return a * b;
//        }
//        public static long divI(int a, int b){
//            return a / b;
//        }


//    TODO:2. Create a method that validates that user input is in a certain range
        public static int getInteger(int min, int max){
        Scanner scanner =  new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        if (input < min){
            System.out.println("please enter a valid higher number");
            return getInteger(min,max);
        } else if (input > max){
            System.out.println("Please enter a valid lower number ");
            return getInteger(min, max);
        }
            System.out.println("Thank you");
        return input;
        }

//        TODO: 3Calculate the factorial of a number
    public static void factorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number whose factorial is to be found: ");
        int n = scanner.nextInt();
        int result = factorial(n);
        System.out.println("The factorial of " + n + " is " + result);
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }


//TODO: 4.Create an application that simulates dice rolling.

//        public static void rollTheDice(){
//            Scanner scan = new Scanner(System.in);
//            System.out.println("How many sides does your dice have?");
//            int sides = scan.nextInt();
//            scan.nextLine();
//            System.out.println("Ready to Roll? (Y/N)");
//            String answer = scan.nextLine();
//            if(answer.equalsIgnoreCase("Y")){
//                Random random = new Random();
//                int rolled = random.nextInt(sides + 1);
//                System.out.println("Your number is: " + rolled);
//                return;
//            }
//            System.out.println("GoodBye.");
//            return;
//
//    }
//        }

        public static  void multLoop() {
            // BigInteger object to store result
            BigInteger mult;
            // For user input
            // Use Scanner or BufferedReader
            // Two objects of String created
            // Holds the values to calculate the multiplication
            String input1 = "3";
            String input2 = "3";
            // Convert the string input to BigInteger
            BigInteger a
                    = new BigInteger(input1);
            BigInteger b
                    = new BigInteger(input2);
            // Using multiply() method
            mult = a.multiply(b);
            // Display the result in BigInteger
            System.out.println("The multiplication of\n"
                    + a + " \nand\n" + b + " "
                    + "\nis\n" + mult);
        }
}
//public -- this is the visibility modifier.
//This defines whether or not other classes can see this method. For now, just put public here.
