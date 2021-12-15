package ScannerPractice;

import java.util.Scanner;

public class ScannerPractice0 {
    public static void main(String[] args) {
        //creating Scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = input.nextLine();
        System.out.println("Please enter your lastname");
        String lastname = input.nextLine();
       System.out.println("Please enter your city name? ");
        String cityName = input.nextLine();
        System.out.println("Please enter your age");
        int age = input.nextInt();
        System.out.println(name + " your age is very good age. That is >> "+age);
        System.out.println("Please enter your height in feet and inches");
        double height = input.nextDouble();
        System.out.println("your height is "+height);
        //////since you are using different data input reassign
        //// input = new Scanner(System.in); || input.nextLine();
        input = new Scanner(System.in);
        System.out.println("Please enter your address");
        String address = input.nextLine();
        System.out.println("Is this your address "+address);



    }
}
