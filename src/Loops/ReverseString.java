package Loops;

public class ReverseString {
    public static void main(String[] args) {
        //reverse the given string
        String str = "Lets do it";
        String reverse = "";// this is like a bucket, this is like int zero but string
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println();

            reverse += str.charAt(i);

        }
        System.out.println(str);
        System.out.println(reverse);
    }
}
