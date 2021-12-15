package Loops;

import java.util.Scanner;

public class Practice4Batch10 {
    public static void main(String[] args) {
        /*
        user has $100
        as long as user has balance more than $0
        ask user that how much money she wants to spend
        if the amount is less than balance
        update the balance and show it to user
        if the amount is more than the balance
        print "you don't have enough money in the account!! your balance is.."
         */




        Scanner input=new Scanner(System.in);
        double balance=100;

        while(balance>0){// this condition will determine
            System.out.println("How much money you want to spend");//should be in the loop
            double spend= input.nextDouble();

            if(spend<=balance){
                balance-=spend;
                System.out.println("Your new balance is: "+balance);
            }else{
                System.out.println("you don't have enough money in the account!! your balance is.. "+balance);
            }
        }

    }
}
