package IfStatement;

import java.util.Scanner;

public class ElsePractice3 {
    public static void main(String[] args) {
        /*
        get three test results from user and calculate the average of those three tests
        based on the average score:
        average--> 100-90--> you letter grade is A
        average--> 89-80--> you letter grade is B
        average--> 100-90--> you letter grade is A
        average--> 79-60--> you letter grade is C
        less than 60 --- you should take the course again
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your first test result");
        double test1=input.nextDouble();
        System.out.println("Please enter your second test result");
        double test2=input.nextDouble();
        System.out.println("Please enter your third test score");
        double test3=input.nextDouble();
        double result=(test1+test2+test3)/3;

        if(result>=90 && result<=100){
            System.out.println("Your letter grade is A");
        }else if(result>80 && result<=89){
            System.out.println("Your letter grade is B");
        }else if(result>60 && result<=79) {
            System.out.println("Your letter grade is C");
        }else{
            System.out.println("You should take the course");
        }
    }
}
