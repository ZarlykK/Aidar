package Loops;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=scanner.nextInt();
        int multiplier=1;

        while(multiplier<=10){
            System.out.println(number +"*"+ multiplier +"="+ (number * multiplier));
            multiplier++;
        }

    }
}
