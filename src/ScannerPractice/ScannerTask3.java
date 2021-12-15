package ScannerPractice;

import java.util.Scanner;

public class ScannerTask3 {
    public static void main(String[] args) {

        // if a char is not an english letter
        //code should print false
        //if user enters english letters code should print true

        //ASCII table
        // The table that all chars has unique value
        int charvalueA = 'a';
        System.out.println("CharValueA");
        char a = 97;
        char a2 = 'a';
        System.out.println(a);
        // If the value between a and z
        //it means the char is letter
        System.out.println("Please enter a char letter");
       char ch = '9';
       // if this char is a letter or not
      boolean isLetter = ch>='a'&& ch<='z';
        System.out.println(isLetter);



}
}