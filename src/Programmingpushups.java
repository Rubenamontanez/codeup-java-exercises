import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programmingpushups {
    public static String compareNumbers(double a, double b){
        if (a > b){
            return a + " > " + b;
        }else if (a < b){
            return a + " < " + b;
        }else
            return a + " == " + b;
    }

    public static ArrayList<ArrayList<Integer>>crazyProblem(){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i <result.size(); i++){
            sum ++;
        }
        return result;
    }
    public static String[] addEnding(String[] arr, String ending) {
        for (int i=0; i<arr.length; i++){
            arr[i] += ending;
        }
        return arr;
    }

    public static void main(String[] args) {


//        String[] persons = {"html", "css", "javascript", "java"};
//
//        for (int i = 0; i < persons.length; i += 1)
//            System.out.println(persons[i]);
//
//        System.out.println(intToRealDivide(4,0));
//        ArrayList<String> persons = new ArrayList<>();
//        persons.add("by");
//        persons.add("make");
//        persons.add("take");
//
//        String[] words = {"Hello there ", "Today is Monday ", "4 days to go"};
//        System.out.println(words[0]);
//        System.out.println(words[1]);
//        System.out.println(words[2]);
    }
//    public static double intToRealDivide(int divisor, int dividend) throws ArithmeticException{
//        double quotient = 0.0;
//
//        if (dividend == 0){
//            throw new ArithmeticException("Attempt to divided by zero, intToRealDivide");
//        }
//        quotient = (double) divisor / dividend;
//        return quotient;
//    }
    }


