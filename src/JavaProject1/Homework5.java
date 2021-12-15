package JavaProject1;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        //Write a program that will accept 5 digit number and
        //will print reversed number at the end.
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 5 digit number");
        int number=input.nextInt();
        int firstNumber = number%10;
        number=number/10;
        int secondNumber=number%10;
        number=number/10;
        int thirdNumber=number%10;
        number=number/10;
        int fourthNumber=number%10;
        number=number/10;
        int fifthNumber=number%10;
        number=number/10;
        System.out.println(""+firstNumber+secondNumber+thirdNumber+fourthNumber+fifthNumber);



    }
}


