package primitives;

import java.sql.SQLOutput;

public class ArithmeticPractice {

    public static void main(String[] args) {

        // addition -- +
        int num1 = 3;
        int num2 = 4;
        System.out.println("Total is: "+ (num1+num2));

       int sum = num1 + num2;
        System.out.println(sum);

        // subtraction

        int difference;
         difference = 10 - num2;
        System.out.println("difference is = "+ difference);

        // multiplication

        double product = difference * num2;
        System.out.println(product);

        // division

        double division = product / 3;
        System.out.println(division);

        product = product * division;
        System.out.println(product);

        int division2 = 5/2;
        System.out.println(division2);

        double division3 =  5/2d;
        System.out.println(division3);

        float division4 = 5/2f;
        System.out.println(division4);


    }
}
