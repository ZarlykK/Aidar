package Loops;

import java.util.Scanner;

public class Practice5Batch10 {
    public static void main(String[] args) {
        /*
        Ask user to give a number
        create a multiplication table from 1 to 10
        5>>>5*1=5
            5*2=10
            5*3=15
            ........
         */


        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a whole number");
        int num=input.nextInt();
        int multiplier = 1;
        while(multiplier<=10){
            System.out.println( num + "*"+multiplier+" = "+num *multiplier);
            multiplier++;
        }
    }
}
