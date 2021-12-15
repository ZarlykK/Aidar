package Loops;

import java.util.Scanner;

public class StringLetter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please provide a string");
        String word= scanner.nextLine();
        int i=0;

        while(i<word.length()){
                System.out.print(word.charAt(i)+", ");
            i++;
        }
        //print those letters reverse
        System.out.println();
        int lIndex = word.length()-1;
        while(lIndex>=0){
            System.out.print(word.charAt(lIndex)+", ");
            lIndex--;
        }


        }



    }

              // how many lower letter strings in a given sentence