package ScannerPractice;

import java.time.LocalDateTime;
import java.util.Scanner;

public class ScannerPractice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = input.nextLine();
        System.out.println("Please enter you DOB");
        int DOB = input.nextInt();
        int result = LocalDateTime.now().getYear() - DOB;
        System.out.println("your current age is "+result);
        input.nextLine();
        int currentYear = LocalDateTime.now().getYear();
        System.out.println(currentYear);
        int currentMinute = LocalDateTime.now().getMinute();
        int currentSecond = LocalDateTime.now().getSecond();
        System.out.println(currentMinute);
        System.out.println(currentSecond);

    }
}
