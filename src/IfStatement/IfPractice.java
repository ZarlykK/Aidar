package IfStatement;

import java.util.Scanner;

public class IfPractice {
    public static void main(String[] args) {
        /*
        assume that the user is using military style time 1-24
        print out good morning/good afternoon
        for the hours of morning or afternoon
        ask the user to enter only hour for the time
        if the hour is less than 12 print good morning
        if the hour is more than 12 less than 18 print good afternoon
        if the hour more than 18 print good evening
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the time between 1 to 24");
        int number = (int) scanner.nextDouble();
        if (number < 12 && number > 0) {
            System.out.println("Good Morning");
        }
        if (number >= 12 && number < 18) {
            System.out.println("Good Afternoon");
        }
        if (number >= 18 && number < 24) {
            System.out.println("Good Evening");
        } else if (number <= 0 && number >= 24) ;
        {
            System.out.println("check your time");
        }
    }
}
