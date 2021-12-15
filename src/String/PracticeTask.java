package String;

import java.util.Scanner;

public class PracticeTask {
    public static void main(String[] args) {
        // get string
        // - first char
        // last char
        //index of second matching letter 'c'
        //length of string
        //index of x
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a String value ");
        String value = scanner.nextLine();
        System.out.println(value.charAt(0)); // first char
        System.out.println(value.charAt(value.length()-1)); // last char
        System.out.println(value.indexOf("c", value.indexOf("c")+1));//2nd matching letter c
        System.out.println(value.length());
        System.out.println(value.indexOf("x"));




    }
}
