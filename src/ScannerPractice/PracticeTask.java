package ScannerPractice;

import java.util.Scanner;

public class PracticeTask {
    public static void main(String[] args) {
        /* by using scanner ask user
        to provide their height and weight
        and calculate their BMI
        Formula ----> BMI = weight/(height*height)
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Please provide your height: ");
        double height = input.nextDouble();
        System.out.println("Please provide your weight ");
        double weight = input.nextDouble();
        double BMI = weight/(height *height);
        System.out.println("Your BMI is: "+BMI);













    }
}
