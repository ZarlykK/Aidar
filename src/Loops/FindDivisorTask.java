package Loops;

import java.util.Scanner;

public class FindDivisorTask {
    public static void main(String[] args) {
        //ask user integer and find divisors of that value.
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter an integer");
        int num=input.nextInt();
        int divisor = 1;


        while(divisor<=num){
            if(num % divisor == 0){
                System.out.println(divisor+ " is divisor of "+ num);
                //divisor++;
            }
            divisor++;//when its false then it will go outside of the curly braces
                      //10/1 true 10/2 true then 10/3 false so go outside and divisor++
        }

    }
}
