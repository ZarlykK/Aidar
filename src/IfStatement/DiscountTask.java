package IfStatement;

public class DiscountTask {
    public static void main(String[] args) {
        /*
        if your payment is $1000 or more you will get 20% discount
        otherwise you will get 5%
        print total discount
         */
        double payment=2000;

        if (payment>1000) {
            payment-=payment*0.2;
            System.out.println("Your payment after 20% discount is "+payment);
        }

        else {
            payment-=payment*0.05;
            System.out.println("Your payment after 5% discount is: "+payment);
        }

    }
}
