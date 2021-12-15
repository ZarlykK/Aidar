package IfStatement;

import java.util.Scanner;

public class ElseIfPractice {
    public static void main(String[] args) {
        /*
        user gives a number
        if the number falls 0-5 --- your number is between 0-5
        if the number falls 6-10 --- your number is between 6-10
        if the number falls 11-16 --- your number is between 11-15
        if the number falls 16-20 --- your number is between 16-20
         */
        Scanner scn = new Scanner(System.in);
        System.out.println("Please pick a number 0 to 20");
        int number = scn.nextInt();
        if (number >= 0 && number <= 5) {
            System.out.println("Your number is between 0 to 5");
        } else if (number >= 6 && number <= 10) {
            System.out.println("Your number is between 6-10");
        } else if (number >= 11 && number <= 15) {
            System.out.println("Your number is between 11-15");
        } else if (number >= 16 && number <= 20) {
            System.out.println("Your number is between 16-20");
        } else {
            System.out.println("Your number does not fall into any range of 0-20");
        }//all  if else conditions dependent with each other that's why even though with many
        //if statements it will print out else condition.
    }
}
