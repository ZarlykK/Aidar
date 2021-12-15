package ScannerPractice;

import java.util.Scanner;

public class ScannerTask2 {
    public static void main(String[] args) {
        // to graduate 85% attendancy
        //80 or more higher grade
        //70 of homework
        // teacher enter all variables
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter attedancy");
        int attendancy = input.nextInt();
        System.out.println("Please enter grade for student");
        int grade = input.nextInt();
        System.out.println("Please enter homework");
        int homework = input.nextInt();

        boolean isPass = attendancy>=85 && grade>=80 && homework>=70;
        System.out.println(isPass);

}
}