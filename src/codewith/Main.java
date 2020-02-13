package codewith;

import java.awt.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        int[][] primes = new int[3][3];
        primes[2][2] = 1;

        System.out.println(primes[1][2]);
    }
//      NumberFormat currency =  NumberFormat.getCurrencyInstance();
//      String result = currency.format(1234567.891);
//        System.out.println(result);
//        $1,234,567.89
//        NumberFormat percent =
//        String result = NumberFormat.getPercentInstance().format(0.1);
//        String result = percent.format(0.1);
//        System.out.println(result);

//       int result = (int)(Math.random() * 100);
//        System.out.println(result);
//         used to compare integers
//        int x = 1;
//        int y = 1;
////        returns true
//        System.out.println(x==y);
////        represents false
//        System.out.println(x!=y);
//        int temperature = 85;
//        boolean isWarm = temperature > 85 && temperature < 100;
//        System.out.println(isWarm);

//        boolean hasHighIncome = true;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecord = false;
//        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
// will be true due to the bang operator
//        System.out.println(isEligible);

//        int temp = 32;
//        if (temp > 30){
//            System.out.println("its a hot day");
//            System.out.println("drink plenty of water");
//        }
//            else if (temp > 20)
//            System.out.println("beautful Day");
//            else
//            System.out.println("cold day");

//            int income = 120_000;
//            String className = income > 100_000 ? "First" : "Economy";
//        System.out.println(className);

//        String role = "admin";
//        if (role == "admin")
//            System.out.println("You're an admin");
//        else if (role =="moderator")
//            System.out.println("you're a moderator");
//        else
//        System.out.println("you're a guest");
//
//        int role1 = 1;
//        switch (role1)   {
//            case 1 :
//                System.out.println("YOu're an admin");
//                break;
//            case 2:
//                System.out.println("you're a moderator");
//                break;
//            default:
//                System.out.println("You're a guest");
//        }
//// fizz buzz challenge
//       Scanner scanner = new Scanner(System.in);
//        System.out.print("Number: ");
//        int number = scanner.nextInt();
//        if (number % 15 ==0)
//            System.out.println("FizzBuzz");
//        else if (number % 3 == 0)
//            System.out.println("Buzz");
//        else if (number % 5 == 0)
//            System.out.println("Fizz");
//        else System.out.println("number isn't divisible");
// loops for loop
//        for (int i = 5; i > 0 ; i--) {
//            System.out.println("Hello World " + i);
//        }
//// While loops dont know how many times we want to repeat something
//        int i = 0;
//        while(i > 0){
//            System.out.println("Helllo World " +i);
//            i--;
//        }
//        String input = "";
//        while (true){
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            if (input.equals("pass"))
//                continue;
//            if (input.equals("quit"))
//                break;
//                System.out.println(input);
//        }

//        DO While loop
//        do {
//            System.out.println("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        } while (!input.equals("quit"));

//        for each
//        String[] fruits = { "apple", "mango", "orange"};
////        for (int i = 0; i < fruits.length ; i++) {
////            System.out.println(fruits[i]);
////        }
////        for each loop issues can only go foward, dont have index of the array
//        for (String fruit : fruits)
//            System.out.println(fruit);
//
//
//
//
//    }

}
