package ScannerPractice;

import java.util.Scanner;

public class PracticeChar {
    public static void main(String[] args) {
        String device = "microphone";
        //char ch=device.charAt(0);
        System.out.println(device.charAt(0));

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a word");
        String word= input.nextLine();
        System.out.println("This is first letter of the string " +word.charAt(0));

        System.out.println("Please enter another word");
        //without storing incoming string value taking a letter from it and print
        System.out.println(input.nextLine().charAt(0));




    }

}
