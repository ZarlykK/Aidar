package Loops;

public class DoWhilePracticeBatch10 {
    public static void main(String[] args) {
        int number=10;// down to zero

        do {
            System.out.println(number);
            number--;//increment or decrement is for update the number

        }while (number>=0);

       //////////////////////////////

       number = 10;
        do {//even though its false it will work once at least
            System.out.println(number);
            number--;//increment or decrement is for update the number

        }while (number<0);

        //find the numbers from 10 to 15 and
        //print the result as  "The total is ...."

        int total=0;
        int number1=10;
        do{
            total+=number1;
            number1++;
           // System.out.println("Total is "+total);

        }while(number1<=15);
        System.out.println("Total is "+total);

    }
}
