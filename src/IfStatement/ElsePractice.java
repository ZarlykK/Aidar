package IfStatement;

import java.util.Scanner;

public class ElsePractice {
    public static void main(String[] args) {
        /*
        ask user integer value
        check and print if the number is even
        otherwise print odd number
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Pleas enter an integer value");
        int number=input.nextInt();

        if(number%2==0){
            System.out.println("Your number is even "+number);
        }
        else{
            System.out.println("Your number is odd "+number);
        }
    }
}
