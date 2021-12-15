package ScannerPractice;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = input.nextLine();
        System.out.println("Your name is " + name);
        System.out.println("Please enter your full name");
        String fullName = input.nextLine();
        System.out.println("Your full name is "+ fullName);

        String middleName;
        System.out.println("Please enter your middle name");
        middleName = input.nextLine();
        System.out.println("Your middle name is "+ middleName);

        System.out.println("Please enter your city name");
        name = input.nextLine();

        //// input.nextline - takes whole text whatever you write
        // input.next - takes a word before the space
        System.out.println("What's your state? ");
        char firstLetter = input.next().charAt(0);
        System.out.println(firstLetter);

}
}




