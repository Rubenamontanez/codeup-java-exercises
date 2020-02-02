package util;

import java.util.Scanner;

public class Input {
//    TODO:Inside of util, create a class named Input that has a private property named scanner.
    private Scanner scanner;

//    TODO: When an instance(means inside this class of input) of this object is created,
//     the scanner property should be set to a new instance of the Scanner class.
    public Input(){
        this.scanner = new Scanner(System.in);
    }
    public String getString(){
        String answer;
        System.out.println("type out a string: ");
        answer = this.scanner.next();
        return answer;
    }

    public boolean yesNo(){
        String answer;
        System.out.println("is it a boolean?;");
        answer =this.scanner.next();
        return answer.toLowerCase().startsWith("y");
    }

    public int getInt (int min, int max){
        int answer;
        do
        {
            System.out.println("enter a number between" + min + " and " + max);
            answer = this.scanner.nextInt();
        } while  (answer < min || answer > max);
         return answer;
        }

    public int getInt(){
        System.out.println("Give me a number: ");
        int number;
        try{
            number = Integer.valueOf(getString());
            return number;
        } catch (NumberFormatException nfe){
            System.out.println("Wrong input, try again: ");
            return getInt();
        }
    }

    public double getDouble(double min, double max) {
        double number = getDouble();
        if(number < min){
            System.out.println(String.format("Number outside of range (%f - %f)", min, max));
            return getDouble(min, max);
        } else if (number > max) {
            System.out.println(String.format("Number outside of range (%f - %f)", min, max));
            return getDouble(min, max);
        }

        return number;
    }
    public double getDouble(){
        System.out.println("Give me a decimal: ");
        double number;
        try{
            number = Double.valueOf(getString());
            return number;
        } catch (NumberFormatException nfe){
            System.out.println("Wrong input, try again: ");
            return getDouble();
        }
    }

}


// will not compile if nothing is returned