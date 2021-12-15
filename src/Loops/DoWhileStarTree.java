package Loops;

import java.util.Scanner;

public class DoWhileStarTree {
    public static void main(String[] args) {
        //Ask user number 3-10
        //make a star tree for that many line
        //do-while
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please give a number between 3-10");
        int number= scanner.nextInt();
        int x=0;//starting from zero
        String str="*";// so it can print a lot so created String
        // it was char so we reassigned to String because if it was char value then it will not increase

        if(number>=3 && number<=10){

        do{
            //if str+="*" it will start from 2
            System.out.println(str);
            str+="*";//in order to start from 1 it will be after sout
            x++;
        }while(x<number);
        }
    }
}
