package Loops;

public class DoWhilePractice1 {
    public static void main(String[] args) {
        //find and show numbers 10-20;
        int number = 10;
        int number1=20;
        int sum = 0;
        do{
            sum+=number;
            number++;
        }while(number<number1);
        System.out.println("sum is: "+sum);
    }
}
