import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.DecimalFormat;


public class ConsoleExercises {
    public static void main(String[] args) {
//        System.out.println("Console Exercises");
////   TODO: 1. Copy this code into your main method:
//        double pi = 3.14159;
////   TODO: Write some Java code that uses the variable pi to output the following:
//        float almostPi = (float) pi;
//        System.out.format("The value of pi is approximately. %.2f\n", almostPi);
//
////        TODO: 1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method

//            Scanner in = new Scanner(System.in);
//            int integer;
//            System.out.print("Enter an integer: ");
//            integer = in.nextInt();
//            System.out.format("Here is what you entered: %d\n", integer);
//            System.out.println(integer);

//          Class example
        Scanner scanner = new Scanner(System.in);
            int i = 0;
            while(i != -1){
                System.out.print("Enter an integer: ");
                try {
                    i = scanner.nextInt();
                    System.out.println("\nThe number is " + i + ".\n");
                }catch (InputMismatchException ime){
                    System.out.println("This is not an integer");
                    i=0;
                }
            }


////        TODO: 2. Prompt a user to enter 3 words, and store each of them in a separate variable.
////        Then, display them back in the console, each on a newline.
////                What happens if you enter less than 3 words?
////                What happens if you enter more than 3 words?
//
//        Scanner scannerA = new Scanner(System.in);
//        System.out.print("Enter 3 words: ");
//        String userInput = scannerA.next();
//        String userInput2 = scannerA.next();
//        String userInput3 = scannerA.next();
//
//        System.out.println("You entered: --> \"" + userInput + " " + userInput2 + " " + userInput3 + "\" <--");
//
//
////        TODO: 3 Prompt a user to enter a sentence, then store that sentence in a String variable
////         using the next method. Then, display that sentence back to the user.
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter a sentance: ");
//        String userSentence = scanner.nextLine();
//
//        System.out.println("You entered: --> \"" + userSentence + "\" <--");

//        TODO: Prompt the user to enter values of length and width of a classroom at Codeup.
//        Use the nextLine method to get user input and [parse] the resulting string to a numeric type.
//        Assume that the rooms are perfect rectangles.
//        Assume that the user will enter valid numeric data for length and width.
//        TODO: BONUS Accept decimal entries.
//        TODO: BONUS Calculate the volume of the rooms in addition to the area and perimeter.
        float length, width, height, area, perimeter, volume;

//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the length of the classroom: ");
//        length = in.nextFloat();
//        System.out.println("Enter the width of the classroom: ");
//        width = in.nextFloat();
//        System.out.format("Enter the height of the room: ");
//        height = in.nextFloat();
//        area = length * width;
//        perimeter = 2 * (length + width);
//        volume = length * height * width;
//        System.out.printf("Area of the Room : %.2f\n", area );
//        System.out.printf("Perimeter of the Room : %.2f\n", perimeter);
//        System.out.printf("Volume of the room: %.2f\n", volume);



    }
}
// should we stay within the same public class for each function
// difference between all the print functions