package String;

public class Substring {
    public static void main(String[] args) {
        String string = "I will do it SOON";
        // print out last 3 chars
        String str=string.substring(string.length()-3);
        System.out.println(str);

        String string1="Ava";
       String str2=string1.substring(string1.length()-3);
        System.out.println(str2);
        //Does not have enough value to take substring thus error
        // index starts from zero && length is from 1
    }
}
