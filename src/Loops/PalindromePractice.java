package Loops;

public class PalindromePractice {
    public static void main(String[] args) {
        //if you read left to right right to left read the same like efe
        String str = "civic";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        if (reverse.equals(str)) {
                System.out.println("It is a palindrome string");
            }else {
                System.out.println("Not palindrome");
            }

        }


    }


