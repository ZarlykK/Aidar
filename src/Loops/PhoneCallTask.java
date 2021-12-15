package Loops;

public class PhoneCallTask {
    public static void main(String[] args) {
       /*
       -you have $40 in your international phone calling account
  -if every call you make costs $5
  -find out and print: how many total calls you can make with your balance of $40
    ex. print out --> "you can make <...> calls with your balance"
        */









        int balance=40;
        int eachCall=5;
        int count=0;
        while(balance>0){
            balance-=eachCall;

            System.out.println("your balance now: "+balance);
            count++;
        }
        System.out.println("you can make "+count+" calls with your balance");
    }
}
