package Loops;

public class PerfectNumber {
    public static void main(String[] args) {
        //perfect number
        //if sum of the divisors(except number itself) equals to number, it is called perfect number >ex:28
        //divisors of 28 --- 1,2,4,7,14


        int num=28;
        int sum=0;
        for( int divisor=1;divisor<=num/2;divisor++){

          if(num%divisor==0){
              sum+=divisor;
//              System.out.println(sum); if you put here it will show every iteration

          }

        }
        if(num==sum){
            System.out.println(num  + " is a perfect number");
        }else{
            System.out.println(num + " is NOT a perfect number");
        }

    }
}
