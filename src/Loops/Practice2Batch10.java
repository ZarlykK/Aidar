package Loops;

public class Practice2Batch10 {
    public static void main(String[] args) {
        /*
        print out "I am here today"
        for the ages from 23 to 26
        after and before 26 print ---> "I am not here"
         */
        int age=23;
//        System.out.println("I am not here");

        while(age<=26){

            System.out.println("I am here");
            age++;
        }
        System.out.println("I am not here");

        // print out between 10 to 20
        int num=10;
        while(num<21){
            System.out.println("The number is now---> "+num);
            num++ ;
        }

        }


    }

