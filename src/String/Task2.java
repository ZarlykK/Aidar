package String;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /* Ask user a String value should have space at the beginning and at the end
        Replace all letters 'a's with single '*' and letter 'e's with double '**',
        change all string value to uppercase
        find index of first '*'
         multiply that value by 10 and print out*/
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please give some value? ");
       String text = scanner.nextLine();
        System.out.println(text);
        text = text.trim();
        System.out.println(text);

        text = text.replace('a', '*');
        System.out.println(text);
        text = text.replace("e", "**");
        System.out.println(text);
        int text2= text.indexOf('*');                       ///takes from left to right
        ////text2 = text.indexOf('*', 5) it will start looking star after index 5
        ///if you want second star then text.indexOf('*')+1
        System.out.println(text2);
        System.out.println(text2*10);
        /////////// find and print out middle chars index number
       int index = text.indexOf(text.charAt(text.length()/2));//
        //int index = text.indexOf(text.charAt((text.length()-1)/2));
        System.out.println(index);







    }
}
