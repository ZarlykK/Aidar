package Array;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {

        int[] studentIds=new int[5];
        studentIds[0] = 21;//zero index number, in first index I want to put a student 21(ids)
        studentIds[1] = 31;//second student
        studentIds[2]=41;//third student, 2 seats are available since I had 5 seats
//        studentIds[3]=51;
//        studentIds[4]=61;
//        System.out.println(studentIds); it will print out memory location for the array
        System.out.println(studentIds[0]);
        System.out.println(studentIds[1]);
        System.out.println(studentIds[2]);
        System.out.println(studentIds[3]);//no one is there so default zero
        System.out.println(studentIds[4]);

        studentIds[1]=99;//reassigning
        System.out.println(studentIds[1]);

//        studentIds[5] = 51; you can not put more than you have
//        System.out.println(studentIds[5]);
//        System.out.println(studentIds[5]); out of bound out of the capacity
        System.out.println("========================");
        for(int i=0; i<studentIds.length; i++){

            System.out.println(studentIds[i]);

        }
        System.out.println("***************");
        System.out.println(Arrays.toString(studentIds));
//        System.out.println(studentIds); shows memory location --  [I@1b6d3586

    }
}
