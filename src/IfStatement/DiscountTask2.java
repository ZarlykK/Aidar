package IfStatement;

public class DiscountTask2 {
    public static void main(String[] args) {
        /*
        payment more than 1000$ you get 20$ discount, otherwise 5% discount
        calculate and print total discount and payment each case
         */
        double total=1000;
        if(total>=1000){
            System.out.println("Your total discount is: "+total*0.20);
            System.out.println("Your payment after %20 discount is: "+ (total-(total*0.2)));
        }else{
            System.out.println("Your total discount/saving is: " +total*0.05);
            System.out.println("Your payment after %5 discount is: "+ (total-(total*0.05)));
        }
    }
}
