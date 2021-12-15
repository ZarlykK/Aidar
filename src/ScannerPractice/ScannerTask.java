package ScannerPractice;

import java.util.Scanner;

public class ScannerTask {
    public static void main(String[] args) {
        // Ask user integer
        // find out if it is odd or even number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide integer number");
        int number = scanner.nextInt();
        //If remainder with 2 gives 0 this number will be even
        //otherwise it is odd
        boolean isEven = number%2 == 0;
        System.out.println(number+" is even number "+isEven);
//--------------------------------------------------------------------------
        // Ask user to enter two integer number
        // First integer you provide should be bigger than second one
        //if first number bigger than second one we will print out true
        //if second number bigger than first number  print out false

        System.out.println("Enter your first integer number");
        int firstNumber = scanner.nextInt();
        System.out.println("please enter an integer smaller than first one");
        int secondNumber = scanner.nextInt();
        boolean isFirstBigger = firstNumber>secondNumber;
        System.out.println(isFirstBigger);

    }
}
