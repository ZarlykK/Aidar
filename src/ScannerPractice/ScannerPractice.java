package ScannerPractice;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String firstName = "Fluffy";
        System.out.println("Please enter your last name");

        String lastName = "Brown";
        System.out.println(lastName);

        System.out.println("Please enter your last name again");
        lastName = input.nextLine();
        System.out.println(lastName);

        String middleName;
        System.out.println("Please enter your middle name");
        middleName = input.nextLine();
        System.out.println(firstName +" "+ middleName +" "+ lastName);

        int number;
        number = 10;
        /* 1. The variable must begin with a letter or $ or _
        2. We can use number only at the end of the variable name
        3. We can not use same variable name two times under same block
        4. We can not use same as Java reserved words.
        (50 words: public, static, void, etc.)
         */







    }
}
