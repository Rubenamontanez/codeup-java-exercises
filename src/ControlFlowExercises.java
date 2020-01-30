import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;


public class ControlFlowExercises {
    public static void main(String[] args) {

//        TODO: Loop Basics While Create an integer variable i with a value of 5.
//         Create a while loop that runs so long as i is less than or equal to 15Each loop iteration,
//         output the current value of i, then increment i by one.
//         Your output should look like this:5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i ++;
//        }
//        System.out.println(" ");

//        TODO: Do While Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//        int count = 0;
//        do
//        {
//            System.out.println(count);
//            count = count += 2;
//        } while (count < 100);
//        System.out.println();

//        TODO: Alter your loop to count backwards by 5's from 100 to -10.
//        int fives = 100;
//        do
//        {
//            fives = fives -= 5;
//            System.out.println(fives);
//
//        }while (fives > -10);
//        System.out.println();

//        TODO: Create a do-while loop that starts at 2, and displays the
//         number squared on each line while the number is less than 1,000,000. Output should equal:
//        int i = 2;
//        do
//        {
//            System.out.println(i);
//            i = (int) Math.pow(i,2);
//        }while (i < 1000000);
//        System.out.println();

//        TODO: Display a table of powers.
//         Prompt the user to enter an integer.
//         Display a table of squares and cubes from 1 to the value entered.
//         Ask if the user wants to continue.Assume that the user will enter valid data.
//         Only continue if the user agrees to.

//            int number,square,cube;
//            System.out.print(" What number would you like to go up to: ");
//            Scanner scanner = new Scanner(System.in);
//             number = scanner.nextInt();
//        System.out.print("\n");
//             System.out.println("Here is your table");
//        System.out.print("\n");
//            System.out.println("number | squared | cubed ");
//            System.out.println("-----  | ------- | ----- "  );
//           for(int i = 1; i <= number;  i ++) {
//               square = i * i;
//               cube = i * square;
//               System.out.println(i + "      |" + square + "        |" + cube);
//           }

//           TODO: Convert given number grades into letter grades.
//            Prompt the user for a numerical grade from 0 to 100.
//            Display the corresponding letter grade.Prompt the user to continue.
//            Assume that the user will enter valid integers for the grades.
//            The application should only continue if the user agrees to.
//            Grade Ranges:A : 100 - 88 B : 87 - 80 C : 79 - 67 D : 66 - 60 F : 59 - 0

//        int testScore;
//        System.out.print(" What was your test grade: ");
//        Scanner scanner = new Scanner(System.in);
//        testScore = scanner.nextInt();
//           String grade;
//
//           if (testScore>= 95){
//               grade = "A+";
//           }else if (testScore>= 88){
//               grade = "A-";
//           } else if (testScore>=84){
//               grade = "B+";
//           }else if (testScore>= 80){
//               grade = "B-";
//           }else if (testScore>=73){
//               grade = "C+";
//           }else if (testScore>=67){
//               grade = "C-";
//           }else if (testScore>=64){
//               grade = "D-";
//           }else if (testScore>=60){
//                grade = "D-";
//           } else {
//               grade = "F";
//           }
//        System.out.println("you got an: " + grade);
//        System.out.println("Would you like to continue?");




                long n = 461012;
                System.out.format("%d%n", n);      //  -->  "461012"
                System.out.format("%08d%n", n);    //  -->  "00461012"
                System.out.format("%+8d%n", n);    //  -->  " +461012"
                System.out.format("%,8d%n", n);    // -->  " 461,012"
                System.out.format("%+,8d%n%n", n); //  -->  "+461,012"
    }
}



// boolean expression are true false, when comparing objects use the .equals() for string comparisons
// trant batey

