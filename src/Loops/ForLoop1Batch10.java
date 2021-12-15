package Loops;

public class ForLoop1Batch10 {
    public static void main(String[] args) {


        for (int num = 0; num <= 2; num++) {// so you can update ur number inside or
            //outside as long as its inside the curlybraces// condition inside, this local inside
            System.out.println("It is for loop " + num);

        }
        int num = 0;//this belong to everybody
        for (; num <= 5; num++) {//condition inside
            System.out.println("It is second for loop " + num);
        }
        for(;num<=6;){//this side won't show because it is false on the second part num is increased to 5 and
            // now number is 5

            System.out.println("It is third for loop "+num);
            num++;
        }
        for(int n=5; n>=0;--n ){//it will start from 4 because condition is true and is going down to sout
//            --n; if you put here it will update and starts from 4
            System.out.println(n);
        }


    }
}
