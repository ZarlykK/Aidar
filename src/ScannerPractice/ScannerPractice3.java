package ScannerPractice;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        /* David wants deposit his money into his bank account
       // - he already got 200 in his account
      // - he got three different paycheck (480, 600 , and 350)
      // he can only deposit one paycheck at a time
     //  after he got his money in his account
     // he bought a phone for 599 and headphone for 299
     // calculate his final money in his account
     // open a new class under scanner package and name it as "MoneyTransaction"
         */

        Scanner scanner = new Scanner (System.in);
        double balance = 200;
        System.out.println("Please insert paycheck: ");
        double paycheck1 = scanner.nextDouble();
        balance += paycheck1;
        System.out.println("Your current balance is "+balance);

        System.out.println("Please enter second paycheck: ");
        double paycheck2 = scanner.nextDouble();
        balance+= paycheck2;
        System.out.println("Your current balance is: ");

        System.out.println("Please enter 3rd paycheck: ");
        double paycheck3 = scanner.nextDouble();
        balance+=paycheck3;
        System.out.println("Your current balance is ");

        System.out.println("What's the phone price? ");
        double phonePrice=scanner.nextDouble();
        balance-=phonePrice;
        System.out.println("Your current balance is: ");
        System.out.println("What's the headphone price? ");
        double headphonePrice = scanner.nextDouble();
        balance-=headphonePrice;
        System.out.println("Your current balance is: "+balance);


    }
}
