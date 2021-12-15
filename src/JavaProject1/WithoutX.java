package JavaProject1;

import java.util.Scanner;

public class WithoutX {
    public static void main(String[] args) {

        //how can we remove in the String//  substring

        Scanner str=new Scanner(System.in);

        String scanner= str.next();
        String firstLetter=""+scanner.charAt(0);
        String secondLetter=""+scanner.charAt(1);

        if(firstLetter.equals("x")){
            System.out.println(scanner.substring(1));
//        }else if(firstLetter.equals("x")&&secondLetter.equals("x")){
//            System.out.println(scanner.substring(2));
        }else if(secondLetter.equals("x")){
            System.out.println(scanner.substring(0, 1)+scanner.substring(2));
        }

    }
}
//    Given a string, if one or both of the first 2 chars is 'x', print the
//        string without those 'x' chars, and otherwise print the string
//        unchanged.
//        Examples:
//
//        "xHi" → "Hi"
//        "Hxi" → "Hi"
//        "Tesxt" → "Testxt"