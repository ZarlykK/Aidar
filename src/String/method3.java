package String;

import java.util.Locale;

public class method3 {
    public static void main(String[] args) {
        String str = "Selenium";
        // . toUpperCase; // it will convert all string to upper case
        str = str.toUpperCase();
        System.out.println(str);
        //toLowerCase(); it will convert all to lower case
        str = str.toLowerCase();
        System.out.println(str);//or sout(str.toLowerCase());
        String a = "" +str.charAt(0); // this is making the rest as a String
                                     // by putting empty double quotation
        a = a.toUpperCase();
        System.out.println(a);

        String word = "do whatever it takes";
        boolean result = word.startsWith("do");
        System.out.println(result);
        boolean result2 = word.endsWith("takes");
        System.out.println(result2);

    String text = "Techtorial";
        System.out.println(text.contains("t"));




}
}