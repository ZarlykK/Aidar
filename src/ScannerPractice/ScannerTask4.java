package ScannerPractice;

import java.util.Locale;
import java.util.Scanner;

public class ScannerTask4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your first name");
        String firstName= scanner.nextLine();
        System.out.println("Please enter your last name");
        String lastName=scanner.nextLine();
        //firstName= firstName.toUpperCase();
        //lastName= lastName.toLowerCase();
        System.out.println(firstName.toLowerCase() + lastName.toUpperCase());
    }
}
