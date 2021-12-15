package IfStatement;

import java.util.Scanner;

public class DaysOfWeek1 {
    public static void main(String[] args) {
        /*
        ask user enter first letter of the day
        print: M--->Monday, T--->Tueasday or Thursday, W-->Wednesday
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a letter");
        String letter = input.nextLine();
        if (letter.equalsIgnoreCase("m")) {
            System.out.println("Monday");
        }
        if (letter.equalsIgnoreCase("t")) {
            System.out.println("It is either Tuesday or Thursday");
        }
        if (letter.equalsIgnoreCase("W")) {
            System.out.println("Wednesday");
        }
        if (letter.equalsIgnoreCase("T")) {
            System.out.println("It is either Tuesday or Thursday");
        }
        if (letter.equalsIgnoreCase("f")) {
            System.out.println("Friday");
        }
        if (letter.equalsIgnoreCase("S")) {
            System.out.println("It is either Saturday or Sunday");
        }
        if (letter.equalsIgnoreCase("S")) {

            System.out.println("It is either Saturday or Sunday");

        }
        //if its more than one condition it will print out else also
        //if it was one condition then it will only print which one is truep
        else{
            System.out.println("Your entry is invalid");
        }

    }
}

